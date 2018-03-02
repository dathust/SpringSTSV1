package edu.fa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.model.Fresher;
import edu.fa.repository.FresherRepository;

@Service
public class RegisterService {
	
	@Autowired
	private FresherRepository fresherRepository;
	public boolean register(Fresher fresher) {
		 return fresherRepository.register(fresher);
	}
}
