package Assignment7;
import java.util.Scanner;

public class BankAccount {
	
	int Accountnumber ;
	String AccountHoldername;
	int balance;
	
	BankAccount(int n,String h,int b){
		Accountnumber=n;
		AccountHoldername=h;
		balance=b;
	}
	
	void deposit(double amount){
		amount= balance+amount;
	}
	
	void displayBalance() {
		System.out.println("Update Balance :"+ balance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount :");
		double amount =  sc.nextDouble();	
		BankAccount A1 = new BankAccount(756800,"John",25000);
		
		A1.deposit(amount);
		A1.displayBalance();
		
	}

}
