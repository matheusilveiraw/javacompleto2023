package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
			st = conn.prepareStatement("INSERT INTO seller " + "(Name, Email, BirthDate, BaseSalary, DepartmentId) " + "VALUES " + "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			//os pontos de interrogação são placeholders para os valores que virão no setstring abaixo
			//por exemplo, o primeiro ?, é relativo ao valor um, o segundo ? é relativo ao 2
			
			st.setString(1, "Matheus Carnage");
			st.setString(2, "matheus@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("01/07/1996").getTime()));
			st.setDouble(4, 6000.00);
			st.setInt(5, 4);
			
//			st = conn.prepareStatement("insert into department (Name) values ('D1'), ('D2')", Statement.RETURN_GENERATED_KEYS);
			//isso aqui é pra botar dois departmanetos lá na tabela mas aí precisa comentar todo o código pra funfar, vai retornar dois ids
			
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) { 
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()){ 
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}
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
