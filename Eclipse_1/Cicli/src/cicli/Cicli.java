package cicli;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Cicli {
	
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		
		//il formato for serve per ripetere le cose 
		//è formato da 3 parti:
		//1 da dove deve partire il contatore delle ripetizioni
		//2 quando si deve fermare(booleano)quante volte deve ripetere
		//3 di quanto si deve incrementare il contatore ad ogni ripetizione
		      //1     //2  //3
		for (int i=0;i<10;i++) {     //se si vuole aggiungere saltando numeri si deve fare +=
			
			System.out.println("ciao");
		
		}
		
		
		
		for (int i = 10 ; i >= 0 ; i-- ) {
			
			
			
			System.out.println(i);
		}
		
		for(int i=0;i<=10; i+=2) {
			
			System.out.println(i);
		}
		
		for(int i=32; i<256;i++) {
			
			char Bho= (char) i;
			System.out.println(Bho);
		}
		
		//1
		int contatore=0;
		//2
		for(;contatore<=10;) {
		System.out.println(contatore);
		//3
		contatore++;
		}
		/////////////////////////////////////
		for(int i=0, j=10 ; i<=10 ; i++ , j--) {
			System.out.println("i="+i+"j="+j);
		}
		/////////////////////////////////////
		System.out.println("inserisci una frase");
		String frase=s.nextLine();
		int contatoreSpazi=0;
		for(int i=0;i< frase.length();i++) {
			//System.out.println(frase.charAt(i));//carattere alla pos i
			if(frase.charAt(i)==' ') {
				contatoreSpazi++;//incrementa di 1 la variabile
			
			}
			
			
		}
		System.out.println(frase+" ha "+contatoreSpazi +" spazi"); 
		/////////////////////////////////////////////////////////////
		Random r=new Random();
		
		int casuale=r.nextInt(1,21);
		
		System.out.println(casuale);
		
		boolean trovato=false;
		
		for(int i=1; i<=10;i++) {
			System.out.println(trovato);
			//il numero casuale è presente o non è presente nei numeri del for
			if(casuale==i) {

				trovato=true;
				System.out.println(trovato);
				break;
				
			}
		}
		System.out.println(trovato?"il numero è stato trovato":"il numero non è stato trovato");
		
		//////////////////////////////////////////////////////////
		//cicli annidati
		for(int i=1;i<=10;i++) {//numeri in verticale da 1 a 10
			for(int j=1; j<=10;j++){
				
				int risultato=i*j;
				System.out.print("\t"+risultato);//moltiplicazione in orizzontale con \t
			}
			System.out.println("");//serve per andare a capo quando arrivi a 10
		}
		/////////////////////////////////////////////////////////////
			//WHILE
		System.out.println("while");
		int contatore1=0;
		while(contatore1<10) {//stampa solo se la condizione è vera
			System.out.println(contatore1);//fai la stampa
			contatore1++;//incrementa
		}
		//do-while
		System.out.println("do while");
		int contatore2=0;
		do {
			System.out.println(contatore2);
		}while(contatore2<10);//fai la stampa e dopo incrementa
		///////////////////////////////////////
		for(int j = 0;j<=10;j++) {
			if(j==5) {
				continue;//saltare il ciclo
			}
			System.out.println(j);
		}
	}

}
