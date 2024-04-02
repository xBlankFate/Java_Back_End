package stringhedate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Stringhe_Date {

	public static void main(String[] args) {
		
		
		Date oggi= new Date();//data di oggi default
		System.out.println(oggi);
		
		LocalDate data=LocalDate.now();//data in formato americano es 2024-03-21 senza ora
		System.out.println(data);
		
		LocalTime ora=LocalTime.now();//ora e basta
		System.out.println(ora);
		
		LocalDateTime dataconOra= LocalDateTime.now();//tutto assieme
		System.out.println(dataconOra);
		
		DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy");//per anche l'ora fare HH:mm:ss
		System.out.println(data.format(formato));//alla data senza ora applico il formato creato con formatter
		
		//esempio con ora print + dataconOra.format(formato));
		//se voglio aggiungere il giorno EEEE con il mese MMMM
		
		//estrarre parti di data:
		int numeroGiorno=LocalDate.now().getDayOfMonth();//numero
		System.out.println(numeroGiorno);
		
		String nomeGiorno=LocalDate.now().getDayOfWeek().name();//giorno
		System.out.println(nomeGiorno);

		String nomeMese=LocalDate.now().getMonth().name();//mese
		System.out.println(nomeMese);
		
		int Anno=LocalDate.now().getYear();
		System.out.println(Anno);
		
		//nomi in italiano:
		String nomeGiornoIta=LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.ITALY);
		System.out.println(nomeGiornoIta);
		
		String nomeMeseIta=LocalDate.now().getMonth().getDisplayName(TextStyle.FULL,Locale.ITALY);
		System.out.println(nomeMeseIta);
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		String parola="ciao";
		String parola2=" a tutti";
		
		String parola3=parola+parola2;
		System.out.println(parola3);
		
		int lunghezza=parola3.length();//questo mi da la lunghezza della stringa
		System.out.println(lunghezza);
		
		boolean iniziaCon=parola3.startsWith("tutti");
		System.out.println(iniziaCon);
		
		boolean finisceCon=parola3.endsWith("tutti");
		System.out.println(finisceCon);
		
		int posTutti=parola3.indexOf("tutti");//le posizioni partono da 0
		System.out.println(posTutti);
		/////////////////////////////////////
		
		String nome ="Denis";
		char ch=nome.charAt(2);//trova il carattere alla posizione 2
		System.out.println(ch);
		
		System.out.println(nome.charAt(nome.length()-2));//trovo la lettere al posto x
		////////////////////////////////////
		String miaStringa="ciao";
		System.out.println(miaStringa.contains("cia"));//versione raccolta
		
		boolean contiene=miaStringa.contains("cia");
		System.out.println(contiene);//versione estesa
		
		int x=10;
		int y=10;
		
		System.out.println(x==y);//== serve per confrontare
		
		String stringa1="ciao";
		String stringa2="ciao";
		
		System.out.println(stringa1==stringa2);//NON SI USA == PER LE CLASSI
		
		boolean uguali=stringa1.equals(stringa2);//si usa .equals
		System.out.println(uguali);
		
		boolean ugualiNoCase=stringa1.equalsIgnoreCase(stringa2);//si usa più spesso .equalsIgnoreCase
		System.out.println(ugualiNoCase);
		
		System.out.println("è vuota? "+stringa2.isEmpty());//empty per vedere se è vuota
		
		String parola4="ciao a tutti";
		String tutti=parola4.substring(7);//gli indici superiori non vengono considerati e ne devo aggiungere sempre 1
		System.out.println(tutti);
		
		String ciao=parola4.substring(0,4);//.substring serve per estrarre una parte della stringa
		System.out.println(ciao);
		/////////////////////////////////////////////////////////////////////////////////////////////////
		
		//per generare numeri casuali abbiamo bisogno della classe random
		
		Random r=new Random();
		
		int casuale=r.nextInt();//genera un numero casuale da -2^31 fino a +2^31
		System.out.println(casuale);
		
		int range=r.nextInt(0,6);//genera un numero in un range (aggiungere sempre +1 perchè non conta gli estremi)
		System.out.println(range);
		
		int estremo=r.nextInt(2,11);//(integer.Max_Value da 0 fino al massimo
		System.out.println(estremo);
		
		double virgola=r.nextDouble(11);//numero con la virgola da 0 a 10
		System.out.println(virgola);
		
		System.out.println(r.nextBoolean());
		
		
		
		
		
		
		
		
		
		
	}

}
