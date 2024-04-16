package OOP_tester;

import OOP_model.Bicicletta;

public class Bicicletta_tester {

	public static void main(String[] args) {
		
		Bicicletta bici1=new Bicicletta("Cannondaile", "c-byke", (byte)2, 21);
		
		System.out.println(bici1.toString());
		bici1.accelera(200);
		bici1.accelera(100);
		bici1.rallenta(60);
		bici1.calcolaVelocitaMax();
		
		System.out.println(bici1.toString());
		
		System.out.println("ALTRA BICICLETTA");
		
		Bicicletta bici2= new Bicicletta("Bianchi", "Bartali", (byte)2, 10);
		
		bici2.accelera(800);
		bici2.calcolaVelocitaMax();
		
		System.out.println(bici2.toString());
		
		

	}

}
