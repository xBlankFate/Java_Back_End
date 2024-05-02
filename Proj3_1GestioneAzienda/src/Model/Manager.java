package Model;

public class Manager extends Dipendente{

	private int moltiplicatore = 3;
	
	public Manager(String nome, String cognome, String ruolo) {
		super(nome, cognome, ruolo);
		
		calcolaStipendio(moltiplicatore);
	}

}
