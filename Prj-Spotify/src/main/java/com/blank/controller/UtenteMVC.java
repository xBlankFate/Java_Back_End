package com.blank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.blank.entities.Utente;
import com.blank.service.UtenteService;

@Controller
public class UtenteMVC {
	
	@Autowired
	private UtenteService serviceUtente;
	
	
	@GetMapping("logInUtenti")
	public String LogIn() {
		return "Login";
	}
	
	@GetMapping("RegistraUtenti")
	public String addUtente(Utente u) {
		//serviceUtente.addUtente(u);
		return "RegistraUtente";
	}
	
	@PostMapping("registraUtenti")
	public String addUtentiDB(Utente u) {
		serviceUtente.addUtente(u);
		return "LogIn";
	}
	
	
	
	
 	

	
	

	
	

}
