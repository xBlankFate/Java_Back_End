package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	private final String URL = "jdbc:mysql://localhost:3306//java_backend";
	private final String USER = "app_goal";
	private final String PASS = "goal_2024!";
	
	private Connection conn;
	
	public Connection getConn() {
		
		if(conn == null) {
			
			connetti();
		
		}
		
		return conn;
	
	}
	
	private void connetti() {
		
		try {
			
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("sei connesso al db");
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.err.println("non sei connesso " + e.getMessage());
		
		}
	}
	
	private void disconnetti() {
		
		if (conn != null) {
			
			try {
				
				System.out.println("stai spegnendo la macchina");
				conn.close();
			
			} catch (SQLException e) {
				
				System.out.println("sei già connesso al db ");
				e.printStackTrace();
				
			}
			
		}
		
	}
}
