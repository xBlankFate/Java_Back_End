package com.blank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blank.entities.Utente;
import com.blank.rep.UtenteDAO;

@Service
public class UtenteServiceImpl implements UtenteService {
	
	@Autowired
	UtenteDAO daoUtente;

	@Override
	public Utente addUtente(Utente u) {
		return daoUtente.save(u);
	}

	@Override
	public List<Utente> getUtente() {
		
		return daoUtente.findAll();
		
	}



	


	
	

}