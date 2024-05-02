package b_incapsulamento;

public class Main {

	public static void main(String[] args) {
		
		Display d1 = new Display("DispAAA","a03","1024 x 1980");
		
		//leggo le proprietà di d1
		
		//vado a richiamare i metodi get
		System.out.println("Display 1: " + d1.getMarca()+ " "+d1.getModello()+ " "+d1.getRisoluzione());

	}

}
