package db;

import java.util.List;

import model.Dipendente;

public interface DipendenteDao {

	 String FIND_ALL = "select * from dipendenti";
	 String ADD_DIPENDENTE = "insert into dipendenti (nomre , ruolo) values (?,?)";
	 
	 List<Dipendente> getDipendente();
	 
	 void addDipendente(Dipendente d);
	 
}
