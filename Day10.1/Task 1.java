package Assignment_Abs;

abstract class appliances {
	abstract void turnon();
	abstract void turnoff();
}

class Fan extends appliances {
	void turnon() {
		System.out.println("Turn on the Fan");
	}
	void turnoff() {
		System.out.println("Turn off the Fan ");
	}
}

class washingMachine extends appliances{
	void turnon() {
		System.out.println("Turn on the Switch ready to wash ");
	}
	void turnoff() {
		System.out.println("Turn off clothes washed completed");
	}
}


public class Appliance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		appliances f1 = new Fan();
		f1.turnon();
		f1.turnoff();
		
		appliances w1 = new washingMachine();
		w1.turnon();
		w1.turnoff();

	}

}
