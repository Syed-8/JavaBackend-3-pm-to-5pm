package JDBC_Assignment2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;



public class Task2 {
	static final String DB_URL = "jdbc:mysql://localhost:3306/StudentRecords";
	static final String USER = "root";
	static final String PASS = "Irfan@8800";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Connection conn = DriverManager.getConnection(DB_URL,USER,PASS)) {
			
			CallableStatement stmt = conn.prepareCall(
					"insert into employee (empid,empname,empsalary,empdepartmentid) values (?,?,?,?)");
					
				stmt.setInt(1,2);
				stmt.setString(2,"mustha");
				stmt.setInt(3, 35000);
				stmt.setInt(4, 102);
				

				int i = stmt.executeUpdate();
				
				System.out.println(i +"records inserted");
				
				conn.close();
				
				}catch(Exception e) {
					System.out.println(e.getMessage());
					
				}
	}

}
