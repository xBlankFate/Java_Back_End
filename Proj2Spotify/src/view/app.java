package view;

import java.util.ArrayList;

import controller.CanzoniCTRL;
import model.Canzone;

public class app {

	public static void main(String[] args) {
		
		CanzoniCTRL database = new CanzoniCTRL();
		database.CaricaCanzoniAMano();
		
		ArrayList<Canzone> tutteCanzoni = database.canzoni;
		
		System.out.println("Stampo tutte le canzoni presenti");
		for (Canzone canzone : tutteCanzoni) {
			
			System.out.println(canzone.titolo + " - " + canzone.cantante);
			 
		}
	}

}
