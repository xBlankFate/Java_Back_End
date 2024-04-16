package oop;

public class Automobile {
	
	String marca = "Fiat";
	String modello;
	int cilindrata;
	byte ruoteMotrici = 2;
	boolean statoMotore = false;
	
	
	//voglio specificare il costruttore di default 
	
	public Automobile() {
		
	}
	
	//specifico un costruttore per una sola caratteristica
	
	public Automobile(String marca) {
		
		this.marca=marca;
	}
	public Automobile(String marca,String modello, int cilindrata) {
		
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		
	}
	//ALT Shift S --> generate costructor using fields 

	public Automobile(String marca, String modello, int cilindrata, byte ruoteMotrici, boolean statoMotore) {
	
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.ruoteMotrici = ruoteMotrici;
		this.statoMotore = statoMotore;
	}

	@Override
	public String toString() {
		return "Automobile [marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata + ", ruoteMotrici="
				+ ruoteMotrici + ", statoMotore=" + statoMotore + "]";
	}
	
	
}
