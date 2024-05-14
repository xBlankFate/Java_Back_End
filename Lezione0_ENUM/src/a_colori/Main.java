package a_colori;

public class Main {

	public static void main(String[] args) {
		
		Colore primoColore = Colore.BLACK;
		Colore secondoColore = Colore.GREEN;
		System.out.println(secondoColore.GetNomeIta());
		
		
		switch (primoColore) {
		
		case BLACK:
			System.out.println("Hai scelto il colore " + primoColore.GetNomeIta());
			break;
		
		case RED:
			System.out.println("Hai scelto il colore " + secondoColore.GetNomeIta());
		
		default:
			throw new IllegalArgumentException();
			
		}
		

	}

}
