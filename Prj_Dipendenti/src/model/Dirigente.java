package model;

public class Dirigente extends Dipendente {

	private double pagaBase = 1000;
	private int numeroDip;
	private double quotaDip = 200;
	
	public Dirigente(String nome) {
		
		super(nome);
		this.ruolo = "dirigente";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcolaStipendio() {
		// TODO Auto-generated method stub
		this.stipendio = pagaBase + (numeroDip * quotaDip);
		
	}

	public int getNumeroDip() {
		return numeroDip;
	}

	public void setNumeroDip(int numeroDip) {
		this.numeroDip = numeroDip;
	}

}
