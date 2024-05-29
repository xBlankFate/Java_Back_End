package com.blank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blank.entities.CartaPokemon;
import com.blank.repos.CartaPokemonDAO;


@Service
public class CartaPokemonImpl implements CartaPokemonService{

	@Autowired
	private CartaPokemonDAO dao;
	
	@Override
	public List<CartaPokemon> getCards() {

		
		return dao.findAll();
	}

	@Override
	public CartaPokemon addCarta(CartaPokemon c) {
		
		return dao.save(c);
	}

	
	
}
