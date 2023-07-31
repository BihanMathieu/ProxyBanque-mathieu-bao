package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Agence;
import com.example.demo.model.Compte;
import com.example.demo.service.CompteService;

@RestController
@RequestMapping("/comptes")
public class CompteController {
	
	private CompteService compteService;
	
	public CompteController(CompteService compteService) {
		this.compteService=compteService;
	}

	
	@PostMapping("/{id}")
	Compte postAgence(@RequestBody Compte c, @PathVariable Long id) {
		return compteService.saveCompte(c, id);
	}
}
