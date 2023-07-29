package com.example.demo.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.AgenceRepository;

import com.example.demo.model.Agence;

@Service
public class AgenceServiceImp implements AgenceService{

	private AgenceRepository agenceRepository;
	private RandomCodeGeneratorService randomCodeGeneratorService;

	public AgenceServiceImp(AgenceRepository agenceRepository, RandomCodeGeneratorService randomCodeGeneratorService) {
		this.agenceRepository = agenceRepository;
		this.randomCodeGeneratorService = randomCodeGeneratorService;
	}
	
	
	public Agence createAgence(String name) {
        String codeAlpha = randomCodeGeneratorService.generateRandomCode();
        LocalDate creationDate = LocalDate.now();
        return new Agence(name, codeAlpha, creationDate);
    }
	
	@Override
	public Iterable<Agence> getAllAgences() {
		// TODO Auto-generated method stub
		return agenceRepository.findAll();
	}

	@Override
	public Agence saveAgence(Agence agence) {
		// TODO Auto-generated method stub
		return agenceRepository.save(agence);
	}

	@Override
	public Optional<Agence> getAgenceById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void deleteAgenceById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Agence updateAgence(Agence agence) {
		// TODO Auto-generated method stub
		return null;
	}

}
