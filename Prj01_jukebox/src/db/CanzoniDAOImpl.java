package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.canzone;

public class CanzoniDAOImpl implements CanzoneDAO {

	private Connessione miaConn;//connessione al db
	private PreparedStatement ps;//contenitore per istruzioni
	private ResultSet rs;//contenitore per risultati
	
	public CanzoniDAOImpl() {
	miaConn = new Connessione();
}	
	
	@Override
	public void addCanzone(canzone c) {
		
		try {
			
			ps = miaConn.getConn().prepareStatement(ADD);//preparo la q
			ps.setString(1, c.getTitolo());//binding 1 parametro
			ps.setString(2, c.getCantante());//binding 2 param
			ps.execute();//esecuzione istruzione
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		}

	}

	public List<canzone> getCanzoni() {
		List<canzone> canzoni = new ArrayList<canzone>();
		try {
			ps = miaConn.getConn().prepareStatement(FIND_ALL);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String titolo = rs.getString("titolo");
				String Cantante = rs.getString("cantante");
				canzone c = new canzone(titolo, Cantante);
				canzoni.add(c);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return canzoni;
	}
}
