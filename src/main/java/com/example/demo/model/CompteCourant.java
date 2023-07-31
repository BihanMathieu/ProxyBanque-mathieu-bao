package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class CompteCourant extends Compte {

	
	@OneToOne(mappedBy = "compte")
	private Customer customer;
	
	public CompteCourant() {
		super();
	}

	public CompteCourant(String type, String numCompte, int solde, LocalDate creationDate) {
        super(type, numCompte, solde, creationDate);
    }

	
	
}
