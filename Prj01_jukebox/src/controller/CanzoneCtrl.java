package controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.canzone;

public class CanzoneCtrl {

	private List<canzone> Canzoni;
	
	public CanzoneCtrl() {
	this.Canzoni = new ArrayList<canzone>();	
	}
	
	public void addCanzone (canzone c) {
		Canzoni.add(c);
	}
	public void addCanzone (String titolo,String cantante) {
		Canzoni.add(new canzone (titolo,cantante));
	}

	public List<canzone> getCanzoni() {
		return Canzoni;
	}
	
	public List<String> getTitoli(){
		List<String> titoli = new ArrayList<>();
		for (canzone c : Canzoni) {
			titoli.add(c.getTitolo());
		}
		return titoli;
	}
	public Set<String> getCantati(){
		return new HashSet<String> (Canzoni
		.stream()
		.map(c -> c.getCantante())
		.toList());
		
	}
}
