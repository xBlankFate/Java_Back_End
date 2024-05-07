package model;

import util.GeneraDati;

public class Prodotto implements GeneraDati {

	private String BloccoNote;
	private String marca;
	private String codice;
	private double prezzo;
	private long id;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String generaHTML() {
		String html = "<h1>" + this.marca+ "</h1>";
		html += "<p> id: "+ this.id + "</p>";
		html += "<p> codice: "+ this.codice + "</p>";
		html += "<p> prezzo: <strong> "+ this.prezzo + " €</strong></p>";
		
		return html;
	}
	@Override
	public String generaXML() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String generaJSON() {
		String json = "{id: " + this.id + ", marca: " + this.marca + ",prezzo: "+ this.prezzo + "}";
		return json;
	}
	
	public String getBloccoNote() {
		return BloccoNote;
	}
	public void setBloccoNote(String bloccoNote) {
		BloccoNote = bloccoNote;
	}
	@Override
	public String generaTXT() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
