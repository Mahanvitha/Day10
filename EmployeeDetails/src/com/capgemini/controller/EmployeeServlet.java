package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.domain.Employee;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ArrayList<Employee> employees=new ArrayList<>();  
    public EmployeeServlet() {
        super();
      
    }
    @Override
    public void init(ServletConfig config)throws ServletException{
	employees.add(new Employee("Mahanvitha", 50000, "java", 1234));
	employees.add(new Employee("tom", 50000, "sap", 123));
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int count =0;
	int employeeNumber=Integer.parseInt(request.getParameter("employeeId"));
		for(Employee emp : employees) {
			if(emp.getEmpId()==(employeeNumber))
			{
				count= 1;
				out.println("<table border='1'><tr><th>Employee Name</th><th>Salary</th><th>Department</th></tr>");
				out.println("<tr><td>"+emp.getEmpName()+"</td><td>"+emp.getSalary()+"</td><td>"+emp.getDepartmentName()+"</td></tr></table>");
			}
			
		}
		if(count==0) {
			out.println("Enter valid EmployeeId");
		}
	   out.close();
	}
		
}
