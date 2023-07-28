package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.ConseillerRepository;
import com.example.demo.model.Conseiller;

@Service
public class ConseillerServiceimp implements ConseillerService {

	
	private ConseillerRepository conseillerRepository;

	public ConseillerServiceimp(ConseillerRepository conseillerRepository) {
		this.conseillerRepository = conseillerRepository;
	}
	
	@Override
	public Iterable<Conseiller> getAllConseiller() {
		// TODO AuconseillerRepositoryto-generated method stub
		return conseillerRepository.findAll();
	}

	@Override
	public Conseiller saveConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		return conseillerRepository.save(conseiller);
	}

	@Override
	public Optional<Conseiller> getConseillerById(Long id) {
		// TODO Auto-generated method stub
		return conseillerRepository.findById(id);
	}

	@Override
	public void deleteConseillerById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Conseiller updateConseiller(Conseiller customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
