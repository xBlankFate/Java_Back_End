package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String URL = "jdbc:mysql://127.0.0.1:3306/java_backend";
	private final String USER = "app_goal";
	private final String PASS = "goal_2024!";
	
	private Connection conn = null;

	private void connetti() {

		try {
			this.conn = DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public Connection getConn() {
		if(conn == null) {
			connetti();
		}
		
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	
	
}
