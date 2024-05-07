package model;

import java.util.Scanner;

import util.GeneraDati;

public class BloccoNote implements GeneraDati {
	
	private String nota;
	private int numeroNota = 0;
	
	

	@Override
	public String generaHTML() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generaXML() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generaJSON() {
		// TODO Auto-generated method stub
		return null;
	}

	public BloccoNote(String nota, int numeroNota) {
		
		this.nota = nota;
		this.numeroNota = numeroNota;
	}
	
	
	
	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		Scanner s = new Scanner(System.in);
		String Nota =s.nextLine();
		this.nota = Nota;
	}

	public int getNumeroNota() {
		return numeroNota;
	}

	public void setNumeroNota(int numeroNota) {
		this.numeroNota = numeroNota ++;
	}

	@Override
	public String generaTXT() {
		String txt = "Numero nota: "+this.numeroNota + "/nContenuto nota: "+this.nota;
		return txt;
	}
}
