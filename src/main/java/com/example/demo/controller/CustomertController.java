package com.example.demo.controller;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Customer;
import com.example.demo.service.ConseillerService;
import com.example.demo.service.CustomerService;


@RestController
@RequestMapping("/customers")
public class CustomertController {

	private final CustomerService customerService;
	private final ConseillerService conseillerService;
	
	public CustomertController(CustomerService customerService,ConseillerService conseillerService) {
		// TODO Auto-generated constructor stub
		this.customerService=customerService;
		this.conseillerService=conseillerService;
	}
	
	@GetMapping
	Iterable<Customer> getCustomers() {

		return customerService.getAllCustomers();
	}
	
	@PostMapping("/{id}")
	Customer postCustomer(@RequestBody Customer c, @PathVariable Long id) {

		return customerService.saveCustomer(c,id);
	}
	
	@DeleteMapping("/{id}")
	void deleteCoffee(@PathVariable Long id) {
		customerService.deleteCustomerById(id);
	}
}
