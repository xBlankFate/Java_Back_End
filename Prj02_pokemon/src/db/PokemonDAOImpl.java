package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import model.Pokemon;

public class PokemonDAOImpl implements PokemonDAO {
	
	private Connessione miaConn = new Connessione();
	private Statement istruzionePerDB;
	private ResultSet risultatiDB;
	
	private Map<Integer,Pokemon> mappa = new HashMap<>();
	
	public PokemonDAOImpl() {
	
		miaConn = new Connessione();
		mappa = new HashMap<>();
		this.getPokemonMap();
		
	}
	
	

	@Override
	public List<Pokemon> getAllPokemon() {
		// TODO Auto-generated method stub
		return new ArrayList<Pokemon>(mappa.values());
	}

	@Override
	public Map<Integer, Pokemon> getPokemonMap() {
		
		try {
			this.istruzionePerDB = miaConn.getConn().createStatement();
			this.risultatiDB = this.istruzionePerDB.executeQuery(FINDALL);
			
			while(risultatiDB.next()) {
				int id = risultatiDB.getInt(1);
				String name = risultatiDB.getString(2);
				String type1 = risultatiDB.getString(3);
				String type2 = risultatiDB.getString(4);
				Pokemon p = new Pokemon(id, name, type1, type2);
				mappa.put(id, p);
			}
		} catch (SQLException e) {
		
		e.printStackTrace();
		}
		return mappa;
	}

	@Override
	public List<Pokemon> getAllPokemonByType(String Type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pokemon getPokemonById(int id) {
		// TODO Auto-generated method stub
		
		
		return  mappa.get(id);
	}

	@Override
	public List<String> getTipiPokemon() {

		Set<String> tipi = new TreeSet<>();
		
		for (Pokemon p : getAllPokemon()) {
			
			tipi.add(p.getType1());//tutti i pokemon hanno il tipo1
			
			if(!p.getType2().isEmpty()) {
				
				tipi.add(p.getType2());
				
			}
		
		}
		
		return new ArrayList<>(tipi);
	
	}
		
}
