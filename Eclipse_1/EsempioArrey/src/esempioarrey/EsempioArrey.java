package esempioarrey;

import java.util.IntSummaryStatistics;
import java.util.Random;

public class EsempioArrey {

	private static final int IntSummaryStatistics = 0;

	public static void main(String[] args) {
		
		
	/*	int[] unArray= new int[10];
		unArray[0]=1;
		unArray[1]=2;
		unArray[2]=3;
		System.out.println(unArray[1]);//sto stampando l'array alla posizione 2
		
		System.out.println(unArray[8]); //se non specificato i valori numerici valgono 0
										//i booleani valgono false
										//le stringhe valgono "";
		
		//System.out.println(unArray[10]); //errore perchè non esiste la posizione 10
		
		String[] noteMusicali=new String[7];
		
		noteMusicali[0]="do";
		noteMusicali[1]="re";
		noteMusicali[2]="mi";
		noteMusicali[3]="fa";
		noteMusicali[4]="sol";
		noteMusicali[5]="la";
		noteMusicali[6]="si";
		
		int lunghezza=noteMusicali.length;//senza parentesi perchè è una prioprietà
		
		System.out.println("l'array contiene "+lunghezza+" elementi");
		
		String[] colori= {"bianco","nero","giallo","blu"};
		//elemento in posizione X
		System.out.println(colori[2]);
		//penultimo elemento
		System.out.println(colori[colori.length-2]);//giallo
		//stampare elementi col ciclo for
		for(int i=0;i< colori.length;i++) {
			System.out.println(colori[i]);
		}
		///////////////////////////////////////////////
		//forEach //per ogni
		for(String colore:colori) {
			System.out.println(colore);
		}
		//valorizzare un'arrey col ciclo for
		//dichiaro un array di 5 elementi
		int[] arr=new int[5];
		//ho popolato l'array con valori da 0 a 4
		for(int i=0;i<5;i++) {
			arr[i]=i;
		}
		//li stampo col forEach(senza indice)
		for(int valori :arr) {
			System.out.println(valori);
		}
		//li stampo col for normale(con indice)
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		////////////////////////////////////////////////
		//riempire un arrey con numeri casuali
		
		*/int arrCasuali[]=new int[10];
		Random r=new Random();
		//stampo senza indice
		/*for(int i=0;i<arrCasuali.length;i++) {
			arrCasuali[i]=r.nextInt(11);//da 0 a 10
		}
		for(int valCasuali:arrCasuali) {
			System.out.println(valCasuali);
		}
		//stampo con indice
		for(int i=0;i<arrCasuali.length;i++) {
			System.out.println(arrCasuali[i]);
		}*/
		System.out.println(arrCasuali[IntSummaryStatistics]);
	}

}
