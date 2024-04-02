package com.springboot.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.model.Employee;
import com.springboot.rest.service.EmployeeServeice;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	private EmployeeServeice employeeServeice;

	public EmployeeController(EmployeeServeice employeeServeice) {
		super();
		this.employeeServeice = employeeServeice;
	}
	
	//build crate employee Rest API
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		
		return new ResponseEntity<Employee>(employeeServeice.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	
	//Get All Employees RestApi
	@GetMapping
	public List<Employee>getAllEmployees(){
		return employeeServeice.getAllEmployees();
	}
	
	
	//Get Employee by Id
	//http://localhost:8080/api/employees/{parametr}
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long id){
		
		return new ResponseEntity<Employee>(employeeServeice.getEmployeeById(id), HttpStatus.OK);
	}
	
	
	//Update employee By id
	@PutMapping("{id}")
	public ResponseEntity<Employee>updateEmployee(@PathVariable("id") long id,@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeServeice.updateEmployee(employee, id), HttpStatus.OK);
	}
	
	//Delete employee by id
	@DeleteMapping("{id}")
	public ResponseEntity<String>deleteEmployee(@PathVariable("id") long id){
		
		employeeServeice.deleteEmployee(id);
		
		return new ResponseEntity<String>("Employee Deleted Sucessfully", HttpStatus.OK);
	}
}
