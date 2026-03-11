package Assignment6;

public class LibrarySystem {
	int memberID;
	String memberShip;
	
	LibrarySystem(){
		memberID = 501;
		memberShip = "Regular";
	}
	
	void display() {
		System.out.println("MemberID :"+memberID + "MemberShip Type :"+memberShip);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibrarySystem ls = new LibrarySystem();
		
		ls.display();
	}

}
