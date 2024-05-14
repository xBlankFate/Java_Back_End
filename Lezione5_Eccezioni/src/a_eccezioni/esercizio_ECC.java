package a_eccezioni;

import java.util.Scanner;

public class esercizio_ECC {

	int a;
	int b;
	Scanner s = null;
	
	public static  void  divisione(int a , int b) throws ArithmeticException {
	
		if(b == 0) {
			throw new ArithmeticException();
		
				}else {
			
					double risultato = a / b;
					System.out.println(risultato);
				}
		
	}
	
	public static void main(String[] args) {
		
		try {
			
			divisione(5,0);
				
		} catch (Exception e) {
			System.out.println("non puoi dividere per 0");
		}
	}
}

