package model;

public class Programmatore extends Dipendente {

	public Programmatore(int matricola, String nome, String cognome, int oreLavorate, int pagaOraria, int guadagno) {
		super(matricola, nome, cognome, oreLavorate, pagaOraria, guadagno);
		OreLavorate = 160;
		PagaOraria = 15;
		guadagno = OreLavorate * PagaOraria;
	}

}
