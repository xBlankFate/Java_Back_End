package b_statenebtFondamentali;

import java.util.Arrays;



public class forStatement {

	public static void main(String[] args) {
	
		//il ciclo for ci permette di iterare un'operazione,un blocco di codice
		
		for(int i=0; i<10;i++) {
			System.out.println("giro num:"+(i+1));
		}
		//for inverso
		for(int i=10;i<0;i--){
			System.out.println(i);
		}
	String []mesi= {"gennaio","febbraio","marzo","aprile","maggio","giugno"};
	
	for(int i=0; i<mesi.length;i++) {
		System.out.println(mesi[i]);
	}
	//ForEach
	//Ctrl f per cambiare nome 
	for(String mese:mesi) {
		System.out.println(mese);
	}
	int[]punteggiLvl= {25,18,30,12,5,64};
	int summ=Arrays.stream(punteggiLvl).sum();
	for(int i=0;i<punteggiLvl.length;i++) {
		System.out.println("punteggio Lvl: "+(i+1)+" "+punteggiLvl);
		if(punteggiLvl[i]<20) {
			System.out.println("livello non superato");
		}else if(summ<60) {
			System.out.println("livello non superato");
		}
	}
	
	}
}
