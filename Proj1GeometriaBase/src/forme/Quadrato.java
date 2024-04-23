package forme;

public class Quadrato extends Rettangolo{

	//il quadrato è un lato ripetuto 4 volte
	//il quadrato è un rettangolo particolare
	
	public Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato,lato);
		this.lato = lato;
	}

	@Override
	public String toString() {
		return "Quadrato [lato=" + lato + "]";
	}
	
	
}
