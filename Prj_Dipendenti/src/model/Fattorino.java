package model;

public class Fattorino extends Dipendente {

	private int consegne;
	private double pagaBase = 5;
	
	
	
	public Fattorino(String nome) {
		
		super(nome);
		this.ruolo = "fattorino";
		
	}

	public void calcolaStipendio() {
		// TODO Auto-generated method stub
		this.stipendio = this.pagaBase * this.consegne;

	}

	public int getConsegne() {
		return consegne;
	}

	public void setConsegne(int consegne) {
		this.consegne = consegne;
	}
	
	

}
