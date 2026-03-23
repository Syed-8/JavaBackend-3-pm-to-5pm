package Assignment7;

public class StudentGrade {
	
	int RollNo;
	String name;
	int Mark;
	
	StudentGrade(int r,String n, int m){
	
		RollNo= r;
		name=n;
		Mark=m;
	}
	
	void CalculateGrade() {
		if (Mark>=90) {
			System.out.println("Grdae A");
		}
		else if (Mark>=75) {
			System.out.println("Grdae B");
		}
		else if(Mark>=50) {
			System.out.println("Grade C");
		}
		else {
		System.out.println("Fail");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StudentGrade s1 = new StudentGrade(18,"Abdullah",88);
		StudentGrade s2 = new StudentGrade(20,"Swathi",73);

		s1.CalculateGrade();
		s2.CalculateGrade();
		
	}

}
