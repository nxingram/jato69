package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	private final String URL = "jdbc:mysql://localhost:3306/jato69";
	private final String USER = "app_java"; 
	private final String PASS = "java_2022!";
	
	private Connection conn = null;
	
	
	public Connection getConn() {
		
		if(conn==null) {
			connetti();
		}
		return conn;
	}
	
	
	private void connetti() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("connessione, ok");
		} catch (SQLException e) {
			System.err.println("si e' verificato un errore " + e.getMessage());
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}
	
	public void disconnetti() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Sei gia' disconnesso");
		}
		System.out.println("Disconnesso");
	}
	

}
