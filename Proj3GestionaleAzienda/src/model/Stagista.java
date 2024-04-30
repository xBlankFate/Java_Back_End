package model;

public class Stagista extends Dipendente {

	public Stagista(int matricola, String nome, String cognome, int oreLavorate, int pagaOraria, int guadagno) {
		super(matricola, nome, cognome, oreLavorate, pagaOraria, guadagno);
		OreLavorate = 160;
		PagaOraria = 10;
		guadagno = OreLavorate * PagaOraria;
	}

}
