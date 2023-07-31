package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Compte;

public interface CompteService {

	Iterable<Compte> getAllCompte();
	Compte saveCompte(Compte compte,Long id);
	Optional<Compte> getCompteById(Long id);
	void deleteCompteById(Long id);
	Compte updateCompte(Compte compte);
}
