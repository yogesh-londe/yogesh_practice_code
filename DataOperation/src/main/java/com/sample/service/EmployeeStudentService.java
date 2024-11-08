package com.sample.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.EmployeeStudentRepository;
import com.sample.dao.StudentRepository;
import com.sample.model.Employee;
import com.sample.model.EmployeeStudentDTO;
import com.sample.model.Student;

@Service
public class EmployeeStudentService {

	@Autowired
	private EmployeeStudentRepository repository;
	
	@Autowired
	private StudentRepository studentRepository;

	public List<EmployeeStudentDTO> getEmployeeAndStudentData() {
		List<Object[]> results = repository.fecthEmployeeStudentData();
		System.out.println("__________"+results.toString());
		return results.stream().map(row -> new EmployeeStudentDTO((String) row[0], // employeeName
				(String) row[1], // employeePosition
				(String) row[2], // studentName
				(String) row[3] // studentMajor
		)).collect(Collectors.toList());
	}

	public List<Employee> saveEmployees(List<Employee> employees) {
		return (List<Employee>) repository.saveAll(employees);
	}

	public List<Student> saveStudents(List<Student> students) {
		return (List<Student>) studentRepository.saveAll(students);
	}
}
