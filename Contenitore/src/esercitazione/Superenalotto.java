package esercitazione;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Superenalotto {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	
	Random r=new Random();
	
	Integer numeriPop=0;
	
	System.out.println("gioco del lotto quanti numeri vuoi estrarre?");
	
	ArrayList <Integer> numeri=new ArrayList<>();
	
		int num=s.nextInt();
		int contatore=0;
		
		if(num<0||num>90) {
			System.out.println("inserisci un numero valido");
		}
		
		for(int i=0;i<num;i++) {
			int numCas=r.nextInt(90);
				if(numeri.contains(numCas)){
					numeri.isEmpty();
					contatore++;
				}else {
					numeri.add(numCas);
			}
		}
		System.out.println(numeri+"\n"+contatore);
	}
}	


