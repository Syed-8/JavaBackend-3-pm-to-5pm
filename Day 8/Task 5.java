package Assignment8;
import java.util.Scanner;

class TransportDrive{
	void Calculatefare(double kilometre) {
		System.out.println("Booking Status :"+kilometre*30);
	}
}	

	
class Bus extends TransportDrive{
	 void Calculatefare(double kilometre) {
			System.out.println("Bus Distance "+kilometre*4);
		}
}
	 
class Train extends Transport{

	void Calculatefare(double kilometre) {
		System.out.println("Train Distance "+kilometre*7);
	}
}
	
	class Taxi extends Transport{
		void Calculatefare(double kilometre) {
			System.out.println("Taxi Distance "+kilometre*9);
		}
	}
		


public class Transport {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Kilometre Value+-");
		double kilometre = sc.nextDouble();

		TransportDrive t1 = new TransportDrive();
		t1.Calculatefare(kilometre);
		
		Bus t2 = new Bus();
		t2.Calculatefare(kilometre);
		
		Train t3 = new Train ();
		t3.Calculatefare(kilometre);
		
		Taxi t4 = new Taxi();
		t4.Calculatefare(kilometre);
		
		
		
	}

}
