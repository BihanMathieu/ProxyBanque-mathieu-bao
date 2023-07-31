package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "conseiller_id")
	private Conseiller conseiller;
	@OneToOne
	private CompteCourant compteCourant;
	@OneToOne
	private CompteEpargne compteEpargne;

	public Customer() {
	}

	public Customer(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", conseiller=" + conseiller + "]";
	}

}
