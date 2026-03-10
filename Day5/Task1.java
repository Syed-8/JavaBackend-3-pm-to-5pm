package Assignment5;

 public class Employee {
	 
		 int empID;
		 String empName;
		 double basicSalary;
		 
		Employee (int id , String name , double salary){
			 empID = id ;
			 empName = name;
			 basicSalary = salary;
		 }
		 
		double CalculateGrossSalary() {
			
			
			double hra = 20 % basicSalary;  // 20% of basic
	        double da = 10 % basicSalary;   // 10% of basic
	        double gross = basicSalary + hra + da;

	        if(basicSalary>50000) {
	        	double bonus = 5 * basicSalary;
	        	gross=+bonus;
	        }
	        
	        return 0;

		}
		
		 void display() {
		
			 	System.out.println("Employee ID: " + empID);
		        System.out.println("Employee Name: " + empName);
		        System.out.println("Basic Salary: " + basicSalary);
		        System.out.println("Gross Salary: " + CalculateGrossSalary());
		           
		 }
		 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee (01 , "syed",40000);
		Employee e2 = new Employee (02 , "Afri",77000);
		Employee e3 = new Employee (03 , "Sham",79000);
		
		e1.display();
		e2.display();
		e3.display();
		
	}
	
}
 