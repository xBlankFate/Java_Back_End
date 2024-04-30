package Controller;

import java.security.DomainCombiner;
import java.util.ArrayList;

import model.Dipendente;

public class AggDipendenti {

	ArrayList<Dipendente> dipendente = new ArrayList<>();

	
	public void CaricaDipendenti() {
		String [] dipendenti = {
			"Manager:  1 Giulio,Cesare, ",
				"Manager: 2 Claudio,Bisio, ",
				"Manager: 3 Salvatore,Aranzulla,",
				"Programmatore: 4 Dario,Menillo, ",
				"Programmatore: 5 Davide,Vienna, ",
				"Programmatore: 6 Denis,Crilia, ",
				"Stagista:7 Simone,Nerucci, ",
		};
		for (String lista : dipendenti) {
			String[] separati = lista.split(":");
			String manager = separati[0];
			String programmatore = separati[1];

			
			
			Dipendente dipendente = new Dipendente(0, manager, programmatore, 0, 0, 0);
			
			this.dipendente.add(dipendente);
		}

	}
	
}
