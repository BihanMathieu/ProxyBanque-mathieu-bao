package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Conseiller {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

	
	public Conseiller() {
	}


	public Conseiller(String name, Set<Customer> customers) {
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


	@Override
	public String toString() {
		return "Conseiller [id=" + id + ", name=" + name + "]";
	}


	
	
	
	
}
