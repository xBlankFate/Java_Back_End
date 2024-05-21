package model;

public class BollettaGas extends Bolletta {

	private double consumoMQ;
	private final double costoMateria = 0.10;
	
	public BollettaGas( String intestatario, String tipoServizio, String dataScadenza,double consumoMQ) {
		super( intestatario, tipoServizio, dataScadenza);
		// TODO Auto-generated constructor stub
		
		this.consumoMQ = consumoMQ;
		
	}

	@Override
	public double calcoloConsumo() {

		double costoBolletta = this.consumoMQ * this.costoMateria;
		
		return costoBolletta;
	
	}

	@Override
	public String toString() {
		return "BollettaGas [consumoMQ=" + consumoMQ + ", costoMateria=" + costoMateria + super.toString() + "il costo totale è " + calcoloConsumo() + "]";
	}

	
	
}
