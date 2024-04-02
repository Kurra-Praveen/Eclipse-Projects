package com.springboot.rest.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.rest.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

}
