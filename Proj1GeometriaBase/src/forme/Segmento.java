package forme;

public class Segmento {
//il segmento è definito a partire da 2 punti
	
	public Punto a,b;
	
	public double lunghezza;
	
public Segmento(Punto a, Punto b) {
	
	this.a = a;
	this.b = b;
}
 	
	public double calcolaLungSegmento() {		
		
		// come calcolare la lunghezza del segmento sull'asse x y
		this.lunghezza= Math.sqrt(Math.pow((b.x - a.x),2) + Math.pow((b.y - a.y),2));
		
		return lunghezza;
		
	}

	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + ", lunghezza=" + lunghezza + "]";
	}
	
	
	
}
