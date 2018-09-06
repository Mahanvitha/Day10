package com.capgemini.domain;

public class Employee {
	private String empName;
	private double salary;
	private String departmentName;
	private int empId;
	public Employee() {
		super();
	}
	public Employee(String empName, double salary, String departmentName, int empId) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.departmentName = departmentName;
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
}
		