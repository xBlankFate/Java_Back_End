package com.blank;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blank.entities.CartaPokemon;
import com.blank.service.CartaPokemonService;

@SpringBootTest
class CartePokemonApplicationTests {

	@Autowired
	private CartaPokemonService service;
	
	@Test
	void addPokemon() {
		
		CartaPokemon cp = new CartaPokemon();
		
		cp.setHp(100);
		cp.setNome("Pikachu");
		cp.setTipo("Elettro");
		
		service.addCarta(cp);
	}

	@Test
	void getCards() {
		
		List<CartaPokemon> cards = service.getCards();
		
		System.out.println("Sono disponibili " + cards.size() + " carte nel db");
		
		
	}
	
}
