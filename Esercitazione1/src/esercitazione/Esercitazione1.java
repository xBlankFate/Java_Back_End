package esercitazione;

import java.util.Random;
import java.util.Scanner;

public class Esercitazione1 {
	public static void main(String[] args) {
		menu();
	} 
//nome 
public static void esercizio() {

	String nome="| Denis |";
	String simboli="+ - - - +";
	System.out.println(simboli+"\n"+nome+"\n"+simboli);
	
	String java="Java";
	String script="Script";
	System.out.println(java.length()+"\n"+java.toUpperCase()+"\n"+java.concat(script));
}
//lunghezza numero
public static void esercizio2() {
		
	Scanner s=new Scanner(System.in);
	
	System.out.println("Inserisci un numero");
	
	int numero=s.nextInt();
	String Convertito= (String)""+numero;
	
	System.out.println(numero+"\nHa "+Convertito.length()+" caratteri");
	
	
}	
//numero divisori
public static void esercizio3() {
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("Scrivi un numero");
	
	int numero=s.nextInt();
	int i=2;
	int quanti=0;
	
	while(i<(numero/2+1)){
		if(numero%i==0){
			System.out.println(i);
			quanti++;
		}
		i++;
	};
	System.out.println("numero totale dei divisoli:\n"+quanti);
	
}
//min+MAX
public static void esercizio4() {
	Scanner s=new Scanner(System.in);
	
	System.out.println("inserisci un numero");
	
	int risposta=s.nextInt();
	int min=0;
	int MAX=0;
	int continuo=0;
	do {
		System.out.println("inserisci un numero");
		int Risposta=s.nextInt();
		 continuo+=risposta;
		if((risposta==min)&&(risposta==MAX)) {
			
			System.out.println("il min di "+risposta+" è "+min+" il massimo invece è "+MAX);
			}
	} while(risposta==0); {
		System.out.println("fine");
	}
}
public static void menu() {
	
	System.out.println("Menu Esercizi");
	
	while(true) {
		System.out.println("");
		System.out.println("Digita il numero dell'esercizio");
		
		Scanner s=new Scanner(System.in);
		int numeroEsercizio=s.nextInt();
		
		Esercitazione1 istance= new Esercitazione1();
		
		switch (numeroEsercizio) {
		case 1:
			istance.esercizio();
			break;
		case 2:
			istance.esercizio2();
			break;
		case 3:
			istance.esercizio3();
			break;
		case 4:
			istance.esercizio4();
			break;
			
		case 0:
			return;
			}
	
		}
	}
}