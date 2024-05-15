package controller;

import java.util.ArrayList;
import java.util.List;

import model.Dipendente;

public class gestioneAziendale {
	
	private List<Dipendente> dipendenti;
	private String nome;
	
	public gestioneAziendale(String nome) {
		
		this.dipendenti = new ArrayList<Dipendente>();
		this.nome = nome;
	}
	
	public void addDipendente(Dipendente d) {
		
		this.getDipendenti().add(d);
	
	}

	public List<Dipendente> getDipendenti() {
		return dipendenti;
	}
	
}
