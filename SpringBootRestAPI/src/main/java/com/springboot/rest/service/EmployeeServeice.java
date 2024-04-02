package com.springboot.rest.service;

import java.util.List;

import com.springboot.rest.model.Employee;
import com.springboot.rest.repositary.EmployeeRepository;

public interface EmployeeServeice {
	

	Employee saveEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(long id);
	
	Employee updateEmployee(Employee employee,long id);
	
	void deleteEmployee(long id);
}
