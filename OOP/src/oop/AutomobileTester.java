package oop;

public class AutomobileTester {

	public static void main(String[] args) {
		
		//qui dentro creo tutte le automobili che voglio,andando ad utilizzare uno dei tanti metodi costruttori
		
		//utilizzo il costruttore di default
		Automobile auto1 = new Automobile();
		
		System.out.println(auto1.marca);
		System.out.println(auto1.cilindrata);//0
		auto1.cilindrata = 1200;
		System.out.println(auto1.cilindrata);
		
		//utilizzo il costruttore con marca modello e cilindrata
		//sovrascivo la propria marca
		Automobile auto2=new Automobile("Opel","Astra",1600);
		System.out.println(auto2.marca);
		
		Automobile auto3 = new Automobile("Peugeot", "2008", 1200, (byte) 2, false);
		
		System.out.println(auto3.toString());
		
		
		
		

	}

}
