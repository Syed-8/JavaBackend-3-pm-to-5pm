package Assingment11;
import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the mark: ");
		int marks = sc.nextInt();
		sc.nextLine();
		System.out.print("enter the name of the student: ");
		String name = sc.nextLine();

		try {
			if (name == null || name.isEmpty()) {
				throw new Exception("enter the Student name!");
			}

			if (marks < 0 || marks > 100) {
				throw new Exception("Marks invalid, enter a valid mark");
			} else {
				if (marks > 80) {
					System.out.println("Grade A obtained by " + name);

				} else if (marks > 60) {
					System.out.println("Grade B obtained by " + name);

				} else if (marks > 40) {
					System.out.println("Grade C obtained by " + name);

				} else {
					System.out.println(" Failed " + name);
				}
			}
		} catch (Exception e) {

			System.out.println("error occured: " + e.getMessage());
		} finally {
			System.out.println("Completed");
		}	
	
		
	}

}
