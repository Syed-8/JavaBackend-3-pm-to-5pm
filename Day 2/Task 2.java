package Assignment2;
import java.util.Scanner;


public class AccountBalance {

	int acono;
	String accholname;
	static String bank = "HDFC";
	double accountbalance;
	
	
	public void display() {
		System.out.println(" Acno: "+ acono);
		System.out.println("Acholder: "+ accholname);
		System.out.println("Bank: "+ bank);
		System.out.println("accountbalnce : "+ accountbalance);
		
	}
	
	public void withdraw(double amount) {
		double am = amount;
		accountbalance = accountbalance-am;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		AccountBalance A1 = new AccountBalance();
		
		A1.acono=224466;
		A1.accholname="Irfan";
		A1.bank="HDFC";
		A1.accountbalance=43000;
		
		  System.out.println("before widthdraw amount");
	        A1.display();
	        
	        System.out.println("enter the widthdraw amount");
	        double withdrawam=sc.nextDouble();
	        A1.withdraw(withdrawam);
	        
	        System.out.println("after widthdraw amount");
	        A1.display();

		
	}

}
