package Assignment2;
import java.util.Scanner;

public class StudentsStatement{
	
String name;
int roll;

 void marks(){
	 
Scanner sc=new Scanner(System.in);
System.out.print("Ente your marks for social : ");
int Tamil =sc.nextInt();
System.out.print("Ente your marks for english : ");
int English=sc.nextInt();
System.out.print("Ente your marks for maths : ");
int Maths=sc.nextInt();
System.out.print("Ente your marks for science : " );
int Science=sc.nextInt();
System.out.print("Ente your marks for tamil : ");
int SocialScience =sc.nextInt();
int Totalmarks= Tamil+English+Maths+Science+SocialScience;
System.out.println("Total Marks : "+Totalmarks);

}
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 StudentsStatement s1 =new StudentsStatement();
	
     System.out.println("Enter details for Student 1");
     System.out.print("Enter Name : ");
     s1.name=sc.nextLine();
     System.out.print("Enter Roll Number: ");
     s1.roll=sc.nextInt();
     sc.nextLine(); 
     s1.marks();


}
}

