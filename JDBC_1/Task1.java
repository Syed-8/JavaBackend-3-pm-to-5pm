package JDBC_Assingment1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Task1 {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/StudentRecords";
	static final String USER = "root";
	static final String PASS = "Irfan@8800";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS))  {
					
					PreparedStatement stmt = conn.prepareStatement(
	"insert into StudentRecords (studentid,studentname,studentage,studentgender,studentmark) values(?,?,?,?,?)");
					
					
//				stmt.setInt(1, 1);
//				stmt.setString(2,"Ifa");
//				stmt.setInt(3, 20);
//				stmt.setString(4, "male"); 
//				stmt.setDouble(5,95.44);
				
				stmt.setInt(1, 2);
				stmt.setString(2, "Syed");
				stmt.setInt(3, 22);
				stmt.setString(4, "male");
				stmt.setDouble(5, 88.75);
				
				int i = stmt.executeUpdate();
				
				System.out.println(i +"records inserted");
				
				conn.close();
				
				}catch(Exception e) {
					System.out.println(e.getMessage());
					
				}
		
		}
		
	}

