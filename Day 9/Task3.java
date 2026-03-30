package Assignmnet9;


interface Switch{
	void turnon();
	void turnoff();
}

class Fan implements Switch{
	boolean is  = true;
public void turnon(){
		if(true) {
			System.out.println("Fan is on ");
		}else {
			System.out.println("Fan is off ");
		}	
	}

public void turnoff(){
		if(false) {
			System.out.println("Fan is on ");
		}else {
			System.out.println("Fan is off ");
		}	
	}
}

class Light implements Switch{
	boolean is  = true;
public void turnon(){
		if(true) {
			System.out.println("Light is on ");
		}else {
			System.out.println("Light is off ");
		}	
	}

public void turnoff(){
		if(true) {
			System.out.println("Light is on ");
		}else {
			System.out.println("Light is off ");
		}	
	}
}

class AirConditioner implements Switch{
	boolean is  = true;
public void turnon(){
		if(true) {
			System.out.println("AirConditioner is on ");
		}else {
			System.out.println("AirConditioner is off ");
		}	
	}

public void turnoff(){
		if(false) {
			System.out.println("AirConditioner is on ");
		}else {
			System.out.println("AirConditioner is off ");
		}	
	}
}
public class HomeAppliances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Switch f1 = new Fan();
		f1.turnoff();
		f1.turnon();
		
		Switch l1 = new Light();
		l1.turnon();
		l1.turnoff();
		
		Switch a1 = new AirConditioner();
		a1.turnoff();
		a1.turnon();
		
	}

}
