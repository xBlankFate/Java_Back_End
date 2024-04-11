package classi;

public class Classi {

	//dichiaro degli attributi all'interno della mia classe
	
	int base;
	int altezza;
	
	public static void main(String[] args) {
		
		//qui posso costruire l'oggetto rettangolo utilizzando la parola chiave new
		//attenzione quando uso la parola chiave new sto facendo uso del "costruttore di default"
		//i costruttori hanno lo stesso nome della classe
		
		
		//creo un nuovo oggetto "rettangolo" istanza delle classe Classi
		Classi rettangolo=new Classi();
		
		//per poter dare un valore alle proprieta del rettangolo utilizzo la notazione punto
		
		rettangolo.altezza=5;
		rettangolo.base=6;
		
		int area =rettangolo.altezza* rettangolo.base;
		int perimetro=(rettangolo.altezza+rettangolo.base)*2;
		
		System.out.println("l'altezza vale : "+rettangolo.altezza);
		System.out.println("la base vale : "+rettangolo.base);
		System.out.println("l'area vale :"+area);
		System.out.println("il perimetro del rettangolo vale :"+perimetro);
		
		//Classi è un nuovo tipo, complesso
		//istanzio un nuovo oggetto di tipo Classi
		Classi rettangolo2=new Classi();
		
		rettangolo2.base=4;
		rettangolo2.altezza=8;
		
		int area2= rettangolo2.altezza * rettangolo2.base;
		
		System.out.println("l'area del rettangolo2 vale: "+area2);
		
		
		
		
		
		
		
		
		
		
	}
	
		
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
