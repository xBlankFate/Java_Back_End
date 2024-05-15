package model;

public abstract class Dipendente {

	private static int counter = 1;
	
	protected String nome;
	protected String ruolo;
	private int matricola;
	protected double stipendio;
	
	public Dipendente(String nome) {
		
		this.nome = nome;
		this.matricola = counter++;
	
	}
	
	
	
	public double getStipendio() {
		return stipendio;
	}



	public abstract void calcolaStipendio();

	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", ruolo=" + ruolo + ", matricola=" + matricola + ", stipendio=" + stipendio
				+ "]";
	}



	public String getNome() {
		return nome;
	}



	public String getRuolo() {
		return ruolo;
	}
	
	
	
}
