package com.microservices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.entity.Employee;
import com.microservices.repository.EmployeeRepository;
import com.microservices.response.AddressResponse;
import com.microservices.response.EmployeeResponse;

@Service
public class ServiceClass {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<EmployeeResponse> getAllEmployee() {
		List<Employee> emp=employeeRepo.findAll();
		
		List<EmployeeResponse> empRes=emp.stream()
	            .map(employee -> modelMapper.map(employee, EmployeeResponse.class))
	            .collect(Collectors.toList());
		return empRes;
		
	}
	
	public EmployeeResponse getEmployeeById(int id) {
		Employee employee=employeeRepo.findById(id).get();
		AddressResponse addressResponse=new AddressResponse();
		
		EmployeeResponse empRes=modelMapper.map(employee,EmployeeResponse.class);
		
		empRes.setAddressResposnse(addressResponse);
		
		return empRes;
		
	}
	
}
