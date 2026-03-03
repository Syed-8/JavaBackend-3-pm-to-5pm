//4.A local variable total is assigned inside an if condition when items are available in stock.
//The value of total is printed outside the condition block.
package Assignment1;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String item1="pen";
		String item2="note";
		String item3="eraser"; 
		System.out.print("Enter the item name : ");
		String Itemname=sc.next();
		int total=0;
		 if(item1.equals(Itemname)) {
			 total=10;
			 System.out.println("pen is available in the stack");
		 }
		 else if(item2.equals(Itemname)) {
			 total=50;
			 System.out.println("pen is available in the stack");
		 }
		 else if(item3.equals(Itemname)) {
			 total=6;
			 System.out.println("pen is available in the stack");
		 }
		 else {
			 System.out.println("The given item is not available in the stack");
		 }
		 System.out.println("Total $"+total);
	}

}