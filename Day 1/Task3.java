package Assignment1;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String p_username = "Syed";
		String p_password = "1234";
		String Status= "";
		System.out.println("Enter the username");
		String username = sc.nextLine();
		System.out.println("Enter the Password");
		String password = sc.next();
		
		if (p_username.equals(username) && p_password.equals(password)) {
			Status = "Login";
			System.out.println("Its Matching");
		
		}
		
		else {
			Status ="Login UnSuccessfull";
			System.out.println("Not Matched ");
		}
		
	}

}
