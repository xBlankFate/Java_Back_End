package model;



public class Dipendente {
	public int matricola;
	public String nome;
	public String cognome;
	public int OreLavorate;
	public int PagaOraria;
	public int guadagno;

	
	public Dipendente(int matricola, String nome, String cognome, int oreLavorate, int pagaOraria, int guadagno) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.OreLavorate = oreLavorate;
		this.PagaOraria = pagaOraria;
		this.guadagno = OreLavorate * PagaOraria;
	}




	@Override
	public String toString() {
		return "Dipendente [matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome + ", OreLavorate="
				+ OreLavorate + ", PagaOraria=" + PagaOraria + ", guadagno=" + guadagno + "]";
	}
	
}
