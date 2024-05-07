package view;

import java.io.File;

import model.Prodotto;
import util.LeggiScriviFile;

public class main {

	public static void main(String[] args) {
		
		Prodotto p = new Prodotto();
		p.setId(10214);
		p.setMarca("Plutos");
		p.setCodice("ABC123");
		p.setPrezzo(2850);
		
		File destinazione = new File("./paginaWeb.html");
		
		LeggiScriviFile.scrivi(destinazione, p.generaHTML());
		
		File destinazioneJSON = new File ("./objectJson");
		LeggiScriviFile.scrivi(destinazioneJSON,p.generaJSON());
		
		
		
	}

}
