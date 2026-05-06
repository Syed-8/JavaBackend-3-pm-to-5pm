package JDBC_Assingment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Task3 {
	static final String DB_URL = "jdbc:mysql://localhost:3306/StudentRecords";
	static final String USER = "root";
	static final String PASS = "Irfan@8800";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Connection conn = DriverManager.getConnection(DB_URL,USER,PASS)) {
			
			PreparedStatement stmt = conn.prepareStatement(
					"insert into employee (empid,empname,empsalary,empdepartmentid) values (?,?,?,?)");
					
				stmt.setInt(1,1);
				stmt.setString(2,"ifa");
				stmt.setInt(3, 40000);
				stmt.setInt(4, 101);
				

				int i = stmt.executeUpdate();
				
				System.out.println(i +"records inserted");
				
				conn.close();
				
				}catch(Exception e) {
					System.out.println(e.getMessage());
					
				}
	}

}
