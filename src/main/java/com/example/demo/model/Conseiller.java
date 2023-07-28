package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Conseiller {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@OneToMany(mappedBy="conseiller",cascade = {CascadeType.PERSIST})
	private Set<Customer> customers = new HashSet<Customer>();
	
	public Conseiller() {
	}


	public Conseiller(String name) {
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

	

	public Set<Customer> getCustomers() {
		return customers;
	}


	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}


	@Override
	public String toString() {
		return "Conseiller [id=" + id + ", name=" + name + "]";
	}


	
	
	
	
}
