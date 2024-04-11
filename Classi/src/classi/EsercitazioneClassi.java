package classi;

import java.util.Scanner;

public class EsercitazioneClassi {
		 static double primoNumero;
	 static double secondoNumero;
	 static String Calcolatrice;
	
	
	
	
	public EsercitazioneClassi(double primoNumero, double secondoNumero, String calcolatrice) {
		
		this.primoNumero = primoNumero;
		this.secondoNumero = secondoNumero;
		Calcolatrice = calcolatrice;
	}
	
	
	
	public double calcolaSomma() {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("dammi 2 numeri da eseguire la somma");
		
		this.primoNumero=s.nextDouble();
		this.secondoNumero=s.nextDouble();
		
		double somma=this.primoNumero+this.secondoNumero;
		System.out.println(somma);
		return somma;
	}
	public double calcolaDifferenza() {
	
		Scanner s=new Scanner(System.in);
		
		System.out.println("dammi 2 numeri da eseguire la differenza");
		
		this.primoNumero=s.nextDouble();
		this.secondoNumero=s.nextDouble();
		
		double differenza=this.primoNumero-this.secondoNumero;
		System.out.println(differenza);
		return differenza;
	}
	public double calcolaQuoziente() {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("dammi 2 numeri da eseguire la divisione");
		
		this.primoNumero=s.nextDouble();
		this.secondoNumero=s.nextDouble();
		
		double quoziente=this.primoNumero/this.secondoNumero;
		System.out.println(quoziente);
		return quoziente;
	}
	public double calcolaProdotto() {
		
	Scanner s=new Scanner(System.in);
		
		System.out.println("dammi 2 numeri da eseguire la moltiplicazione");
		
		this.primoNumero=s.nextDouble();
		this.secondoNumero=s.nextDouble();
		
		double prodotto=this.primoNumero*this.secondoNumero;
		
		System.out.println(prodotto);
		return prodotto;
	}

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			
			
			System.out.println("Menu Esercizi");
			
		
				System.out.println("");
				System.out.println("Digita un simbolo per eseguire un'operazione");
				String operazione=s.nextLine();
	
		EsercitazioneClassi calcolatrice=new EsercitazioneClassi(primoNumero, secondoNumero, Calcolatrice);
		
		
		switch (operazione) {
		case "+":
			calcolatrice.calcolaSomma();
			break;
		case "-":
			calcolatrice.calcolaDifferenza();
			break;
		case "/":
			calcolatrice.calcolaQuoziente();
			break;
		case "*":
			calcolatrice.calcolaProdotto();
			break;
		
		case "0":
			System.out.println("arrivederci");
			return;
			
			default:
				System.out.println("inserisci un simbolo valido");
				break;
			}
		}
	}

