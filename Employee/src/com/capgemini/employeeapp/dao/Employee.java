package com.capgemini.employeeapp.dao;

public class Employee {

private int employeeId;
private String employeeName;
private double employeeSalary;

private String employeeDepartment;


public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeID) {
	this.employeeId = employeeID;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
			+ employeeSalary + ", employeeDepartment=" + employeeDepartment + "]";
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public String getEmployeeDepartment() {
	return employeeDepartment;
}
public void setEmployeeDepartment(String employeeDepartment) {
	this.employeeDepartment = employeeDepartment;
}
public Employee(int employeeID, String employeeName, double employeeSalary, String employeeDepartment) {
	super();
	this.employeeId = employeeID;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
	this.employeeDepartment = employeeDepartment;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
