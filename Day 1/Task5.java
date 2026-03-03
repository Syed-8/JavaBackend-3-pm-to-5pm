package Assignment1;
import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int  number = sc.nextInt();
		
		Task5 obj = new Task5();
		
		int cont = obj.number(number);
		
		if(cont!=0) {
			System.out.println("The values are "+ cont);
			
		}
		else {
			System.out.println("The Enter the value Positive Number :");
		}
		
	}
	
	public int number (int number) {
		int tempNum=number;
		int value=15;
		if(tempNum>=0) {
			return value;
		}
		else
			return 0;

	}
}