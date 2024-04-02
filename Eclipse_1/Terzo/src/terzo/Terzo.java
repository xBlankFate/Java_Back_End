package terzo;

public class Terzo {

	public static void main(String[] args) {
		
		System.out.println("ciao a tutti");
		//le parole vanno sempre tra doppie virgolette 
		System.out.println("come state?");
		
		//int memorizza valori interi 
		//double valori con la virgola
		//String memorizza delle parole
		//char memorizza un carattere solo
		//boolean memorizza dati di tipo vero o falso
		
		//tipi di dato primitivi
		int eta=22;
		double temperatura=34.7;
		String nome="Denis Andrei Crilia";
		//per riutilizzare la stessa informazione non si scrive più il common
		char sesso='M'; //I caratteri con un apice singolo
		boolean maggiorenne=true;//false
		
		System.out.println(eta);//sto stampando 22
		System.out.println(temperatura);//sto stampando 34.7
		System.out.println(nome);//sto stampando denis andrei crilia
		System.out.println(sesso);//sto stampando il M
		System.out.println(maggiorenne);//sto stampando true o false in base al sesso
		/////////////////////////////////////////////////////////////////////////////////////////
		//ho dichiarato due numeri
		int primo=10;
		int secondo=5;
		System.out.println(primo+secondo);
		//se vogliamo riutilizzare il numero 
		int risultato=primo+secondo;
		System.out.println(risultato);
		
		System.out.println(primo-secondo);
		System.out.println(primo*secondo);
		System.out.println(primo/secondo);
		/////////////////////////////////////////////////////////////////////////////////////
		
		
		char a1='a';
		char a2='b';
		char a3='c';
		System.out.println(a1+""+a2+""+a3);
		//mettere lo spazio tra loro fa si che il programma non legga la tabella ascii lettere=numeri
		char aMaiuscola=65;
		System.out.println(aMaiuscola);
		aMaiuscola++; //++ = +1

		System.out.println(aMaiuscola);
		
		aMaiuscola--;//-- = -1
		System.out.println(aMaiuscola);
		//////////////////////////////////////////////////////////////////////////////////////
		
		boolean vero=true;
		boolean falso=true;
		
		eta=18;
		System.out.println(maggiorenne=eta>=18);//serve come risposta in base al numero 
		
		boolean b3=!vero;// !simbolo di negazione 
		System.out.println(b3);
		
		
		//////////////////////////////////////////////////////////////////////////////////////
		
		final double PIGRECO=3.1415; 
		//final serve per dichiarare la costante cioè un valore che non deve più cambiare
		
		///////////////////////////////////////////////////////////////////////////////////////
		
		//tipo di dati interi dal più piccolo al più grande 
		byte b;//puù contenere valori che vanno da -128 a +127 ->256 valori possibili 2^8=256//il più piccolo varole che possiamo utilizzare
		short s;//-32768 +32767 +di 65 mila valori possibili 2^16
		long l;//tipo di dato in assoluto più grande
		
		//CAST IMPLICITO
		//lo scopo del cast è di avere da una parte all'altra dell'uguale lo stesso tipo di dato
		int i=56;
		long lunga=i;
		
		int a=10;
		double dbld=a; //stampa in automatico il numero mettendo 0
		System.out.println(dbld);
		//CAST ESPLICITO
		//scrivere il command per primo prende tutti i numeri di quel command es long=2M
		long l2=56;
		int i2=(int)l2;//perdi tutti i dati fuori dalla portata
		
		double d3=3.999999999;
		int i3=(int)d3;
		
		int num=130;
		byte piccolo=(byte)num;//riprendendo il command forzi la trasformazione del numero
		
		System.out.println(piccolo);
		
		byte mioByte=12;
		byte mioByte2=15;
		
		byte tot=(byte)(mioByte+mioByte2);
		//per java il tipo predefinito è int e considera tutto tale a meno che non si forza richiamando il command
		///////////////////////////////////////////
		
		char car='x';
		
		
		//CLASSI WRAPPER-> estendono le potenzialità dei tipi primitivi
		Integer intero=123;
		Double virgola=3.14;
		Character carattere='x';
		Boolean booleano=true;
			
		
		System.out.println(carattere.toUpperCase(car));//metto in maiuscolo il carattere
		
		String str="TruE";
		str.toLowerCase();//mette tutto in minuscolo
		System.out.println(str.toLowerCase());
		String strMinuscolo=str.toLowerCase();
		boolean b5=Boolean.parseBoolean(strMinuscolo);//trasforma la stringa in un booleano
		System.out.println(b5);//è un booleano che vale true
		
		String uno="1";
		int numeroConvertito=Integer.parseInt(uno);//converto la stringa in un numero
		
		int dieci=10;
		
		String dieciStringa=Integer.toString(dieci);
		System.out.println(dieciStringa);
		
		int num1=3;
		int num2=4;
		
		int massimo=Integer.max(num1, num2);//max per trovare il massimo numero
		
		System.out.println(massimo);
		
		int x=10;
		System.out.println(++x);//pre incremento, prima incrementa e poi stampa
		System.out.println(x++);//post incremento, prima stampa e dopo incrementa
		/////////////////////////////////////////////////////////////////////
		//per cambiare la disposizione creare un'altro var = var1
		int var1=3;
		int var2=8;
		int var3=var1;
		
		//3      8
		System.out.println(var1+" "+var2);
		
		var1=var2;
		var2=var3;
				
						    //8       3
		System.out.println(var1+" "+var2);
		//con \n vado a capo tra le virgolette
		
		
				
		
		
		
		
		
	
	
	}
	

}
