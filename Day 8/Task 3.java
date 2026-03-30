package Assignment8;
class Employeee{
	int empid;
	String empname;
	double salary;
	
	void CalculateBonus() {
		System.out.println("With bonus :"+salary);
	}
}

class Manager extends Employeee{
	void CalculateBonus() {
		double bonus = salary+salary*15/100;
		System.out.println("empid: "+empid  +"empaName :"+empname+ "manager salary: "+bonus);
	}
}

class Developer extends Employeee{
	void CalculateBonus() {
		double bonus = salary+salary*23/100;
	System.out.println("empid: "+empid  +"empaName :"+empname+ "manager salary: "+bonus);
	}
}

class Intern extends Employeee{
	void CalculateBonus() {
		double bonus = salary+salary*35/100;
		System.out.println("empid: "+empid  +"empaName :"+empname+ "manager salary: "+bonus);
	}
}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employeee e1 = new Employeee();
		e1.empid=21;
		e1.empname="irfu";
		e1.salary=20000;
		e1.CalculateBonus();
		
		Manager m1 = new Manager();
		m1.empid=22;
		m1.empname="Afu";
		m1.salary=25000;
		m1.CalculateBonus();
		
		Developer d1 = new Developer();
		d1.empid=23;
		d1.empname="Giri";
		d1.salary=36000;
		d1.CalculateBonus();
		
		Intern i1 = new Intern();
		i1.empid=24;
		i1.empname="ragul";
		i1.salary=30000;
		i1.CalculateBonus();
	}

}
