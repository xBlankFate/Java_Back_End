package rettangolotest3;

public class RettangoloTest3 {

	double altezza;
	double base;
	String nomeFigura;
	
// per generare un costruttore utilizzando i campi uso Alt+Shift+S->Generate Constractor


public RettangoloTest3(double altezza, double base, String nomeFigura) {
	super();
	this.altezza = altezza;
	this.base = base;
	this.nomeFigura = nomeFigura;
}
 //	Costruisco dei metodi per la mia classe.il double rappresenta il tipo di valore che restituirà con il return
public double calcolaArea() {
	double area=this.altezza* this.base;
	return area;
 }

public double calcolaVolume(double profondita) {
	double volume=this.altezza*this.base*profondita;
	return volume;
}

public static void main(String[] args) {
	RettangoloTest3 rettangolo=new RettangoloTest3(8.5,6.4,"rettangolino");
	
	System.out.println("l'area del "+ rettangolo.nomeFigura+" vale: "+rettangolo.calcolaArea());
	System.out.println("il volume del rettangolo vale: "+rettangolo.calcolaVolume(4));
	//posso fare il siso di rettangolo ottenendo la descrizione presente del toString()---
	System.out.println(rettangolo);
 }
//metodo toString(), ci fornice una rappresentazione veloce dell'oggetto in formato stringa
@Override
public String toString() {
	return "RettangoloTest3 [altezza=" + altezza + ", base=" + base + ", nomeFigura=" + nomeFigura + "]";
 }
}
