package demo;

import forme.Punto;
import forme.Quadrato;
import forme.Rettangolo;
import forme.Segmento;
import forme.Triangolo;

public class GeometriaTester {

	public static void main(String[] args) {
		
		
		Punto a = new Punto (2, 3);
		Punto b = new Punto (5, 3);
		Punto c = new Punto (4, 8);
		
		Segmento ab = new Segmento(a,b);
		Segmento bc = new Segmento(b,c);
		
		
		//creo un triangolo 
		
		Triangolo  tr1= new Triangolo(a, b, c);
		System.out.println(tr1.toString());
		System.out.println("il perimetro del triangolo: "+tr1.getPerimetro());
		System.out.println("l'area vale: "+tr1.getArea());
		
		
		//creo un rettandolo
		
		Rettangolo ret1 = new Rettangolo(ab, bc);
		
		System.out.println(" perimetro : "+ ret1.getPerimetro());
		System.out.println(" area :"+ ret1.getArea());
		
		System.out.println(ab.calcolaLungSegmento());
		
		//creo un quadrato
		Quadrato q1 = new Quadrato(ab);
		
		System.out.println("L'area vale : "+ q1.getArea());
		System.out.println("Il perimetro vale : "+ q1.getPerimetro());
		//ATT: se non definisco un toString nel quadrato allora recupero il toString() del rettangolo
		System.out.println(q1.toString());
		
	}

}
