package esercizioinput;

import java.util.Scanner;

public class EsercizioInput {

	public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("dammi 2 numeri");
	int numeri=input.nextInt();
	int numero1=10;
	int numero2=20;
	int numero3=numero1+numero2;
	int numero4=numero1*numero2;
	System.out.println("la somma è "+numero3+ " \ninvece il Prodotto è "+numero4);
	
	
	}

}
