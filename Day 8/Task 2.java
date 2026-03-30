package Assignment8;

class ShapeCalculator{
	void area(int s) {
		System.out.println("Value of area square "+s*s);
	}
	void area(int l,int w) {
		int length=l;
		int width =w;
		System.out.println("Value of Area square "+length*width);
	}
	
	void area(double r) {
		System.out.println("Value of Area square : "+(3.14*r*r));
	}
}


public class ShapeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeCalculator s1 = new ShapeCalculator();
		s1.area(4);
		s1.area(2,4);
		s1.area(4.0);
	}

}
