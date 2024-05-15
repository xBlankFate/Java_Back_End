package model;

public class Impiegato extends Dipendente {

	private int oreLav;
	private double pagaBase = 8.5;
	
	public Impiegato(String nome) {
		super(nome);
		this.ruolo = "impiegato";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcolaStipendio() {
		
		// TODO Auto-generated method stub
		this.stipendio = oreLav * pagaBase;
		
	}

	public int getOreLav() {
		return oreLav;
	}

	public void setOreLav(int oreLav) {
		this.oreLav = oreLav;
	}

	public double getPagaBase() {
		return pagaBase;
	}

	public void setPagaBase(double pagaBase) {
		this.pagaBase = pagaBase;
	}
	
	
	
}
