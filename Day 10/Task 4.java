package Assignment10;
import java.util.Scanner;

public class LargestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number: ");
		
		int size=sc.nextInt();
		int []arr=new int[size];
		
		System.out.println("Enter the ArrayValues: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		for (int i=0;i<size;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		
		System.out.println("largest number: "+max);
		
	}

}
