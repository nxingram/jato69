package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Libro;

public class LibroDAO {

	private Connessione c = new Connessione();
	private Connection conn = c.getConn();
	private Statement stat = null;
	private boolean rs = false;

	public void addLibro(Libro l) {
		try {
			String titolo = l.getTitolo();
			String query = "insert into libri(titolo) values('"+titolo+"')";
			this.conn = this.c.getConn();
			this.stat = this.conn.createStatement();
			rs = this.stat.execute(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
