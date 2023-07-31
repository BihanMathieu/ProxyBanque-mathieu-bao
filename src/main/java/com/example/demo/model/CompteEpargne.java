package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class CompteEpargne extends Compte {

    
	@OneToOne(mappedBy = "compte")
	private Customer customer;
	public CompteEpargne() {
		super();
	}

	public CompteEpargne(String type, String numCompte, int solde, LocalDate creationDate) {
        super(type, numCompte, solde, creationDate);
    }

	
	
	
}
