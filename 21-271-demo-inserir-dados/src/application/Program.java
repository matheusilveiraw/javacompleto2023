package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try { 
			conn = DB.getConnection();
			st = conn.prepareStatement("INSERT INTO seller " + "(Name, Email, BirthDate, BaseSalary, DepartmentId) " + "VALUES " + "(?, ?, ?, ?, ?)");
			//os pontos de interrogação são placeholders para os valores que virão no setstring abaixo
			//por exemplo, o primeiro ?, é relativo ao valor um, o segundo ? é relativo ao 2
			
			st.setString(1, "Matheus Carnage");
			st.setString(2, "matheus@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("01/07/1996").getTime()));
			st.setDouble(4, 6000.00);
			st.setInt(5, 4);
			
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) { 
				st.getGeneratedKeys();
			} else { 
				System.out.println("No rows affected!");
			}
			
			
			System.out.println("Done, rows affected: " + rowsAffected);
		} catch (SQLException e) { 
			e.printStackTrace();
		} catch (ParseException e) { 
			e.printStackTrace();
		} finally { 
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}
}
