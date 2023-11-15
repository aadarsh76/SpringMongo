package com.microservices.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.entity.Address;
import com.microservices.repository.AddressRepository;
import com.microservices.response.AddressResponse;

@Service
public class ServiceClass {

	@Autowired
	AddressRepository addRepo;
	
	@Autowired
	private ModelMapper modelMappper;
	
	public AddressResponse getAddressById(int employeeId) {
		Address add=addRepo.findById(employeeId).get();
		
		AddressResponse res=modelMappper.map(add, AddressResponse.class);
		
		return res;
	}
}
