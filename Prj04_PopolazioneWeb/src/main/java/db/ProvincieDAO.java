package db;

import java.util.List;

import controller.Provincia;

public interface ProvincieDAO {

	String FIND_ALL = "select * from popolazione_italiana_regioni";
	
	List<String> getRegioni();
	List<Provincia> getProvinciaByRegione(String regione);
	Provincia getProvinciaById(int id);
	
	
}
