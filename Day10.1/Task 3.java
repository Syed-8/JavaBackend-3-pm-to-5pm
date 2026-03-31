package Assignment_Abs;

abstract class Transport{
	
	abstract void bookTicket();
}

class Bus extends Transport {
	void bookTicket() {
		System.out.println("Chennai to Goa Ticket is booked from Redbus App ");
	}
}

class Train extends Transport {
	void bookTicket() {
		System.out.println("IRCTC is Train Booking Website we can book a Train Ticket in this site ");
	}
}


public class TicketBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transport B1 = new Bus();
		B1.bookTicket();
		
		Transport T1 = new Train();
		T1.bookTicket();
		
	}

}
