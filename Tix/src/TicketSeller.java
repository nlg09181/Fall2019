
public class TicketSeller {
	public static void main(String args[]) {

		Ticket TicketInfo = new Ticket("Red Socks V.S Yankees", 120.00, 'B', 2);

		for(int tic = 0; tic <= 20; tic ++) {
			TicketInfo.TicketPrint();
			TicketInfo.snum += 2;
		}
	}
}