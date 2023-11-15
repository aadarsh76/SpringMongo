package com.microservices.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.response.AddressResponse;

@FeignClient(name="address-client",url="http://localhots:8081/adddress-app/api/")
public interface AddressClient {

	@GetMapping("/address/{employeeId}")
	public ResponseEntity<AddressResponse> getAddressById(@PathVariable("employeeId") int employeeId);
}
