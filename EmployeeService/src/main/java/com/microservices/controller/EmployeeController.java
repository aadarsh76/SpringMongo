package com.microservices.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.repository.EmployeeRepository;
import com.microservices.services.ServiceClass;


import com.microservices.response.*;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@Autowired
	ServiceClass employeeService;
	
	@GetMapping("/employees")
	public List<EmployeeResponse> getAllEmployee() {
		List<EmployeeResponse> res=employeeService.getAllEmployee();
		
		return res;
	}
	
	@GetMapping("/employee/{id}")
	ResponseEntity<EmployeeResponse> getEmployeeById(@PathVariable("id") int id) {
		EmployeeResponse employeeRes=employeeService.getEmployeeById(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(employeeRes);
	}

}
