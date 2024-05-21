package model;

public class BollettaLuce extends Bolletta{
	
	private double consumoKWH;
	private final double costoEnergia = 0.25;
	
	public BollettaLuce( String intestatario, String tipoServizio, String dataScadenza,double consumoKWH) {
		super( intestatario, tipoServizio, dataScadenza);
	
	this.consumoKWH = consumoKWH;
	
	}

	@Override
	public double calcoloConsumo() {
		
		double costoTotale = consumoKWH * costoEnergia;
		
		return costoTotale;
		
	}

	@Override
	public String toString() {
		return "BollettaLuce [consumoKWH=" + consumoKWH + ", costoEnergia=" + costoEnergia + "Bolletta [id=" + this.getId() + ", intestatario=" + this.getIntestatario() + ", tipoServizio=" + this.getTipoServizio()
				+ ", dataScadenza=" + this.getDataScadenza() + "il totale è " + calcoloConsumo() + "]";
	}
	
	
	
}
