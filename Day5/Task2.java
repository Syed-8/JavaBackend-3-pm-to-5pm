package Assignment5;

public class AccountBalance {
	int accountNumber;
	String Holdername;
	double balance;
	
	void deposit(double amount) {
		balance = balance + amount;
		System.out.print("deposit succesfully"+amount);
	}
	
	void withdraw (double amount ){
		 if (amount <= balance) {
	            balance = balance - amount;
	            System.out.println(" withdrawn successfully." + amount);
	        } else {
	            System.out.println("Insufficient balance!");
	        }
	}
	
	
	void displaybalance() {
		System.out.println("Account Holder :"+Holdername);
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Account Balance :"+balance);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountBalance acc1 = new AccountBalance();
		acc1.accountNumber = 4455;
		acc1.Holdername = "irfan";
		acc1.balance = 50000;
		acc1.deposit(5000);
        acc1.withdraw(1000);
        acc1.displaybalance();
		
		
		AccountBalance acc2 = new AccountBalance();
		acc2.accountNumber = 4456;
		acc2.Holdername = "aishu";
		acc2.balance = 90000;
		acc2.deposit(2000);
        acc2.withdraw(1000);
        acc2.displaybalance();
        
        
        
		
	}

}
