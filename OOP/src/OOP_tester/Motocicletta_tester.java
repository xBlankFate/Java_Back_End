package OOP_tester;

import OOP_model.Motocicletta;

public class Motocicletta_tester {

	public static void main(String[] args) {
			//per poter utilizzare il costruttore di default, essendo in presenza di un costruttore con parametri, devo OBBLIGATORIAMENTE dichiararlo
			
		Motocicletta moto1 = new Motocicletta("2750", 750);
		Motocicletta moto2 = new Motocicletta("Ninja", 1000);
		Motocicletta moto3 = new Motocicletta("2800", 799);
//attenzione la classe Motocicletta ha delle prop senza modificatore d'accesso (default). con il modificatore di default le prop sono accessibili solo all'interno dello stesso package
//attenzione il metodo (toString) e il costruttore è un metodo public, quindi visibile in tutto il progett, anche tra package differenti		
		System.out.println(moto1.toString());
		System.out.println(moto2.toString());
		System.out.println(moto3.toString());
	}
	
}
