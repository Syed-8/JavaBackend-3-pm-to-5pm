package JDBC_Assignment2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;



public class Task4 {
	static final String DB_URL = "jdbc:mysql://localhost:3306/StudentRecords";
	static final String USER = "root";
	static final String PASS = "Irfan@8800";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Connection conn = DriverManager.getConnection(DB_URL,USER,PASS)) {
			
			CallableStatement cs = conn.prepareCall(
					"update into studentrecords studentid,studentmark values (?,?)");
					
				cs.setInt(1,3);
				cs.setDouble(2, 88.00);
				
				

				int i = cs.executeUpdate();
				
				System.out.println(i +"records inserted");
				
				conn.close();
				
				}catch(Exception e) {
					System.out.println(e.getMessage());
					
				}
	}

}
