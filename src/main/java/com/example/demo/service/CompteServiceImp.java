package com.example.demo.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.CompteRepository;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.model.Compte;
import com.example.demo.model.CompteCourant;
import com.example.demo.model.CompteEpargne;
import com.example.demo.model.Customer;

@Service
public class CompteServiceImp implements CompteService {
	
	private CompteRepository compteRepository;
	private RandomCodeGeneratorService randomCodeGeneratorService;
	private CustomerRepository customerRepository;
	
	
	public CompteServiceImp(CompteRepository compteRepository,RandomCodeGeneratorService randomCodeGeneratorService,CustomerRepository customerRepository) {
		this.compteRepository = compteRepository;
		this.randomCodeGeneratorService = randomCodeGeneratorService;
		this.customerRepository =customerRepository;
	}
	
	public Compte createCompte(String type, int solde) {
		String numCompte = randomCodeGeneratorService.generateRandomCode();
        LocalDate creationDate = LocalDate.now();

        Compte compte;
        if ("cc".equalsIgnoreCase(type)) {
            compte = new CompteCourant(type, numCompte, solde, creationDate);
        } else if ("ce".equalsIgnoreCase(type)) {
            compte = new CompteEpargne(type, numCompte, solde, creationDate);
        } else {
            // Handle the case when an invalid type is provided (Optional: throw an exception or return null)
            // For example:
            throw new IllegalArgumentException("Invalid type: " + type);
        }

        return compte;
    }
	
	@Override
	public Iterable<Compte> getAllCompte() {
		return null;
	}

	@Override
	public Compte saveCompte(Compte compte, Long id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isPresent()) {
            Customer customer = customerOptional.get();
           compte.setCustomer(customer);
           if (compte instanceof CompteCourant) {
               customer.setCompteCourant((CompteCourant) compte);
           } else if (compte instanceof CompteEpargne) {
               customer.setCompteEpargne((CompteEpargne) compte);
           }
        }
        return compteRepository.save(compte);
	}

	@Override
	public Optional<Compte> getCompteById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void deleteCompteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Compte updateCompte(Compte compte) {
		// TODO Auto-generated method stub
		return null;
	}

}
