
public class Ticket {

	String event;
	double price;
	char srow;
	int snum;

	Ticket(String e, double p, char r, int n){
		event = e;
		price = p;
		srow = r;
		snum = n;
	}

	public void TicketPrint() {
		System.out.println("*********");
		System.out.println("TICKET");
		System.out.println(event);
		System.out.printf("$" + "%.2f\n",price); 	//Had to use printf to make both zeros appear in the price.
		System.out.println("Seat " + srow + srow + "-" + snum);		//srow printed twice to ensure seat row was "BB".
		System.out.println("*********\n");		//added the \n to separate the tickets a little bit.
	}
}