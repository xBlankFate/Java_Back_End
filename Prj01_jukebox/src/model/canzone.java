package model;

public class canzone {
	private String titolo;
	private String cantante;
	
	public canzone() {}
	
	public canzone(String titolo, String cantante) {
		
		this.titolo = titolo;
		this.cantante = cantante;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	@Override
	public String toString() {
		return "canzone [titolo=" + titolo + ", cantante=" + cantante + "]";
	}
	
	
}
