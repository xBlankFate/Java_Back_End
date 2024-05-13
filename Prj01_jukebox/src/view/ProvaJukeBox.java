package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;

import controller.CanzoneCtrl;
import model.canzone;

public class ProvaJukeBox {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("Z:\\canzoni.txt");
		
		CanzoneCtrl jukebox = new CanzoneCtrl();
		
		try {
			
			Scanner sc = new Scanner (f);
			while(sc.hasNextLine()) {
				
				String riga = sc.nextLine();
				
				String[] split = riga.split(";");
				
				String titolo = split[0];
				
				String cantante = split[1];
				
				//canzone c = new canzone (titolo,cantante);
				
				//System.out.println(c);
				jukebox.addCanzone(titolo,cantante);
					}
				} catch (Exception e) {
			// TODO: handle exception
		}
		
		Set<String> cantanti = jukebox.getCantati();
		
		cantanti
		.stream()//flusso
		.filter(c -> c.startsWith("The"))
		.filter(c -> c.endsWith("s"))
		.sorted()
		.forEach(c -> System.out.println(c));
	
		
			PrintWriter output = new PrintWriter("canzoni.html");
			
			for (String cantante : cantanti) {
				output.println(cantante);
			}
		output.close();
	}

}
