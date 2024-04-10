package lotto;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
public static void main(String[] args) {
	Random r=new Random();
	
	Scanner s=new Scanner(System.in);
	
	Integer numeriPop=0;
	
	System.out.println("gioco del lotto quanti numeri vuoi estrarre?");
	
	ArrayList <Integer> numeri=new ArrayList<>();
	
		int num=s.nextInt();
		int contatore=0;
		
		if(num<0||num>90) {
			System.out.println("inserisci un numero valido");
		}
		
		for(int i=0;i<num;i++) {
			int numCas=r.nextInt(91);
				if(numeri.contains(numCas)){
					numeri.isEmpty();
					numeri.add(numCas);
				}else {
					numeri.add(numCas);
			}
				contatore++;
		}
		System.out.println(numeri+"\n"+contatore);
	
	}
}
