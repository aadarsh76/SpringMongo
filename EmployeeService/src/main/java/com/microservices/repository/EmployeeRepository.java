package com.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
