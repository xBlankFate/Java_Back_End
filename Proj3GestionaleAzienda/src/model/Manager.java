package model;

public class Manager extends Dipendente{

	public Manager(int matricola, String nome, String cognome, int OreLavorate,int PagaOraria, int guadagno) {
		super(matricola, nome, cognome, OreLavorate, PagaOraria, guadagno);
		OreLavorate = 160;
		PagaOraria = 20;
		guadagno = OreLavorate * PagaOraria;
	}
	
}
