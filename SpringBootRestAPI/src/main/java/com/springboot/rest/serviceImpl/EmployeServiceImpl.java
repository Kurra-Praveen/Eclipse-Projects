package com.springboot.rest.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.rest.exception.ResourceNotFoundException;
import com.springboot.rest.model.Employee;
import com.springboot.rest.repositary.EmployeeRepository;
import com.springboot.rest.service.EmployeeServeice;

@Service
public class EmployeServiceImpl implements EmployeeServeice{

	private EmployeeRepository employeeRepository;
	
	
	
	public EmployeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		
		
		return employeeRepository.save(employee);
	}



	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}



	@Override
	public Employee getEmployeeById(long id) {
		
		Optional<Employee> emp= employeeRepository.findById(id);
		
		if(emp.isPresent()) {
			
			return emp.get();
			
		}else {
			
			throw new ResourceNotFoundException("Employee", "Id", id);
		}
	}



	@Override
	public Employee updateEmployee(Employee employee, long id) {
		
		//check weather the employee is existing or not with given id
		
		Employee existingEmployee=employeeRepository.findById(id).orElseThrow(
				
				()->new ResourceNotFoundException("Employee", "Id", id));
		
		existingEmployee.setFirstName(employee.getFirstName());
		
		existingEmployee.setLastName(employee.getLastName());
		
		existingEmployee.setEmail(employee.getEmail());
		
		//save the employee
		
		employeeRepository.save(existingEmployee);
		
		return existingEmployee;
	}



	@Override
	public void deleteEmployee(long id) {
		
		//check weather the employee is existing or not with given id
		
		employeeRepository.findById(id).orElseThrow(
				
				  ()->new ResourceNotFoundException("Employee", "Id", id));
		
		employeeRepository.deleteById(id);
		
	}

}
