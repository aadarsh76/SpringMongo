package com.microservices.response;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservices.entity.Address;

public class AddressResponse {
	private int employeeId;
	private String lane;
	private String city;
	private String country;
	
	@Autowired
	Address address;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId() {
		this.employeeId = address.getEmployeeId();
	}
	public String getLane() {
		return lane;
	}
	public void setLane() {
		this.lane = address.getLane();
	}
	public String getCity() {
		return city;
	}
	public void setCity() {
		this.city = address.getCity();
	}
	public String getCountry() {
		return country;
	}
	public void setCountry() {
		this.country = address.getCountry();
	}
	
}
