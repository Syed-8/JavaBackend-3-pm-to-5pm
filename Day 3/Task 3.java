//Write a Java program to count the number of digits in a number.

package Assignmnet3;
import java.util.Scanner;
public class Task3 {
	
	static int Digit=0;
	
public static int count(int n ) {
	if(n==0){
		return Digit ;
	}
	
	Digit++;
	
	return count(n/10);
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit : ");
		
		int num=sc.nextInt();
		
		System.out.println("This is Digit numbers :"+count(num));
	}

}
  