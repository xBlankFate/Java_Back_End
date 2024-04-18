package OOP_tester;

import java.util.Scanner;

import OOP_model.BloccoNote;

public class BloccoNoteController {

	public static void main(String[] args) {
	
		//Creo un blocco note 
		BloccoNote blocco = new BloccoNote();
		
		System.out.println("Benvenuto nel tuo bloccoNote: " + blocco.nome );
		System.out.println("aggiungi una nota");
		
		Scanner s = new Scanner(System.in); 
		
		System.out.println("Titolo: ");
		String titolo = s.nextLine();
		
		System.out.println("Descrizione: ");
		String descrizione = s.nextLine();
		
		System.out.println("Posizione: ");
		int posizione=s.nextInt();
		
		//aggiungo nota
		
		blocco.addNota(titolo, descrizione, posizione);
		
		blocco.stampaBloccoNote();
	
	}

}
