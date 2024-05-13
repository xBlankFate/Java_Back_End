package db;

import java.util.List;

import model.canzone;

public interface CanzoneDAO {
	
	//proprieta sono implicitamente public final
	String FIND_ALL = "select * from canzoni";
	String ADD = "insert into canzoni (titolo,cantante)values (?,?)";
	
	
	//metodi implicitamente public e abstract
	void addCanzone(canzone c);
	List<canzone> getCanzoni();
	
	
	
}
