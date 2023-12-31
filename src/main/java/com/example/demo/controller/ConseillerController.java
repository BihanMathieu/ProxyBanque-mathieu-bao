package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Conseiller;
import com.example.demo.service.ConseillerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/conseillers")
public class ConseillerController {

	private final ConseillerService conseillerService;

	public ConseillerController(ConseillerService conseillerService) {
		// TODO Auto-generated constructor stub
		this.conseillerService = conseillerService;
	}

	@GetMapping
	Iterable<Conseiller> getCustomers() {

		return conseillerService.getAllConseiller();
	}

	@PostMapping("/{id}")
	Conseiller postCustomer(@Valid @RequestBody Conseiller c, @PathVariable Long id) {
		return conseillerService.saveConseiller(c, id);
	}

	@DeleteMapping
	void deleteCoffee(@PathVariable Long id) {
		conseillerService.deleteConseillerById(id);
	}
}
