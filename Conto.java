package c_contoCorrente;

public class Conto {
	
	private double numeroConto;
	private String intestatario;
	private double saldo;
	private String pinCarta;
	
	
	public String preleva(String pin, double importo) {
		if (pin.equals(pinCarta)) {
			if (saldo>importo) {
				saldo-=importo;
				return "Hai appena prelevato "+importo;
			}else {
				return "Non ha abbastanza soldi";
			} 
			}else {
		}		return "Mi dispiace non puoi prelevare, PIN Errato!";
	}
	
	public String deposita(String pin, double importo) {
		if (pin.equals(pinCarta)) {
			 saldo+=importo;
				return "Hai appena depositato "+importo;
	}else {
		return "Mi spiace non puoi depositare, PIN errato!";
		}
	}

	
	
	public double getNumeroConto() {
		return numeroConto;
	}

	public void setNumeroConto(double numeroConto) {
		this.numeroConto = numeroConto;
	}

	public String getIntestatario() {
		return intestatario;
	}

	public void setIntestatario(String intestatario) {
		this.intestatario = intestatario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setPinCarta(String pinCarta) {
		this.pinCarta = pinCarta;
	}
	

	
	
}

