package com.sample.model;

public class EmployeeStudentDTO {
	private String employeeName;
	private String employeePosition;
	private String studentName;
	private String studentMajor;

	public EmployeeStudentDTO(String employeeName, String employeePosition, String studentName, String studentMajor) {
		this.employeeName = employeeName;
		this.employeePosition = employeePosition;
		this.studentName = studentName;
		this.studentMajor = studentMajor;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePosition() {
		return employeePosition;
	}

	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentMajor() {
		return studentMajor;
	}

	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}

}
