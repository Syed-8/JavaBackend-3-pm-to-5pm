package Assignment6;

public class CompanySystem {
	int employeeID;
	String employeename;
	
	CompanySystem(){
		employeeID=100;
		employeename="syed";
	}
	
	CompanySystem(int id , String name){
		this.employeeID=100;
		this.employeename="syed";
	}
	
	void display() {
		System.out.println("Employe ID :"+employeeID);
		System.out.println("EmployeeName :"+employeename);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanySystem cs = new CompanySystem();
		
		cs.display();
		
	}

}
