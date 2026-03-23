package Assignment2;
import java.util.Scanner;

public class EmpSalarySystem {

	int EmpID;
	String EmpName;
	double EmpSalary;
	
	public void display() {
		System.out.println("Employee ID: "+EmpID);
		 System.out.println("Employee NAME: "+EmpName);
		 System.out.println("Employee Basic Salaty: "+EmpSalary);
	}
	
	public void bonus(double amount){
		 Double incrementamount=amount;
		  EmpSalary=(EmpSalary+(EmpSalary*incrementamount)/100);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		EmpSalarySystem  s1=new EmpSalarySystem ();
        s1.EmpID=987040;
        s1.EmpName="SYED";
        s1.EmpSalary=1000.0;
        
        System.out.println("without bounes");
        s1.display();
        
        System.out.println("enter the bounes amount");
        Double bounes=sc.nextDouble();
        s1.bonus( bounes);
        
        System.out.println("Your bounes amount IS: ");
        s1.display();
	}

}
