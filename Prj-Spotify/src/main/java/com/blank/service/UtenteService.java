package com.blank.service;

import java.util.List;

import com.blank.entities.Utente;

public interface UtenteService {
	
	
	Utente addUtente(Utente u);
	
	List<Utente> getUtente();
	
}