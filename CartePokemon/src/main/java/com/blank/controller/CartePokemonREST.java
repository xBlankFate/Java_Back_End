package com.blank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blank.entities.CartaPokemon;
import com.blank.service.CartaPokemonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api")
public class CartePokemonREST {
	
	@Autowired
	CartaPokemonService service;
	
	@GetMapping("cards")
	public List<CartaPokemon> getAll(){
		
		return service.getCards();
		
	}
	
	@PostMapping("cards")
	
	public CartaPokemon addCard(@RequestBody CartaPokemon c) {
		
		return service.addCarta(c);
		
	}
	
	
}
