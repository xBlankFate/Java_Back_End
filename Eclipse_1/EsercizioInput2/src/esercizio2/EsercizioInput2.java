package esercizio2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import javax.swing.table.TableStringConverter;

public class EsercizioInput2 {

	public static void main(String[] args) {
		menu();
	}
	//somma dei 4 numeri
	public static void esercizio() 
	{
		Scanner input= new Scanner(System.in);
		 //int somma dichiara int cos'è
		int somma=0;
		
		System.out.println("dammi un numero");
		somma= input.nextInt();
		//il += serve per sommare il il numero precedentemente dichiarato
		System.out.println("dammi un secondo numero");
		somma+=input.nextInt();
		
		System.out.println("dammi un terzo numero");
		somma+=input.nextInt();
		
		System.out.println("dammi un quarto numero");
		somma+=input.nextInt();
		
		System.out.println("il risultato è "+somma);
	}
	//gradi kelvin in base ai gradi
	public static void esercizio2() {
		
	Scanner input=new Scanner(System.in);
	
	System.out.println("Convertitore da gradi a gradi kelvin \nDigiti i gradi");
	
	double gradi= input.nextDouble();
	double kelvin=gradi+273.15;
	
	System.out.println("l'equivalenza di "+gradi+ " gradi in gradi kelvin è\n"+kelvin);
	

	}
	//convertitore da ore a minuti
	public static void esercizio3() {
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("Convertitore da ore a minuti\nDigiti le sue ore");
		
		double ore=input.nextDouble();
		int minuti=(int) (ore*60);
		
		System.out.println(ore+ " in minuti equivale a\n"+minuti);
		
		
		
		
		
		
		
	}
	//data di oggi + spelling di java è un bel linguaggio di programmazione
	public static void esercizio4() {
		
		
		LocalDateTime dataOggi=LocalDateTime.now();
		
		DateTimeFormatter formatoEsercizio=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		DateTimeFormatter oreEsercizio=DateTimeFormatter.ofPattern("HH:mm:ss");
		String nomeGiornoItaEs=LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.ITALY);
		
		
		
		System.out.println("Oggi è il "+dataOggi.format(formatoEsercizio)+"\ne sono le "+dataOggi.format(oreEsercizio)+"\ndi "+nomeGiornoItaEs);
		
		String frase="Java è un bel linguaggio di programmazione";
		
		String linguaggio=frase.substring(14,25);
		System.out.println(linguaggio);
		
		String carattere=frase.substring(41);
		System.out.println(carattere);
		
		String taglio=frase.substring(14,42);
		System.out.println(taglio);
		
		int linguaggioPosizione=frase.indexOf("linguaggio");
		System.out.println(linguaggioPosizione);
		
		
	}
	//generatore di password
	public static void esercizio5() {
	
		Random random = new Random();
		int lunghezzaPassword=10;
		String simboli ="-/.^*_@!&=+<>";
		String lettereMaiuscole="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lettereMinuscole="abcdefghijklmnopqrstuvwxyz";
		String numeri="0123456789";
		String finalString=lettereMaiuscole+lettereMinuscole+numeri+simboli;
		
		char[] password= new char[lunghezzaPassword];
		for(int i = 0; i < lunghezzaPassword; i++)
		{
			password[i]=
					finalString.charAt(random.nextInt(finalString.length()));
		}
		System.out.println("Questa è la tua password\n"+password);
		
	}
	//morra cinese
	public static void esercizio6() {
		
	Scanner s=new Scanner(System.in);
	Random r=new Random();
	
	System.out.println("1 per forbice 2 per carta e 3 per sasso inserire 0 per uscire");
	do {
	int butto=s.nextInt();
	
	int npc=r.nextInt(1,4);
	
	int forbice=1;
	int carta=2;
	int sasso=3;
	
	boolean vincita=(butto==forbice&&npc==carta||
			         butto==carta&&npc==sasso||
			         butto==sasso&&npc==sasso);
	
	boolean pareggio=butto==npc;
	
	
	
	if (vincita==true) {
		System.out.println(npc+" Bravo hai vinto");
	}else if (pareggio==true) {
		System.out.println(npc+" Pareggio");
	}else {
		System.out.println(npc+" Hai perso");
	}
	}while(s.nextInt()!=0);//finche il valore è diverso da 0 continua 
	
		
	}
	//in base al mese ti dice quanti numeri
	public static void esercizio7() {
		
		Scanner s= new Scanner(System.in);
		
		 System.out.println("Inserisci un mese");
		 
		 String mese=s.nextLine();
		 String risposta;
		
		 
		 risposta=switch(mese) {
		 case  "gennaio","marzo","maggio","luglio","agosto","ottobre","dicembre"->"Ha 31 giorni";
		 case  "aprile","giugno","settembre","novembre"->"Ha 30 giorni";
		 case  "febbraio"->"ha 28 giorni e ogni 4 anni ne ha 29";
		 default ->"inserisci un mese ";
		 };
		 System.out.println(risposta);
	}
	//in base al mese ti trova i giorni
	public static void esercizio8() {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("inserisci il numero di giorni in un mese");
		
		String risposta1="gennaio,marzo,maggio,luglio,agosto,ottobre,dicembre hanno 31 giorni";
		String risposta2="aprile,giugno,settembre,novembre hanno 30 giorni";
		String risposta3="febbraio ha 28 giorni";
		String risposta4="febbraio in un anno bisestile ha 29 giorni";
		int numeroMese=s.nextInt();
		String numeroGiorni=numeroMese+"";
		String risposta;
		
		risposta=switch(numeroGiorni) {
		
		case "31"->risposta1;
		
		case "30"->risposta2;
		
		case "28"->risposta3;
		
		case "29"->risposta4;
		
		default->"inserisci un numero valido";
		
		};
		System.out.println(risposta);
		
	}
	//richiesta infinita di numeri
	public static void esercizio9() {
		
		Scanner s=new Scanner(System.in);
		
		do {
			System.out.println("dammi un numero");
		}while(s.nextInt()!=0);
		
	}
	//conteggio ciclo
	public static void esercizio10() {
		
	Scanner s=new Scanner(System.in);
		System.out.println("inserisci il numero di volte del ciclo");
		int numeroVolte=s.nextInt();
		
		for(int i = 0;i <= numeroVolte;i++) {
			System.out.println("sto ciclando");
			
			if(numeroVolte<=-1) {
				System.out.println("ERROR404");
			}
		}
		
	}
	//conteggio
	public static void esercizio11() {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("inserire conteggio");
		
		int conteggio=s.nextInt();
		
		for(int i = 0; i<=conteggio;i++) {
			System.out.println(i);
			
			if(conteggio<=-1) {
				System.out.println("ERROR404");
			}
		}
		
	}
	//triangolo con *
	public static void esercizio12() {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("inserisci un numero per far comparire un triangolo");
		int numeroVolte=s.nextInt();
		
		for(int i=0;i<=numeroVolte;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	//calcolatrice
	public static void esercizio13() {
		Scanner s=new Scanner(System.in);
		System.out.println("scrivimi quanti numeri vuoi sommare");
		
		int somma=0;
		int numero=s.nextInt();
	do {
		System.out.println("inserisci il numero:");
		int numeroInserito= s.nextInt();
		somma+=numeroInserito;
		numero--;
	}while(numero!=0);
		 System.out.println(somma);	 
	}
	//conteggio dei numeri pari e dispari da 1 a 100
	public static void esercizio14() {
		Random r=new Random();
		int numero=r.nextInt(0,101);
		int pari=0;
		int dispari=0;
		for(int i=0; i<=numero; i++) {
			if(i%2==0) {
			 pari++;
			
			}else {
				dispari++;
			}
			
		}System.out.println(numero+"\nQuantitativo numeri pari "+pari+"\nQuantitativo di numeri dispari "+dispari);
		
	}
	//somma e moltiplicazione da 1 a 10
	public static void esercizio15() {
		
		System.out.println("somma e fattoriale da 1 a 10");
		int somma=0;
		int fattoriale=1;
		
		for(int i=1;i<=10;i++) {
			somma+=i;
			fattoriale*=i;
			
		}
		System.out.println("somma= "+somma+"\nfattoriale= "+fattoriale);
		
	}
	//dispari da 1 a 7
	public static void esercizio16() {
	
		
		for(int i=0;i<=10;i++) {

			if(i%2!=0) {
				System.out.println(i);
				if(i==7) {
					
					break;
				}
			}
			
		}
	}

	public static void esercizio17() {
		
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		
		int random=r.nextInt(21);
		
		boolean trovato=false;
		
		for(int i=0;i<=10;i++){
			if(random==i){
				trovato=true;
				System.out.println(random);
				break;
			}
		}
		System.out.println(trovato?"è tra i numeri da 0 a 10" :" non è tra i numeri 0 e 10");
		
		
	}
	
	public static void esercizio18() {
		
		Random r=new Random();
		Scanner s=new Scanner(System.in);
		
		System.out.println("digita una parola per scoprire se le lettere sono pari o dispari");
		
		String parola=s.nextLine();
		
		for(int i=0;i<=10;i++) {
			
			
			
		}
		
		
	}
	
	public static void menu() {
		
		System.out.println("Menu Esercizi");
		
		while(true) {
			System.out.println("");
			System.out.println("Digita il numero dell'esercizio");
			
			Scanner input=new Scanner(System.in);
			int numeroEsercizio=input.nextInt();
			
			EsercizioInput2 istance= new EsercizioInput2();
			
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
				istance.esercizio6();
				break;
				
			case 7:
				istance.esercizio7();
				break;
			
			case 8:
				istance.esercizio8();
				break;
				
			case 9:
				istance.esercizio9();
				break;
			case 10:
				istance.esercizio10();
				break;
				
			case 11:
				istance.esercizio11();
				break;
			case 12:
				istance.esercizio12();
				break;
				
			case 13:
				istance.esercizio13();
				break;
			
			case 14:
				istance.esercizio14();
				break;
				
			case 15:
				istance.esercizio15();
				break;
				
			case 16:
				istance.esercizio16();
				break;
				
			case 17:
				istance.esercizio17();
				break;
				
			case 0:
				return;
			default:
				System.out.println("Digita un numero valido");
				break;
			}
		}
	}
}

	