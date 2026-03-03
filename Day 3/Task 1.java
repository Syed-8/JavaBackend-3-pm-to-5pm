//Write a Java program to find the largest of two numbers.

package Assignmnet3;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the Second number:");
		int num2 = sc.nextInt();
		
		
		 if(num1>num2) {
			 System.out.println("Largest number is :"+num1);
		 }
		 
		 if(num2>num1) {
			 System.out.println("Largest number is : "+num2);
		 }
		 
		 if(num1==num2) {
			 System.out.println("both are equal" );
		}
		 
	}
}
