package Assignment1;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Product Amount");
		
		int amount=sc.nextInt();
		int afterdiscount = 0;
		int totalamountad = amount-afterdiscount;
		
		if(amount>=5000) {
			System.out.println("Enter the Discount Value:");
			int discount=sc.nextInt();
			afterdiscount=amount*discount/100;
			totalamountad=amount-afterdiscount;
			System.out.println("They Given Discount:");
		}
		else{
			System.out.println("A Discount ia not Provided:");
		}
		
			System.out.println("Discount"+afterdiscount);
			System.out.println("Total Amount paided:"+totalamountad);
		
		
	}

}