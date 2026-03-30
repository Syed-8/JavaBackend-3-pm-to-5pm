package Assignmnet9;

interface Vehicle{
	void startEngine();
	void stopEngine();
}

class Car implements Vehicle {
	
	public void startEngine() {
		System.out.println("Car Engine is Start :");
}

	public void stopEngine() {
		System.out.println("Car Engine is Stop :");
	}
	
 }	
 
 class Bike implements Vehicle{
	 public void startEngine() {
		 System.out.println("Bike Is Start :");
	 }
	 
	 public void stopEngine() {
		 System.out.println("Bike does not Start ");
	 }
 }
 
 class Truck implements Vehicle{
	 public void startEngine() {
		 System.out.println("Truck Engine is Start :");
	 }
	 
	 public void stopEngine() {
		 System.out.println("Truck Engine is stop");
	 }
 }



public class Vehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle c1 = new Car ();
		c1.startEngine();
		c1.stopEngine();
		
		Vehicle b1 = new Bike ();
		b1.startEngine();
		b1.stopEngine();
	
		Vehicle t1 = new Truck ();
		t1.startEngine();
		t1.stopEngine();
	}

}
