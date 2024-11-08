package com.sample.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sample.model.Employee;
import com.sample.model.Student;

@Repository
public interface EmployeeStudentRepository extends JpaRepository<Employee, Long> {
	@Query(value = "SELECT e.name as employeeName, e.position as employeePosition, s.name as studentName, s.major as studentMajor "
			+ "FROM Employee e, Student s", nativeQuery = true)
	List<Object[]> fecthEmployeeStudentData();

}
