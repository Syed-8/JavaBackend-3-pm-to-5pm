package Assignment4;
import java.util.Scanner;

public class Task1 {

	
	static int count(int num) {
		int count = 0;
		
		while(num!=0) {
			num=num/10;
			count ++;
		}
		
		return count ;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit number : ");
		int num = sc.nextInt();
				
			
		if(num==0) {
			System.out.println("Enter the number ");
		}else {
			if(num<0);
			num=-num;
			System.out.println("Enter the number "+count(num));
		}
		
	}

}
