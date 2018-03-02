package edu.fa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.model.Fresher;
import edu.fa.repository.FresherRepository;

@Service
public class LoginService {
	@Autowired
	private FresherRepository fresherRepository;
	public boolean login(Fresher fresher) {
		return fresherRepository.authenticate(fresher);
	}
}
