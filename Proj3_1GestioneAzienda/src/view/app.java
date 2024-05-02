package view;

import Model.Dipendente;
import controller.aziendaCtrl;

public class app {

	public static void main(String[] args) {
		
		aziendaCtrl azienda = new aziendaCtrl("plutos");
		
		azienda.addDipendente("mario", "rossi", "manager");
		azienda.addDipendente("laura", "rossi", "manager");
		azienda.addDipendente("fra", "rossi", "manager");

		for (Dipendente dip : azienda.) {
			
		}
	}

}
