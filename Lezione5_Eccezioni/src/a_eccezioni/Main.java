package a_eccezioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

	public static void main(String[] args) {
		
		File f = new File("./test.txt");
		
		//f.exists();
		
		try {
		
			FileReader fr = new FileReader(f);
		
				} catch (FileNotFoundException e) {

					//e.printStackTrace();
				
			}
		
		stampaTesto2("ciao");
		stampaTesto2(null);
		
		try {
			stampaTesto3("Ciao");
		} catch (MieEccezioni e) {
			
			System.out.println(e.getMessage());
		}
		
		//esercizi
		
		Scanner s = new Scanner(System.in);
		
		int numeri [] = new int[5]; 
			
			numeri[0] = 1;
			numeri[1] = 2;
			numeri[2] = 3;
			numeri[3] = 4;
			numeri[4] = 5;
			
			try {
			
				System.out.println(numeri[888]);
				
				} catch (Exception e) {
					
					System.out.println("qualcosa è andato storto");
					
					}
			
			System.out.println("prova i divisori del numero 888, inserisci un numero");
	
	}
	
	private static void stampaTesto(String testo) {
		
	/*String tmp = testo.concat("...");//aggiunge una stringa ad un'altra stringa
	System.out.println(tmp);
	*/

	if(testo != null) {
		
		String tmp = testo.concat("...");
		System.out.println(tmp);
			
				}else {
					System.out.println("non puoi avere un testo null");
		}
	}
	private static void stampaTesto2(String testo) {
		
		try {
			
			String tmp = testo.concat("...");
			System.out.println(tmp);
			
			int val = 10;
			
				if(testo != null && testo.length() < val) {
				System.out.println("il tuo testo ha meno di: " + val);
					}
			
						}catch (Exception e) {
			
							System.out.println("non puoi avere testo null --CATCH");
			
								}finally {
									//il finally viene eseguito SEMPRE al termine di uno dei blocchi 
									System.out.println("sto eseguendo il finally");
								}
	}
	private static void stampaTesto3(String testo) throws MieEccezioni {
		
		//con throws vado a demandare la gestione dell'eccezione al metodo che lo eseguira
		//in quel metodo sarò obbligato ad uttilizzare il try & catch
		
		if(testo == null) {
			
			throw new MieEccezioni();
			
				}else {
					
					System.out.println(testo);
					
				}
		
	}
	public static void esegui (String testo) {
		
		try {
			
			stampaTesto3(testo);
		
				} catch (MieEccezioni e) {

					System.out.println(e.getMessage());
					
				}finally {
					
				System.out.println("alla fine c'è il finally,sempre");	
					
				}
		
	}
}
