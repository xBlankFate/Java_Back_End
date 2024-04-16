package OOP_model;

import java.util.ArrayList;
import java.util.List;

public class Libro {
	
	public String titolo;
	String autore;
	List<String> generi = new ArrayList<String>();
	int numPagine;
	String casaEditrice;
	boolean isNuovo;
	double prezzo;
	
	public Libro(String titolo, String autore, List<String> generi, int numPagine, String casaEditrice, boolean isNuovo,
			double prezzo) {

		this.titolo = titolo;
		this.autore = autore;
		this.generi = generi;
		this.numPagine = numPagine;
		this.casaEditrice = casaEditrice;
		this.isNuovo = isNuovo;
		this.prezzo = prezzo;
	}
	
	public String toString() {
		
		String condizione;
		if(isNuovo) {
			condizione="nuovo";
		}else {
			condizione="usato";
		}
		
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", generi=" + generi + ", numPagine=" + numPagine
				+ ", casaEditrice=" + casaEditrice + ", condizione=" + condizione + ", prezzo=" + prezzo + "]";
	}
	
	
	
	
	
	
}
