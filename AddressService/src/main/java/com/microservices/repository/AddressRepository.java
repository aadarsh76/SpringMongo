package com.microservices.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.microservices.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

	@Query(value="SELECT ea.id,ea.lane1,ea.city,ea.country FROM `microservices-app`.`address` ea join `microservices-app`.`employee` e on e.id=ea.employeeId where ea.employeeId=1;")
	Address findAddressByEmployeeId(@Param("employeeId") int employeeId);
	
}
