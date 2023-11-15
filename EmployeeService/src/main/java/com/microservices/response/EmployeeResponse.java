package com.microservices.response;

import com.microservices.entity.Employee;

public class EmployeeResponse {

    private int id;
    private String name;
    private String email;
    private String role;
    private AddressResponse addressResposnse;

    public AddressResponse getAddressResposnse() {
		return addressResposnse;
	}

	public void setAddressResposnse(AddressResponse addressResposnse) {
		this.addressResposnse = addressResposnse;
	}

	public EmployeeResponse() {
    }

    public EmployeeResponse(Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
        this.email = employee.getEmail();
        this.role = employee.getRole();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
