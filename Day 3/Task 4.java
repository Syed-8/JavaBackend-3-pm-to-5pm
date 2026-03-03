//Write a Java program to find sum of first N natural numbers.
package Assignmnet3;
import java.util.Scanner;
public class Task4 {
	
	static int sum = 0;
	
	public static int digit(int n) {
		if(n==0) {
			return sum;
			
		}
		
		sum=sum+n;
		return digit (n-1);
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Naturals Numbers:");
		
		int num = sc.nextInt();
		System.out.println("Naturals Numbers :"+ digit(num));
	}

}
