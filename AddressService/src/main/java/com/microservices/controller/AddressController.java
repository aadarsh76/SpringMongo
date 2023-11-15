package com.microservices.controller;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.response.AddressResponse;
import com.microservices.services.ServiceClass;

@RestController
public class AddressController {
	
	@Autowired
	private ServiceClass addressService;

	@GetMapping("/address/{employeeId}")
	public ResponseEntity<AddressResponse> getAddressById(@PathVariable("employeeId") int employeeId){
		
		AddressResponse response=addressService.getAddressById(employeeId);
		
		return ResponseEntity.status(HttpStatus.OK).body(response);
		
	}
	
}
