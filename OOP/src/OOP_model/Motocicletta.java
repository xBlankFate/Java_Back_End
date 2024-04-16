package OOP_model;

public class Motocicletta {
	
	public String marca = "Kawasaki";
	public String modello;
	public int cilindrata;
	public byte ruoteMotrici = 1;
	public boolean isAcceso = false;
	
	public Motocicletta(String modello, int cilindrata) {
		
		this.modello=modello;
		this.cilindrata=cilindrata;
	}

	@Override
	public String toString() {
		String descrizione="Motociletta: "+marca+ " "+modello+ " cilindrata: "+cilindrata+ " ruote motrici "+ruoteMotrici+" stato motore "+isAcceso;
		
		return descrizione;
	}
	
}
