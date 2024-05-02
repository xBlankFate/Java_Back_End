package Model;

public class Dipendente {

	private static int matricolatore = 1;
	private int matricola;
	private String nome;
	private String cognome;
	private String ruolo;
	private double stipendio = 1000;
	
	public Dipendente(String nome, String cognome, String ruolo) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.ruolo = ruolo;
		this.matricolatore = matricolatore++;
	}
	public double calcolaStipendio(double moltiplicatore) {
		this.stipendio *= moltiplicatore;
		return this.stipendio;
	}
	public String prensetati() {
		String presentazione = this.nome + ""+ this.cognome+"- matr: "+this.matricola;
		return presentazione;
	}
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	public static int getMatricolatore() {
		return matricolatore;
	}
	public int getMatricola() {
		return matricola;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public double getStipendio() {
		return stipendio;
	}
	
}
