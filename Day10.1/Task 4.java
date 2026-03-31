package Assignment_Abs;

abstract class Account{
	
	abstract void CalculateInterest(int amount);
}

class SavingsAccount extends Account{
	void CalculateInterest(int amount) {
		amount *=10000;
		System.out.println("The Amount of SavingAccount is "+amount);
	}
}

class CurrentAccount extends Account{
	void CalculateInterest(int amount) {
		int interest =amount*10;
		amount +=interest;
		System.out.println("The Amount Balance Current Account is "+amount);
	}
}


public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account sa = new SavingsAccount();
		sa.CalculateInterest(5);
		Account a1 = new CurrentAccount();
		a1.CalculateInterest(1000);
	}

}
