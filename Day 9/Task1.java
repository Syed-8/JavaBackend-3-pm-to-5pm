package Assignmnet9;
import java.util.Scanner;

interface Payments {
	 void ProcessPayment(double amount );
}

class CreditCardPayment implements Payments{
	public void ProcessPayment(double amount) {
		System.out.println(" The Credit Card Amount :"+amount*5);
	}
}

class UPIPayment implements Payments{
	public void ProcessPayment(double amount) {
		System.out.println("The UPI Payment :"+amount*8);
	}
}

class PayPalPayment implements Payments{
	public void ProcessPayment(double amount) {
		System.out.println("The PalPayaPayment :"+amount*9);
	}
}


public class Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Credit card Amount : ");
		double amount = sc.nextDouble();
		Payments p1 = new CreditCardPayment();
		p1.ProcessPayment(amount);
		
		System.out.println("Enter the UPIcard Amount : ");
		double amount1 = sc.nextDouble();
		Payments p2 = new UPIPayment();
		p2.ProcessPayment(amount);
		
		System.out.println("Enter the UPIcard Amount : ");
		double amount2 = sc.nextDouble();
		Payments p3 = new PayPalPayment();
		p3.ProcessPayment(amount);
	}

}
