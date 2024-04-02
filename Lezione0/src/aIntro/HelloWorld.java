package aIntro;

public class HelloWorld {

	public static void main(String[] args) {
		//dichiaro e assegno delle variabili
		String mioNome="Denis";
		String mioCognome="Crilia";
		
		int eta=22;
		eta++;
		//dichiaro
		String corso;
		//assegno
		corso="Java Back End";
		//vari è una tipizzazione debole
		var istituto="immaginazione e lavoro";
		istituto="lavoro e immaginazione";
		
		var numCivico=22;
		
		String saluto="Ciao "+ mioNome+" "+ mioCognome+" ho"+eta+" anni"+"\nLavoro con"+istituto+" al numero "+numCivico+ "di via carlo alberto";
		
		System.out.println(saluto);
		
		
		
	}

}
