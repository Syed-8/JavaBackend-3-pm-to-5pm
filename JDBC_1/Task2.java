package JDBC_Assingment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Task2 {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/StudentRecords";
	 static final String USER = "root";
	 static final String PASS = "Irfan@8800";
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

		         PreparedStatement stmt = conn.prepareStatement
		        		 (" update StudentRecords set studentmark=? where studentid=?" );


		         stmt.setDouble(1, 65.88);
		         stmt.setInt(1, 1);
  
		         int i = stmt.executeUpdate();

		         System.out.println(i + " records inserted");

		         conn.close();

		     } catch (Exception e) {
		        System.out.println(e.getMessage());
		     }
	}

}