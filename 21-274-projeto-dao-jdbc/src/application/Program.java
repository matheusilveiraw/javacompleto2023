package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

public class Program {
	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
//		Connection conn = null;
//		Statement st = null;
//		
//		try {
//			conn = DB.getConnection();
//			
//			conn.setAutoCommit(false); //não confirma as alterações automaticamente, ficam pendentes esperando uma confirmação do porgramador que é o conn.commit();
//						
//			st = conn.createStatement();
//						
//			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2222 WHERE DepartmentId = 1");
//			
//			int x = 1;
//			if(x < 2) { 
//				throw new SQLException("Fake error");
//			}
//			
//			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3333 WHERE DepartmentId = 2");
//			
//			System.out.println("Done! Rows affected " + rows1);
//			System.out.println("Done! Rows affected " + rows2);
//			
//			conn.commit(); //confirmação do programador do autocommit
//			
//		} catch (SQLException e) { 
//			try {
//				conn.rollback(); //vai apagar todas alterações que ficaram acumuladas pro banco de dados qnd rolar um erro como acontece nesse exemplo
//				throw new DbException("Transcation rooled back! Caused by " + e.getMessage());
//			} catch (SQLException e1) {
//				throw new DbException("Error trying to rollback! Cause by " + e1.getMessage());
//			}
//		} finally {
//			DB.closeStatement(st);
//			DB.closeConnection();
//		}
		
	}
}
