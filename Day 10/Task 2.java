package Assignment10;
import java.util.Scanner;

public class AllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
	      System.out.println("Enter The Size");
	      int size=sc.nextInt();
	      int []arr=new int[size];
	      
	      System.out.println("Enter the ArrayValues : ");
	      for (int i=0;i<size;i++) {
	    	  arr[i]=sc.nextInt();
	      }
	      
	      int sum=0;
	      for (int i=0;i<size;i++) {
	    	  sum=sum+arr[i];
	    	 
	      }
	      System.out.println("Enter The ArrayValues : "+ sum);
	      
		
		
	}

}
