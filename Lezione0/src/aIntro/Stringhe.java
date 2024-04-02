package aIntro;

public class Stringhe {

	public static void main(String[] args) {
		String benvenuto="ciao benvenuto nell'app";
		
		//possono anche dichiarare una stringa utilizzando il suo costruttore
		
		String s1=new String("ciao utente");
		
		int s1Length=s1.length();
		System.out.println("la stringa s1 ha "+ s1Length+" caratteri");
		
		int benvenutoLength=benvenuto.length();
		
		//posso confrontare la misura delle due stringhe
		boolean misura =s1Length==benvenutoLength;
		System.out.println(misura);
		
		//altri metodi per stringhe
		String frase="il miglior browser al mondo è Edge";
		String fraseVera=frase.replace("Edge","Chrome");
		System.out.println(fraseVera);
		
		//metodi per la ricerca
		
		System.out.println(fraseVera.contains("Chrome"));
		System.out.println(fraseVera.contains("FireFox"));
		//metodi per comparare 
		String frase2="Ciao a tutti!";
		String frase3="Ciao a tutte!";
		
		System.out.println(frase2.equalsIgnoreCase(frase3));
		
	}

}
