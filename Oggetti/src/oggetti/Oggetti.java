package oggetti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Oggetti {

	public static void main(String[] args) {
		
	//ARRAY LIST
		
	/*	ArrayList<String> animali= new ArrayList<String>();
		
		
		animali.add("Cane");
		animali.add("Gatto");
		animali.add("Canarino");
		animali.add("Squalo");
		
		//per poter richiamare un elemento uso il metodo .get(indice)
		
		System.out.println(animali.get(0));
		System.out.println(animali.get(2));

		//l'array è scarabile;posso anche un elemento con .remove()
		
		animali.remove(3);
		
		//per conoscere la misura dell'arraylist uso .size()
		
		System.out.println("il mio array è composto da "+animali.size()+" elementi");
		
		for(int i=0;i<animali.size();i++) {
			System.out.println(animali.get(i));
		}
		
		System.out.println("stampo con foreach");
		
		animali.add("Delfino");
		animali.add("Struzzo");
		
		
		for(String animale:animali) {
			System.out.println(animale);
		}
		
		//faccio un arrayList di numeri
		//ATT:nell'operatore diamond del costruttore posso anche non dichiarare nulla
		ArrayList<Integer> voti=new ArrayList<>();
		voti.add(10);
		voti.add(5);
		voti.add(12);
		voti.add(1);
		
		for (Integer voto:voti) {
			System.out.println(voto);
		}
		//per creare un arrayList posso far riferimento al tipo list
		
		List<String> parole=new ArrayList<>();
		
		parole.add("ciao");
		parole.add("come");
		parole.add("stai");
		
		for(String parola:parole) {
			System.out.println(parola);
		}
		
		List<String> nomi=new ArrayList<>(Arrays.asList("dario","luisa","pasquale","gennaro","anna","luca"));
		
		for(String nome:nomi) {
			System.out.println(nomi);
		}
		
		
		//voglio creare un array partendo da un ArrayList
		
		List<String>colori=new ArrayList<String>();
		colori.add("rosso");
		colori.add("giallo");
		colori.add("blu");
		colori.add("verde");
		colori.add("rosa");
		colori.add("bianco");
		colori.add("nero");
		
		String[]coloriPR=new String[colori.size()];
		
		//uso un ciclo for per caricare l'array 
		
		for(int i=0;i<colori.size();i++) {
			coloriPR[i]=colori.get(i);
			
		}
		//uso il ciclo for per scorrere l'ArrayPR
		
		for (String colorePR:coloriPR) {
			System.out.println(colorePR);
		}
		
		Collections.reverse(colori);
		
		//oppure
		//mescola:Collections.shuffle(colori);
		// mette in ordine :Collections.sort(colori);
	    /*dentro Collections. ordine inverso con comparazione 
		Collections.reverseOrder();
		
		
		
		System.out.println("stampo i colori al contrario ");
		
		for(String colore:colori) {
			System.out.println(colore);
		}
		*/
		////////////////////////////////////////////
		
		
		
		//Esercitazione
		
		int contatore=0;
		int contatore2=0;
		
		List <String> nomi=new ArrayList<>(Arrays.asList("Luca","Simone","Anna","Gianluigi","Davide","Mario","Luigi","Daria","Marco","Andrea"));
		
		for(int i=0;i<nomi.size();i++) {
			contatore++;
			System.out.println(nomi.get(i)+" "+contatore);
			
		}
		
		for(String nome:nomi) {
			contatore2++;
			System.out.println(nome+" "+contatore2);
		}
		
		System.out.println(nomi.size());
		
		nomi.clear();
		
		System.out.println(nomi);
		
		boolean vuoto=nomi.isEmpty();
		//////////////////////////////////////
		System.out.println(vuoto);
		
		Scanner s=new Scanner(System.in);
		
		Random r=new Random();
		
		Integer numeriPop=0;
		
		System.out.println("gioco del lotto quanti numeri vuoi estrarre?");
		
		ArrayList <Integer> numeri=new ArrayList<>();
		
		for(int i=0;i<90;i++) {
			numeriPop++;
			numeri.add(numeriPop);
		}
		int num=s.nextInt();
		
		int Casuale=0;
		
		for(int j=0;j<num;j++) {
			Casuale=r.nextInt(90);
			if(numeri.contains(num)) {
			System.out.println(Casuale);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static char[] numeroCas(int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
