package com.example.demo.Repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.Customer;

import jakarta.annotation.PostConstruct;

	

@Component
public class DataBaseInit {
	
private CustomerRepository customerRepository;
	
	public DataBaseInit(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@PostConstruct
	private void loadData() {
		customerRepository.saveAll(List.of(

				new Customer("joe"),
				new Customer("jone"),
				new Customer("jim")
		));
	}
}
