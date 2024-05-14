package a_colori;

public enum Colore {
	
	BLUE("blu"),
	GREEN("verde"),
	RED("rosso"),
	YELLOW("giallo"),
	BLACK("nero"),
	ORANGE("arancione");
	private String nomeIta;
	
	private Colore(String nomeIta) {
	
		this.nomeIta = nomeIta;
		
	}
	
	public String GetNomeIta() {
		return nomeIta;
	}
	

}
