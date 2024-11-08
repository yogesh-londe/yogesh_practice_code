package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Employee;
import com.sample.model.EmployeeStudentDTO;
import com.sample.model.Student;
import com.sample.service.EmployeeStudentService;

@RestController
public class EmployeeStudentController {

	@Autowired
	private EmployeeStudentService employeeStudentService;
	

	@GetMapping("/employee-student-data")
	public List<EmployeeStudentDTO> getEmployeeAndStudentData() {
		return employeeStudentService.getEmployeeAndStudentData();
	}

	@PostMapping("/employeeBatch")
	public ResponseEntity<List<Employee>> createEmployees(@RequestBody List<Employee> employees) {
		List<Employee> savedEmployees = employeeStudentService.saveEmployees(employees);
		return new ResponseEntity<>(savedEmployees, HttpStatus.CREATED);
	}

	@PostMapping("/studentBatch")
	public ResponseEntity<List<Student>> createStudent(@RequestBody List<Student> students) {
		List<Student> savedStudents = employeeStudentService.saveStudents(students);
		return new ResponseEntity<>(savedStudents, HttpStatus.CREATED);
	}
}
