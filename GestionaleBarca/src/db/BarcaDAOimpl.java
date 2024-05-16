package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.crilia.barche.Barca;


public class BarcaDAOimpl implements BarcaDAO{


	private Connessione miaConn;//connessione al db
	private PreparedStatement ps;//contenitore per istruzioni
	private ResultSet rs;//contenitore per risultati
	
	public BarcaDAOimpl() {
	miaConn = new Connessione();
}	
	
	public void addBarca(Barca Barca) {
		
		try {
			
			ps = miaConn.getConn().prepareStatement(ADD);
			ps.setString(1, Barca.getMarca());
			ps.setString(2, Barca.getModello());
			ps.setInt(3, Barca.getLunghezza());
			ps.setDouble(4, Barca.getPrezzo());
			ps.execute();
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		}
	}

	public List<Barca> getBarche() {
		List<Barca> Barche = new ArrayList<Barca>();
		try {
			ps = miaConn.getConn().prepareStatement(FIND_ALL);
			rs = ps.executeQuery();
			
				String marca = rs.getString("Marca");
				String modello = rs.getString("Modello");
				int lunghezza = rs.getInt(5);
				int prezzo  = rs.getInt(20);
				Barca b = new Barca(marca, modello, lunghezza,prezzo);
				Barche.add(b);
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Barche;
	}
}
