package Assignment5;

public class StudentInfo {

	int rollno;
	String name;
	int mark1;
	int mark2;
	int mark3;
	
	int total() {
		 return mark1+mark2+mark3;
	}
	
	int average() {
		return mark1+mark2+mark3/3;
	}
	
	String grade() {
	
		String g;
	int avg = average();
	
	if(avg >= 80) {
		g="A";
	}else if (avg >=60) {
		g="B";
	}else if(avg >=40) {
		g="c";
	}else{
		g="Fail";
	}
	
	return g;
	
	}
	
	void display() {
		System.out.println("RollNo :"+rollno +"Student name :"+name +"Total :"+total() +"Average :" +average() +"Grade :" + grade());
	}
				


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentInfo s1=new StudentInfo();
		StudentInfo s2=new StudentInfo();
		StudentInfo s3=new StudentInfo();
		StudentInfo s4=new StudentInfo();
		StudentInfo s5=new StudentInfo();
		
		s1.rollno=1;
		s1.name="Abi";
		s1.mark1=85;
		s1.mark2=77;
		s1.mark3=59;
		
		s2.rollno=2;
		s2.name="Bala";
		s2.mark1=75;
		s2.mark2=99;
		s2.mark3=85;
		
		s3.rollno=3;
		s3.name="Abul";
		s3.mark1=88;
		s3.mark2=92;
		s3.mark3=80;
		
		s4.rollno=4;
		s4.name="Jamil";
		s4.mark1=30;
		s4.mark2=25;
		s4.mark3=25;
		
		s5.rollno=5;
		s5.name="rishi";
		s5.mark1=0;
		s5.mark2=30;
		s5.mark3=18;
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		
		
	}

}
