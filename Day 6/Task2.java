package Assignment6;

public class mobile {
	
	String name;
	double price;
	
	mobile(){
		name = "Iphone";
		price = 145000;
	}
	
	void display() {
		System.out.println("ModelName :"+name);
		System.out.println("Price :"+price);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mobile m = new mobile();
		
		m.display();
		
		
	}

}
