package Database;

import java.util.List;

import model.Bolletta;


public interface BollettaDAO {
	
	String FIND_ALL = "select * from bollette";
	String ADD = "insert into bollette (tipo,consumo,importo,intestatario,data_scadenza)values (?,?,?,?,?)";
	
	void addBolletta(Bolletta b);
	
	List<Bolletta> getBolletta();
	
}
