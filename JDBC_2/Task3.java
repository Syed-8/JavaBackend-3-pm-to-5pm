package JDBC_Assignment2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Task3 {
	static final String DB_URL = "jdbc:mysql://localhost:3306/StudentRecords";
	static final String USER = "root";
	static final String PASS = "Irfan@8800";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS)){
			
			CallableStatement cs = conn.prepareCall(" call updateuser (studentid, studentname, studentage, studentgender, studentmark) VALUES (?, ?, ?, ?, ?)");
			
			cs.setInt(1,3);
			cs.setString(2, "afa");
			cs.setInt(3, 20);
			cs.setString(4, "female");
			cs.setDouble(5, 93.75);
			
			cs.execute();
			
			System.out.print("Your Records Has Been Done");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
