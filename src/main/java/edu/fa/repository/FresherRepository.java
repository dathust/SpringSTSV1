package edu.fa.repository;

import org.springframework.stereotype.Repository;

import edu.fa.model.Fresher;

@Repository
public class FresherRepository {
	public boolean authenticate(Fresher fresher) {
		if (fresher.getUsername().equals(fresher.getPassword())) {
			return false;
		}
		return true;
	}

	public boolean register(Fresher fresher) {
		if (fresher.getUsername().equals(fresher.getPassword())) {
			return false;
		}
		return true;		
	}
}
