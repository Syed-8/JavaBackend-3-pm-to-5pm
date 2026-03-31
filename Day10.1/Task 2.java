package Assignment_Abs;

abstract class Food{
	 
	abstract void prepare();
}

class Pizza extends Food{
	 void prepare() {
	System.out.println("Pizza is Ready for you ");	
	}
}

class Burger extends Food {
	void prepare() {
		System.out.println("Token no.4 !! Burger is Ready ");
	}
}


public class Foods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Food F1 = new Pizza();
		F1.prepare();
		
		Food B1 = new Burger();
		B1.prepare();
		
	}

}
