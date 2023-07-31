package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class CompteEpargne extends Compte {

	@Id
	@GeneratedValue
	private Long id;
	@OneToOne(mappedBy = "compteEpargne")
	private Customer customer;
}
