package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Compte;
import com.example.demo.service.CompteService;

@RestController
@RequestMapping("/comptes")
public class CompteController {

	private CompteService compteService;

	public CompteController(CompteService compteService) {
		this.compteService = compteService;
	}

	@PostMapping("/{id}")
	Compte postCompte(@RequestBody Compte c, @PathVariable Long id) {
		Compte newCompte = compteService.createCompte(c.getType(), c.getSolde());
		return compteService.saveCompte(newCompte, id);
//		if (c.getType().equalsIgnoreCase("ce")) {
//			CompteEpargne compteEpargne = new CompteEpargne();
//			compteEpargne.setType("ce");
//			return compteService.saveCompte(compteEpargne, id);
//		} else if (c.getType().equalsIgnoreCase("cc")) {
//			Compte compteCourant = new CompteCourant();
//			compteCourant = compteService.createCompte(c.getType(), c.getSolde());
//			return compteService.saveCompte(compteCourant, id);
//		}
//		return null;
	}
}