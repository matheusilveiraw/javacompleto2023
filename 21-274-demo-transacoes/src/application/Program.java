package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbIntegrityException;

public class Program {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
						
			st = conn.createStatement();
						
			int rows1 = st.executeUpdate();
			
			System.out.println("Done! Rows affected " + rowsAffected1);
			
		} catch (SQLException e) { 
			throw new DbIntegrityException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}
}
