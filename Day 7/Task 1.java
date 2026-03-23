package Assignment7;

public class Employee {
	
	int employeeID;
	String Name;
	int Salary;
	
	Employee(int Id,String n ,int S){
		 employeeID = Id;
		Name = n;
	 Salary = S;
	}
	
	void displayEmployee (){
	System.out.println("Employe ID: "+employeeID +"Employee Name "+Name +"Employee Salary :" +Salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee s1=new Employee(1,"Syed",30000);
		Employee s2=new Employee(2,"Fahim",29000);
		Employee s3=new Employee(3,"Sanjay",20000);
		
		s1.displayEmployee();
		s2.displayEmployee();	
		s3.displayEmployee();
		
	}

}
