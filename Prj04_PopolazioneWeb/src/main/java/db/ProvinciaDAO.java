package db;

import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import controller.Provincia;
import model.ProvinciaModel;

public class ProvinciaDAO implements ProvincieDAO{

	private Connessione cn;
	private java.sql.Statement st;
	private ResultSet rs;
	
	private List<Provincia> provinceList;
	private Map<Integer,Provincia> provinceMap;
	
	
	
	public ProvinciaDAO() {
	
		
		cn = new Connessione();
		provinceList = new ArrayList<Provincia>();
		provinceMap = new HashMap<Integer,Provincia>();
		
	}
	
	private List<Provincia> getProvincia (){
		
		try {
			st = cn.getConn().createStatement();
			rs = st.executeQuery(FIND_ALL);
			while (rs.next()) {
				
				ProvinciaModel p = new ProvinciaModel();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				p.setFemmine(rs.getInt("femmine"));
				p.setMaschi(rs.getInt("Maschi"));
				p.setId(rs.getInt("id"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return provinceList;	
		
	}	
	
	@Override
	public List<String> getRegioni() {
	
		try {
			st = cn.getConn().createStatement();
			rs = st.executeQuery(FIND_ALL);
			while (rs.next()) {
				
				ProvinciaModel p = new ProvinciaModel();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				p.setFemmine(rs.getInt("femmine"));
				p.setMaschi(rs.getInt("Maschi"));
				p.setId(rs.getInt("id"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return provinceList;
		
	}

	@Override
	public List<Provincia> getProvinciaByRegione(String regione) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Provincia getProvinciaById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
