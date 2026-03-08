package Assignment4;
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int original = num;
		int sum = 0;
		int count = 0;
		int var = num;
		
		while(var !=0) {
			var = var /10;
			count++;
		}
		
		var = num;
		while(var !=0) {
			int digit = var%10;
			int power = 1;
			
			for(int i=1;i<=count;i++) {
				power = power*digit; 
			}
			
			sum = sum+power;
			var=var/10;
		}
		
		if(sum==original) {
			System.out.println("It is ArmStrong Number :");
		}else {
			System.out.println("It is not ArmString Number :");
		}
		
		
		
	}

}
