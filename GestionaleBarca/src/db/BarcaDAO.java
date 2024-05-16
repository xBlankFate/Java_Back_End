package db;

import java.util.List;

import com.crilia.barche.Barca;



public interface BarcaDAO {
	String FIND_ALL = "select * from gestionale_barche";
	String ADD = "insert into gestionale_barche (Marca,Modello,Lunghezza,Prezzo)values (?,?,?,?)";
	
	public void addBarca(Barca barca);
	List<Barca> getBarche();
	
}
