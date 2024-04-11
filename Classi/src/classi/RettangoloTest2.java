package classi;

import java.security.DomainCombiner;

public class RettangoloTest2 {

	double altezza;
	double base;
// il costruttore deve avere lo stesso nome della classe
// attenzione: esiste un costruttore di default affidato ad ogni classe, il seguente
// il seguente costruttore è a firma vuoto.La firma di un metodo è l'insieme dei parametri passati in ingresso
	
	public RettangoloTest2() {
		super();
	}
	
//  creo il metodo costruttore con firma piena
	
	public RettangoloTest2(double altezza,double base) {
		//this.altezza (fa riferimento alla prioprietà di classe) = altezza (fa  riferimentoal parametro passato al costruttore)
	
		this.altezza=altezza;
		this.base=base;
		
	}
	public static void main(String[] args) {
		RettangoloTest2 rettangolo= new RettangoloTest2(4.2, 7.4);
		System.out.println(rettangolo.altezza);
		System.out.println(rettangolo.base);
		
		double area=rettangolo.altezza*rettangolo.base;
		double perimetro=(rettangolo.altezza+rettangolo.base)*2;
		
		System.out.println("l'area vale: "+area);
		System.out.println("il perimetro vale: "+perimetro);
	}
}
