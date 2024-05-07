package A_interfaccieIntro;

public class Cerchio implements FiguraGeometrica{

	private double raggio;
	private double area;
	private double perimetro;
	
	public Cerchio(double raggio) {
		
		this.raggio = raggio;
	}

	@Override
	public double calcolaArea() {
		 this.area = Math.PI * Math.pow(raggio, 2);
		
		return area;
	}

	@Override
	public double calcolaPerimetro() {
		 this.perimetro = 2*Math.PI * this.raggio;
		return perimetro;
	}

	@Override
	public String presentaFigura() {
		String presentazione = "Cerichio: \narea: "+ this.area+ "\nperimetro: "+ this.perimetro;
		return presentazione;
	}

}
