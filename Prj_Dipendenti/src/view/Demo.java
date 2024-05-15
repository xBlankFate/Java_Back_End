package view;

import java.util.List;

import controller.gestioneAziendale;
import db.DipendenteDAOimpl;
import db.DipendenteDao;
import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class Demo {

	public static void main(String[] args) {
		
		gestioneAziendale azienda = new gestioneAziendale("sloth srl");
		
		Fattorino fattorino = new Fattorino("Davide");
		Fattorino fattorino2 = new Fattorino("Enrico");
		Fattorino fattorino3 = new Fattorino("Simone");
		
		Impiegato impiegato = new Impiegato("fabio");
		Impiegato impiegato2 = new Impiegato("raf");
		Impiegato impiegato3 = new Impiegato("big");
		
		Dirigente dirigente = new Dirigente("Denis");
		
		azienda.addDipendente(fattorino);
		azienda.addDipendente(fattorino2);
		azienda.addDipendente(fattorino3);
		azienda.addDipendente(impiegato);
		azienda.addDipendente(impiegato2);
		azienda.addDipendente(impiegato3);
		azienda.addDipendente(dirigente);
		
		List<Dipendente> dipendenti = azienda.getDipendenti();
		
		for (Dipendente dipendente : dipendenti) {
		;	
				if(dipendente instanceof Fattorino) {
				
					((Fattorino)dipendente).setConsegne(100);
						
				}else if (dipendente instanceof Impiegato) {
				
							((Impiegato)dipendente).setOreLav(160);
			}else if (dipendente instanceof Dirigente) {
				
				((Dirigente)dipendente).setNumeroDip(6);
			
			}else {
				
				System.out.println("inserisci un ruolo adatto");
				
			}
		}
		
		for (Dipendente dipendente : dipendenti) {
			
			dipendente.calcolaStipendio();
			System.out.println(dipendente);
			
		}
		
		DipendenteDao dao = new DipendenteDAOimpl();
		
		for (Dipendente dipendente : dipendenti) {

			dao.addDipendente(dipendente);
			
		}
	}

}
