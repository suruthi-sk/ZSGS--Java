/*
4. Design a travel booking system using two packages:`travel.booking – includes a class`Ticket with ticket ID, destination, and fare.`travel.user – includes a class`User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class
*/

package travel.user;
import travel.booking.Ticket;

public class User {
	Ticket ticket;
	int userId;
	String userName;
	int noOfSeats;
	
	public User(int userId, String userName, int noOfSeats, int ticketId, String source, String destination, double fare){
		ticket = new Ticket(ticketId, source, destination, fare);
		this.userId = userId;
		this.userName = userName;
		this.noOfSeats = noOfSeats;
	}
	
	public void bookTicket(){
		System.out.println("Ticket Booked Successfully.....");
		System.out.println();
		System.out.println("Showing details");
		ticket.display();
		System.out.println("User Id : " + userId);
		System.out.println("User name : " + userName);
		System.out.println("Number of seat : " + noOfSeats);
		System.out.println("Total fare : " + (ticket.fare)*((double)noOfSeats));
		System.out.println();
	}
}
	