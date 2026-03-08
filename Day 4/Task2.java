package Assignment4;
import java.util.Scanner;

public class Task2 {


	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Total bank balance:10000 " );
	System.out.println("Enter the Withdraw amount ");
	
	int balance = 10000;
	int amount = sc.nextInt();
	
	if (amount>balance) {
		System.out.println("Insufficient balance :" );
	}
	else if (amount<=0) {
		System.out.println("Invalid amount :");
	}
		
	else {
		balance=balance-amount;
		System.out.println("Remaining amount:" +balance);
	}
		 
	
	}

}
