package com.blank.service;

import java.util.List;

import com.blank.entities.CartaPokemon;

public interface CartaPokemonService {

	List<CartaPokemon> getCards();
	
	CartaPokemon addCarta(CartaPokemon c);
	
}
