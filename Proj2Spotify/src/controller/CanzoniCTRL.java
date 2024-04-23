package controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import model.Canzone;

public class CanzoniCTRL {

	public ArrayList<Canzone> canzoni;
	
	public CanzoniCTRL() {
		this.canzoni = new ArrayList<Canzone>(); 
	}
	
	//costruisco un metodo per creare canzoni
	
	public void CaricaCanzoniAMano() {
		String raccolta[] = {
				"Starway to Heaven;Led Zepplin",
				"Una vita spericolata;Vasco Rossi",
				"Stai zitto;Salmo",
				"Paradise City;Gun's and Roses",
				"Kind of Blue;Miles Davis",
				"Acido;Prozac",
				"Servi della gleba;EELST",
				"Cornutone;Squallor",
				"Bocca di rosa;De Andrè",
				"Gelato al cioccolato;Pupo"
		};
		for(String song : raccolta) {
			
			String[] separate = song.split(";"); //indico che ogni qualvolta incontra ; separa la stringa
			
			String titolo = separate[0];
			
			String cantante = separate[1];
			
			Canzone canzone = new Canzone(titolo, cantante);
			
			this.canzoni.add(canzone);
		}
	}
	
	//per importare un file
	public void caricaCanzoniDaFile() {
		File fileDB = new File("./canzoni.csv");
		
		try {
			Scanner s = new Scanner(fileDB);
				//se nella riga successiva c'è qualcosa
			while(s.hasNextLine()) {
				String riga = s.nextLine();
				
				String [] separate = riga.split(",");
			
				String titolo = separate[0];
				
				String cantante = separate[1];
				
				Canzone canzone = new Canzone(titolo, cantante);
				
				this.canzoni.add(canzone);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
