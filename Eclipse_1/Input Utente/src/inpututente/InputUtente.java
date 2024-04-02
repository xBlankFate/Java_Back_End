package inpututente;

import java.util.Scanner;

public class InputUtente {

	public static void main(String[] args) {
	
		//serve per prendere l'input dell'utente
		//tutte le variabili di classe si dichiarano col new
		Scanner input =new Scanner(System.in);
		System.out.println("come ti chiami?");
		String nome=input.nextLine();
	
		System.out.println("ti chiami "+nome);
		
		System.out.println("cognome");
		String cognome=input.nextLine();
		System.out.println("Il tuo cognome "+cognome);
		
		System.out.println("quanti anni hai");
		
		int eta=input.nextInt();
		
		System.out.println("hai "+eta+" anni");
		
		System.out.println("colore preferito?");
		input.nextLine();
		String colore=input.nextLine();
	}

}
