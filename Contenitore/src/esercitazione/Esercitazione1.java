package esercitazione;

import java.util.Arrays;
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
	min=risposta;
	
	for(int i=0;i>=10;i++) {
		System.out.println("vuoi inserire un'altro numero");
		int numero2=s.nextInt();
		if(numero2==0) {
			break;
		}else if(risposta<numero2) {
			risposta=numero2;
		}else if(min>numero2) {
			min=numero2;
		}
	}
	System.out.println("il numero più piccolo è "+min+"\ninvece quello più grande è "+risposta);	
}
public static void esercizio5() {
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("inserisci 3 lati di un ipotetico triangolo");
	
	int lato=s.nextInt();
	int lato2=s.nextInt();
	int lato3=s.nextInt();
	
	if(lato>(lato2+lato3)||lato2>(lato+lato3)||lato3>(lato2+lato)) {
		
		System.out.println("il tuo triangolo esiste");
		
	}else {
		System.out.println("il tuo trinagolo non esiste ");
	}	
}
public static void esericizio6() {
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("Dammi la stringa");
	
	String stringa=s.nextLine();
	
	System.out.println("Dammi il carattere da cercare");
	char carattere=s.next().charAt(0);
	
	if(stringa.indexOf(carattere)!=1) {
		
		System.out.println("Il carattere è presente nella stringa");
	}else {
		System.out.println("Il carattere non è presente nella stringa");
	}
}
public static void esercizio7() {

	Scanner s=new Scanner(System.in);
	
	String[] giorni = {"Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato", "Domenica"};
	
	int numero=1;
	
	while(numero!=0) {
		System.out.println("Dammi un numero da uno a sette per avere il giorno della settimana");
		int num=s.nextInt();
		if(num<8&&num>0) {
			System.out.println("Il giorno numero "+num+" è:\n"+giorni[num-1]);
			numero=0;
		}else {
			System.out.println("Il numero non va bene, riprova");
		}
	}
}
public static void esercizio8() {
	
	Scanner s=new Scanner(System.in);
	
	int[]numeri=new int[5];
	
	numeri[0]=s.nextInt();
	numeri[1]=s.nextInt();
	numeri[2]=s.nextInt();
	numeri[3]=s.nextInt();
	numeri[4]=s.nextInt();
	int media=Arrays.stream(numeri).sum()/5;
	
	
	System.out.println("la somma dei tuoi numeri è "+Arrays.stream(numeri).sum()+" mentre la media è "+media);
	
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
			
		case 5:
			istance.esercizio5();
			break;
			
		case 6:
			istance.esericizio6();
			break;
		
		case 7:
			istance.esercizio7();
			break;
			
		case 8:
			istance.esercizio8();
			break;
			
		case 0:
			return;
			}
	
		}
	}
}