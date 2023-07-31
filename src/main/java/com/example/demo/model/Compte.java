package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Compte {

	
	private String numCompte;
	private int solde;
	private LocalDate creationDate;
	
	
	
	public Compte() {
	}
	
	public Compte(int solde) {
		this.solde = solde;
	}




	public String getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	
	
	
	
}
