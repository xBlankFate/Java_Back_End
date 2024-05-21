package model;

public abstract class Bolletta {
	
	private static int CONTATORE = 0;
	
	private int id;
	private String intestatario;
	private String tipoServizio;
	private String dataScadenza;
	
	
	public Bolletta(String intestatario, String tipoServizio, String dataScadenza) {
		
		this.id = ++CONTATORE;
		this.intestatario = intestatario;
		this.tipoServizio = tipoServizio;
		this.dataScadenza = dataScadenza;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public String getIntestatario() {
		return intestatario;
	}


	public void setIntestatario(String intestatario) {
		this.intestatario = intestatario;
	}


	public String getTipoServizio() {
		return tipoServizio;
	}


	public void setTipoServizio(String tipoServizio) {
		this.tipoServizio = tipoServizio;
	}

	public String getDataScadenza() {
		return dataScadenza;
	}


	public void setDataScadenza(String dataScadenza) {
		this.dataScadenza = dataScadenza;
	}
	



	@Override
	public String toString() {
		return "Bolletta [id=" + id + ", intestatario=" + intestatario + ", tipoServizio=" + tipoServizio
				+ ", dataScadenza=" + dataScadenza + "]";
	}


	public abstract double calcoloConsumo();



	
	
}
