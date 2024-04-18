package OOP_model;

public class BloccoNote {

	public String nome = "Blocco Note di Denis";
	Nota[] elencoNote = new Nota[10];
	
	public void addNota(String titolo,String descrizione, int posizione) {
		
		Nota n = new Nota(titolo,descrizione);
		
		elencoNote[posizione] = n;
	
	}
	
	public void stampaBloccoNote() {
		for(int i = 0; i < elencoNote.length ; i++) {
			
			if(elencoNote[i] != null) {
				
				//Att: questo stampaNota() è il metodo della classe Nota
				System.out.println(elencoNote[i].stampaNota());
				
			}
			
		}
	}
	public void pulisciBloccoNote() {
		for(int i = 0; i < elencoNote.length; i++) {
			elencoNote[i] = null;
		}
	}
	public int calcolaPosizioniRestanti() {
		int posRes=0;
		return posRes;
		}
}
