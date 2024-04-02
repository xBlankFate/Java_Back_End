package gestioneprogramma;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class gestioneProgramma {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
	/*	System.out.println("Inserisci la tua età");
		
		int eta=s.nextInt();
		if(eta>=18) { //se (nella parenetesi dell'if ci va una condizione booleana(V o F))
			System.out.println("sei maggiorenne puoi entrare");
		}else {//altrimenti
			System.out.println("non sei maggiorenne, non puoi entrare");
		}
		
		int num=5;
		//condizione booleana nell'if
		if(num>5) {
			System.out.println("maggiore di 5");
		}else if (num==5) { //se ho un'altra condizione si aggiunge else if fino a raggiungere l'ultima condizione
			System.out.println("è uguale a 5");
		}else {
			System.out.println("minore di 5");
		}
		
		System.out.println("inserisci la temperatura");
		double temp=s.nextDouble();
		if (temp>=30) {
			System.out.println("accendi condizionatore");
		}else if (temp<=15) {
			System.out.println("accendi riscaldamento");
		}else {
			System.out.println("non fare niente");
		}
		System.out.println("dammi due numeri casuali");
		int numeriCasuali=s.nextInt();
		int numeriCasuali2=s.nextInt();
		
		
		if (numeriCasuali2==0) {
			System.out.println("non puoi dividere per 0");
		}else {
			double numeriCasuale3=numeriCasuali/numeriCasuali2;
			System.out.println("il risultato è\n"+numeriCasuale3);
		}
		///////////////////////////////////////////////////////////
		System.out.println("inserisci un numero:\n");
		double numero=s.nextDouble();
		if (numero%2==0) {// % ritorna il modulo della divisione
			System.out.println("il numero è pari");
		}else {
			System.out.println("il numero è dispari");
		}
		///////////////////////////////////////////////////////////////////
		int orario=LocalTime.now().getHour();
		//<12 mi mette buongiorno
		//<18 mi dice buonpomeriggio
		//<22 buonasera
		//altrimenti buonanotte
		
		String saluto;
		
		if (orario<12) {
			saluto="buongiorno";
		}else if (orario<18) {
			saluto="buonpomeriggio";
		}else if (orario<22) {
			saluto="buonasera";
		}else {
			saluto="buonanotte";
		}
		System.out.println(saluto+"\nsono le "+orario);
		*/
		////////////////////////////////////////////////////
		
		Random r=new Random();
		/*
		int dado=r.nextInt(1,7);
		int dado2=r.nextInt(1,7);
		if (dado+dado2>=10) {
			System.out.println(dado+dado2+ " hai vinto");
		}else {
			System.out.println(dado+dado2+ " hai perso");
		}
		////////////////////////////////////////////////////
		  System.out.println("trova parole inserisci una frase\n");
		 String frase=s.nextLine();
		 System.out.println("inserisci una parola da trovare all'interno\n");
		 String parola=s.nextLine();
		 if (frase.contains(parola)) {
			System.out.println("la tua parola si trova alla posizione numero\n"+frase.indexOf(parola));
		}else {
			System.out.println(parola+" non esiste nella frase");
		}
		 //and e or
		 //&&    ||
		 //la A && B(A e B) ritorna vera se sia la A che la B sono vere
		 //la A||B (A oppure B)ritorna vera se anche solo 1 è vera
		 //in caso di and e or insieme si fa prima la and
		 //le parentesi vengono prima di tutto
		 
		 System.out.println(10>8 && 7<6); //falso 
		 System.out.println(9>5 && 5==5);//vera
		 System.out.println(10>8||7<6);//vera
		 System.out.println(4<3||7>9);//falso
		 
		 boolean sole=true;
		 int temperatura=25;
		 if (sole&&temperatura>20) {
			System.out.println("esco");
		} else {
			System.out.println("sto a casa");
		}
	
	int voto=s.nextInt();	
	int voto2=s.nextInt();
	int voto3=s.nextInt();
	boolean controllo=voto>=6&&voto2>=6&&voto3>=6;
	if (controllo==true) {
		System.out.println("bravo");
	}else {
		System.out.println("bocciato");
	}
	
//////////////////////////////////////////////////////////
	System.out.println("inserisci ore e minuti");
		 int ore=s.nextInt();
		 int minuti=s.nextInt();
		 if (ore<0) {
			System.out.println("ora invalida");
		}else if(ore>24) {
			System.out.println("ora invalida");
		}else if (minuti<0) {
			System.out.println("minuti invalidi");
		}else if (minuti>59) {
			System.out.println("minuti invalidi");
		}else {
			System.out.println("ora corretta");
		}//modo longevo
	
		 if ( (ore<0)||(ore>23)||(minuti<0)||(minuti>59)) {
			System.out.println("non è un orario valido");
		} else {
			System.out.println("orario valido");
		}//versione accorciata
		 
		//altro metodo alternativo
		 
		 boolean ore_ok=(ore>=0)&&(ore<24);
		 boolean minuti_ok=(minuti>=0)&&(ore<59);
		 if (ore_ok&&minuti_ok) {
			System.out.println("è un orario valido");
		} else {
			System.out.println("non è un orario valido");
		}
		*/ 
		 ////////////////////////////////////////////////////////////////
		 
		
		int voto=8;
		
		if (voto>=6) {
			System.out.println("promosso");
		}else {
			System.out.println("bocciato");
		}
		 
		//operatore ternario
		//1* condizione
		//2* cosa fare se vero
		//3* cosa fare se falso
		
		
		System.out.println((voto>=6)?"promosso":"bocciato"); //se è vero = ?
										 //se è falso = :
		 
		 int altezza=190;
		 
		 
		 String altoBasso=(altezza>=150)?"alto":"basso";
		 
		 System.out.println(altoBasso);
	
		 int a=10;
		 int b=20;
		 
		 if (a>b) {
			System.out.println("a è maggiore");
		}else {
			System.out.println("b è maggiore");
		}
		 int max=(a>b)?a:b;
		 
		 System.out.println("Il più grande è "+max);
		 
	     //oppure
		 
		 String Max=(a>b)?"a è maggiore":"b è maggiore";
		 
		 System.out.println(Max);
		 
		 //oppure
		 
		 String maX=(a>b)?"a è maggiore":(b>a)?"b è maggiore":"sono uguali";
		 
		 System.out.println(maX);
		 ///////////////////////////////////////////////////////////////////////////
		 
		 
		 int i=3;
		 //switch solo uguaglianze.
		 //la variabile deve essere SOLO di tipo char.String.byte.int.short
		 //NO boolean,double
		 switch(i) {
		 case 0://if
			 System.out.println("i vale 0");
			 break;//interrompe l'esecuzione
		 case 1://else if
			 System.out.println("i vale 1");
			 break;
		 case 2:
			 System.out.println("i vale 2");
			 break;
			 default://vale da else
				 System.out.println("i è diverso da 0,1,2");
				 
				 int giorno=LocalDate.now().getDayOfWeek().getValue();
				 System.out.println(giorno);
				 
				 switch (giorno) {
				case 1: 
					System.out.println("oggi è lunedi");
					break;
				case 2:
					System.out.println("oggi è martedi");
					break;
				case 3:
					System.out.println("oggi è mercoledi");
					break;
				case 4:
					System.out.println("oggi è giovedi");
					break;
				case 5:
					System.out.println("oggi è venerdi");
					break;
				case 6:
					System.out.println("oggi è sabato");
					break;
				case 7:
					System.out.println("oggi è domenica");
					break;
					default:
						System.out.println("errore nella data");
				}
		 }
		 
	}
	

}
