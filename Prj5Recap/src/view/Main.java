package view;

import Database.Connessione;
import model.BollettaGas;
import model.BollettaLuce;

public class Main {

	public static void main(String[] args) {
		
		BollettaLuce b1 = new BollettaLuce("Denis Crilia", "Iren", "25/05/24", 15);
		
		System.out.println(b1.toString());
		
		BollettaGas g1 = new BollettaGas("Denis Crilia", "Enel", "30/05/24", 50);
		
		System.out.println(g1.toString());
		
		Connessione c = new Connessione();
		
		c.getConn();
		
	}
	
}
