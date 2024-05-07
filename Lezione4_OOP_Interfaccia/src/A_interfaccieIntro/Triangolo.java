package A_interfaccieIntro;

public class Triangolo implements FiguraGeometrica {
	
	private double lato1;
	private double lato2;
	private double lato3;
	
	private double area;
	private double perimetro;
	
	public Triangolo(double lato1, double lato2, double lato3) {
		super();
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
	}

	@Override
	public double calcolaArea() {
		double semiP = this.calcolaPerimetro() / 2;
		this.area = Math.sqrt(semiP*(semiP - this.lato1)* (semiP - this.lato2) * (semiP - this.lato3));
		return this.area;
	}

	@Override
	public double calcolaPerimetro() {
		this.perimetro = this.lato1 + this.lato2 + this.lato3;
		return perimetro;
	}

	@Override
	public String presentaFigura() {
		String presentazione = "Triangolo: \narea: "+ this.area+ "\nperimetro: "+ this.perimetro;
		return presentazione;
	}
	
	
	
}
