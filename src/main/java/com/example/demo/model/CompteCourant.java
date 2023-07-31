package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class CompteCourant extends Compte {

	@Id
	@GeneratedValue
	private Long id;
	@OneToOne(mappedBy = "compteCourant")
	private Customer customer;
}
