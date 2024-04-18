package dadi_tester;

import java.util.ArrayList;
import java.util.Scanner;

import dadi.Dadi;

public class dado_tester {

	//metodo per 3 dadi uguali
	
	private static void superlucky(int Lancio6, int Lancio12, int Lancio20) {
		
		int risultato = 0;
		
		if((Lancio6==Lancio12)&&(Lancio12==Lancio20)) {
			
			System.out.println("Bravo hai vinto: "+Lancio6+"-"+Lancio12+"-"+Lancio20+"hai 3 numeri uguali");
			risultato += 100;
			System.out.println("hai stabilito: "+risultato);
		
		}else {
			System.out.println(Lancio6+"-"+Lancio12+"-"+Lancio20+" mi dispiace hai perso");
		}
		
		
	}
	//dadi truccati
	private static void pippo(int trucco6,int trucco12,int trucco20) {
		System.out.println("hai scoperto la modalita per imbrogliare");
//		int risultato =0;
//		
//		if((trucco6==trucco12)&&(trucco12==trucco20)) {
//			
//				System.out.println("Bravo hai vinto: "+trucco6+"-"+trucco12+"-"+trucco20+"hai 3 numeri uguali");
//					risultato += 100;
//						System.out.println("hai stabilito: "+risultato+" punti");
//		}else {
//			System.out.println(trucco6+"-"+trucco12+"-"+trucco20+" mi dispiace hai perso");
//		}
//		
		//sfrutto un metodo dentro un'altro metodo
		superlucky(trucco12, trucco20, trucco6);
		
	}

	
	private static void calcolaRisultato(int lancio6, int lancio12, int lancio20) {
		
		System.out.println("Hai eseguito i seguenti lanci : "+lancio6+"-"+lancio12+"-"+lancio20);
		
		ArrayList<Integer>Lanci= new ArrayList<>();
		Lanci.add(lancio6);
		Lanci.add(lancio12);
		Lanci.add(lancio20);
		
		int risultato = 0;
		
		int somma=lancio6+lancio12+lancio20;
		
		if(somma>26) {
			risultato += 10;
		}
		
		for(Integer lancioSingolo:Lanci) {
			
			if(lancioSingolo % 2 == 0) {
				risultato += 6;
			}
			
		}
		System.out.println("hai fatto: "+risultato+" punti");
	}
	
	//definisco i dadi6 12 e 20
	
	public static void main(String[] args) {
		
		Dadi dado6= new Dadi(6);
		
		Dadi dado12=new Dadi(12);
		
		Dadi dado20=new Dadi(20);
//		
//		int lancio6=dado6.lancio();
//		int lancio12=dado12.lancio();
//		int lancio20=dado20.lancio();
//		
//		System.out.println(lancio6+"-"+lancio12+"-"+lancio20);
//		
		System.out.println("gioco dei 3 dadi");
		
		boolean condizione=true;
		
		while(condizione) {
			
			System.out.println("inserisci un comando: L per lanciare; 0 per chiudere; S per la modalità superlucky");
			
			Scanner s=new Scanner(System.in);
			
			String comando=s.nextLine();
			
			switch(comando) {
			
			//lancio i dadi secondo la classe lancio
			
			case "L":
				int lancio6 = dado6.lancio();
					int lancio12 = dado12.lancio();
						int lancio20 = dado20.lancio();
							System.out.println(lancio6+"-"+lancio12+"-"+lancio20);			
							
							calcolaRisultato(lancio6,lancio12,lancio20);
							
							break;
						
			case "S":
				int Lancio6 = dado6.lancio();
					int Lancio12 = dado12.lancio();
						int Lancio20 = dado20.lancio();
					
				superlucky(Lancio6,Lancio12,Lancio20);
						break;
				
						//lancio i dadi secondo la classe trucco(i dadi hanno solo 3 facce
			case "pippo":
				
				int trucco6 = dado6.trucco();
				int trucco12 = dado12.trucco();
				int trucco20 = dado20.trucco();
				
				pippo(trucco6, trucco12, trucco20);
				
				break;		
				
			case "0":
				System.out.println("hai chiuso il gioco");
				condizione=false;
				break;
				
			default:
				System.out.println("non capisco il comando");
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
	}

	

}
