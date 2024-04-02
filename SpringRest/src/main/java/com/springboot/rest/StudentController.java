package com.springboot.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	@GetMapping("/student")
	public Student getStudent() {
		
		return new Student("Praveen", "Kurra");
	}

	@GetMapping("students")
	public List<Student> getStudents(){
		
		List<Student>students=new ArrayList<>();
		
		students.add(new Student("Praveen", "Kurra"));
		
		students.add(new Student("Pavan", "Kurra"));
		
		students.add(new Student("Tarun", "Kurra"));
		
		students.add(new Student("Sattibabu", "Kurra"));
		
		students.add(new Student("Varalakshnmi", "Kurra"));
		
		return students;
		
		
	}
}
