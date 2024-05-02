package controller;

import java.util.ArrayList;

import Model.Dipendente;
import Model.Manager;
import Model.Programmatore;

public class aziendaCtrl {

	public String nomeAzienda;
	private int numDipendenti;
	private ArrayList<Dipendente> listaDipendenti;
	
	public aziendaCtrl(String nomeAziejnda) {
		
		this.nomeAzienda = nomeAzienda;
		this.listaDipendenti = new ArrayList<>();
		
	}
	public void addDipendente(String nome,String cognome,String ruolo) {
		
		Dipendente d= null;
		
		switch (ruolo) {
		case "Manager": 
			d= new Manager(nome,cognome,ruolo);
			break;
	
		case "Programmatore":
			d= new Programmatore(nome,cognome,ruolo);
			break;
			
		case "Stagista":
			break;
			}
			if(d!=null) {
				this.listaDipendenti.add(d);
		}
	}
}
