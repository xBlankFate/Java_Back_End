package com.blank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.blank.entities.Utente;
import com.blank.service.UtenteService;

@RestController
@RequestMapping("api")
public class UtenteRest {
	
	@Autowired
	UtenteService serviceUtente;

	@GetMapping("registraUtenti")
	public Utente addUtente(@RequestBody Utente u) {
		
		return serviceUtente.addUtente(u);
	
	}
}
