package c_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//gli array sono contenitori di elementi simili tra loro tipo identico valore diverso
		//sono 0 -based
		String[] studenti=new String[12];
		
		studenti[0]="Simone";
		studenti[1]="Andrea";
		studenti[2]="Fabio";
		studenti[3]="Raffaele";
		studenti[4]="Lannuce";
		studenti[5]="Marco";
		studenti[6]="Denis";
		studenti[7]="Enrico";
		studenti[8]="Davide";
		studenti[9]="Giada";
		studenti[10]="Abderrahim";
		studenti[11]="Erika";
		
		//richiamo un valore attraverso il suo indice
		System.out.println(studenti[4]);
		//stampo la proprietà lenght che mi fornisce la misura
		System.out.println("Numeri studenti in aula\n"+studenti.length);
		
		//posso riassegnare un valore
		studenti[0]="Simo";
		System.out.println(studenti[0]);
		
		//leggo l'array di studenti
		
		for(int i=0;i<studenti.length;i++) {
			System.out.println(studenti[i]);
		}
		
		int []voti=new int[12];
		
		for(int i=0;i<voti.length;i++) {
			double votoCasuale=Math.ceil((Math.random()*13)+17);
			
			voti[i]=(int)votoCasuale;
		}
		for(int i=0;i<studenti.length;i++) {
			System.out.println(studenti[i]+" voto: "+voti[i]);
		}
		
		int [][] matrice =new int [5][6];
		int contatore = 1;
		
		for(int i=0;i<matrice.length;i++) {
			for(int j=0;j<matrice[i].length;j++) {
				matrice[i][j]=contatore;
				contatore++;
			}
		}
		
		for(int i=0;i<matrice.length;i++) {
			for(int j=0;j<matrice[i].length;j++) {
				System.out.print(matrice[i][j]+"   ");
			}
			System.out.println();
		}
		//ordinare un array
		String []parole= {"ciao","come","stai","tutto","bene","grazie","arrivederci"};
		
		Arrays.sort(parole);
		for(int i=0;i<parole.length;i++) {
			System.out.println(parole[i]);
		}
		
	}

}
