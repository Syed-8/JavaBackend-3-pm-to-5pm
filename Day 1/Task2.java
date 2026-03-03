package Assignment1;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Yours Grade : ");
		 int mark = sc.nextInt();
		 
		String grade = "";
		if (mark>=90) {
			grade= "A";
		}
		
		else if (mark>=75) {
			grade = "B";
		}
		
		else if (mark>=60){
			grade = "C";
		}
		
		else if (mark>=40){
			grade = "D";
		}
		
		else {
			grade = "Failed";
		}
		System.out.println("Grade:"+grade);
	}

}