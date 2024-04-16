package OOP_model;

public class Bicicletta {
	
	String modello;
	String marca;
	byte numRuote;
	int velocita = 0;
	int frequenza = 0;
	int numMarce;
	public Bicicletta(String modello,String marca,byte numRuote,int numMarce) {
		
		this.modello = modello;
		this.marca = marca;
		this.numRuote = numRuote;
		this.numMarce = numMarce;
			
	}
	//modificatori TipoDiRitorno nomeMetodo(parametri(?){}
	//con void non ho return
	public void accelera(int incFrequenza) {
		frequenza=frequenza+incFrequenza;
		System.out.println("stai accelerando, la tua frequenza attuale è: "+frequenza);
	}
	
	public void rallenta(int decFrequenza) {
		
		frequenza=frequenza-decFrequenza;
		System.out.println("stai decelerando, la tua frequenza attuale è: "+frequenza);
	}
	
	public void calcolaVelocitaMax() {
		velocita = frequenza*numMarce;
		System.out.println("la velocità massima è "+velocita);
	}
	
	public String toString() {
		return "Bicicletta [modello=" + modello + ", marca=" + marca + ", numRuote=" + numRuote + ", velocita="
				+ velocita + ", frequenza=" + frequenza + ", numMarce=" + numMarce + "]";
	}
	
}
