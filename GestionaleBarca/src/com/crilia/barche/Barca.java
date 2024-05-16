package com.crilia.barche;

public  class Barca {
	
	private int id;
	private String Marca;
	private String Modello;
	private int lunghezza;

	private double prezzo;

	public Barca(String marca, String modello, int lunghezza, double prezzo) {
		super();
		this.Marca = marca;
		this.Modello = modello;
		this.lunghezza = lunghezza;
	
		this.prezzo = prezzo;
	}
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModello() {
		return Modello;
	}
	public void setModello(String modello) {
		Modello = modello;
	}
	public int getLunghezza() {
		return lunghezza;
	}
	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}
//	public boolean isPrenotata() {
//		return prenotata;
//	}
//	public void setPrenotata(boolean prenotata) {
//		this.prenotata = prenotata;
//	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Barca [Marca=" + Marca + ", Modello=" + Modello + ", lunghezza=" + lunghezza + ", prenotata="
				+ ", prezzo=" + prezzo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
}
