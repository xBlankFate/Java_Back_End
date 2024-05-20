package controller;

import java.util.ArrayList;
import java.util.List;

import db.PokemonDAO;
import db.PokemonDAOImpl;
import model.Pokemon;

public class PokemonCtrl {

	private PokemonDAO dao = new PokemonDAOImpl();
	
	public List<String> getTipiPokemon(){
		
		dao.getTipiPokemon();
		return dao.getTipiPokemon();
		
	}

	public  List<String> getNomiPokemon(){
		
		List<String> pokemon = new ArrayList<String>(); //scatola vuota
		
		for (Pokemon p : dao.getAllPokemon() ){//riempio scatola
			pokemon.add(p.getNome());
		}
		return pokemon;//ritorno scatola
	}
	
}
