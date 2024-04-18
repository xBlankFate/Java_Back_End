package OOP_tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import OOP_model.Libro;

public class Libreria {

	public static void main(String[] args) {
		
		List<Libro> scaffale=new ArrayList<Libro>();
		
		//creo un nuovo libro e lo inserisco nello scaffale
		
		List<String>generiLibro1= new ArrayList<String>();
		
		generiLibro1.add("fantasy");
		generiLibro1.add("gotico");
		generiLibro1.add("avventura");
		
		Libro libro1 = new Libro("il signore degli anelli","J.R.Tolkien",generiLibro1, 1200,"Utet", false,16.80);
		
		scaffale.add(libro1);
		
		Scanner s=new Scanner(System.in);
		
		/*String Titolo=s.nextLine();
		
		String LibroNome="il signore degli anelli";
		
		
		if(Titolo==LibroNome) {
			System.out.println(libro1);
		}else {
			System.out.println("inserisci un libro della libreria ");
		}*/
		
		ArrayList<String>generiLibro2=new ArrayList<String>();
		
		generiLibro2.add("fantastico");
		generiLibro2.add("avventura");
		
		Libro libro2 = new Libro("il visconte dimezzato","I.Calvino",generiLibro2,150,"Feltrinelli",true,12.50);
		scaffale.add(libro2);
		
		
			System.out.println("inserisci s per stampare tutti i libri t per venderne solo uno 0 per uscire");
			
			
			String comando = s.nextLine().toLowerCase();
//			String LibroNome="il signore degli anelli";
//			String LibroNome2="il visconte dimezzato";

			boolean condizione=true;
			
			while(condizione) {
			
			switch(comando) {
		

			case "t":
				System.out.println("inserisci il titolo");
				String Titolo2 = s.nextLine().toLowerCase();

			
				for(Libro LibroTitolo : scaffale) {
					if(LibroTitolo.titolo.equals(Titolo2)) {
						System.out.println(LibroTitolo.toString());
					}else {
						System.out.println("inserisci un libro valido");
					}
				}
				
				break;
		
			case "s":
				
				System.out.println(libro2);
				System.out.println(libro1);
				break;
				
			case "0":
				System.out.println("arrivederci");
				condizione=false;
				break;
				
				default:
					System.out.println("inserisci un carattere valido");
					return;
			}
		}
	}
}
