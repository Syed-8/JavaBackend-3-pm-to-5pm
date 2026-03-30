package Assignment8;

class Payment{
	void processpayment() {
		System.out.println("Payments methods Successfully :");
	}
	
}

class CreditClassPayments extends Payment {
	void processpayments() {
		System.out.println("Payments methods Successfully in creditpayment ");
	}
	
}

class DebitCardPayments extends Payment{
	void processpayments() {
		System.out.println("Payments methods Successfully in Debitcardpayments  ");
	}
}

class UPICardPayments extends Payment{
	void processpayments() {
		System.out.println("Payments methods Successfully in UPIcardpayments  ");
	}
} 

public class Payments {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditClassPayments s1 = new CreditClassPayments();
		s1.processpayments();
		
		DebitCardPayments s2 = new DebitCardPayments();
		s2.processpayments();
		
		UPICardPayments s3 = new UPICardPayments();
		s3.processpayments();
		
	}

}
