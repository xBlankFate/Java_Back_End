package aIntro;

public class CastDelDato {

	public static void main(String[]args) {
		
		int num1=52;
		int num2=24;
		
		
		int somma=num1+num2;
		System.out.println("la somma vale"+somma);
	
		int differenze=num1-num2;
		System.out.println("La differenza vale"+differenze);
		
		int prodotto=num1*num2;
		System.out.println("Il prodotto vale "+ prodotto);
		
		double quoziente=(double)num1/num2;
		System.out.println("il quoziente vale "+quoziente);
		
		double restoDiv=num1%num2;
		System.out.println("il resto della divisione "+restoDiv);
		
		//uso della classe Math possiamo modificare dei numeri 
		
		double valore=3.999999;
		//math.round() arrotonda all'intero sup o inf in base al valore del numero
		long valoreArrotondato= Math.round(valore);
		System.out.println(valoreArrotondato);
		//math.Abs()restituisce il valore assoluto di un numero(la parte positiva)
		int numNeg=-47;
														
		double numeroNegAbs=Math.abs(numNeg);
		System.out.println(numeroNegAbs);
		
		double numRand=Math.random();
		int interoSup= (int)Math.ceil(numRand);
		System.out.println(numRand);
		System.out.println(interoSup);
		
		double radice=Math.sqrt(81);
		System.out.println(radice);
		
	
		
		
		
		
		
		
		
		
	}
}
