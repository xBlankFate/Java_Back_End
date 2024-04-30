package view;

import java.util.ArrayList;

import Controller.AggDipendenti;
import model.Dipendente;

public class Azienda {

	public static void main(String[] args) {
		
		AggDipendenti Dipend = new AggDipendenti();
		
		Dipend.CaricaDipendenti();
		
		ArrayList<Dipendente> tuttidipendenti = new ArrayList<>();
		
		System.out.println("Stampo tutti i dipendenti");
		
		for ( Dipendente dipendente : tuttidipendenti) {
				System.out.println(dipendente.matricola + " " + dipendente.cognome + " "+ dipendente.nome + " "+ dipendente.OreLavorate+ " "+ dipendente.PagaOraria+ " "+ dipendente.guadagno);
		}
	
		

	}

}
