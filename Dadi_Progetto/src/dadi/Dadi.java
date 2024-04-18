package dadi;

import java.util.Random;

public class Dadi {
	
	int numFacce;
	Random numRand;
	int dadoTruccato;
	
	
	public Dadi(int numFacce) {
		
		this.numFacce=numFacce;
	}
	//lancio normale
	public int lancio() {
		
		
		numRand=new Random();
		int faccia= numRand.nextInt(1,this.numFacce+1);
		
		return faccia;
	} 
	//dadi truccati
	public int trucco() {
		
		numRand=new Random();
		int faccia= numRand.nextInt(3,6);
		
		return faccia;
		
	}
}
