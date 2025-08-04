/*
4. Design a travel booking system using two packages:`travel.booking – includes a class`Ticket with ticket ID, destination, and fare.`travel.user – includes a class`User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class
*/

package travel.booking;

public class Ticket{
	int ticketId;
	String source;
	String destination;
	public double fare;
	
	public Ticket(int ticketId, String source, String destination, double fare){
		this.ticketId = ticketId;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
	}
	
	public void display(){
		System.out.println("Ticket Id: " + ticketId);
		System.out.println("Source : " + source);
		System.out.println("Destination : " + destination);
		System.out.println("Fare (per seat) : " + fare);
	}
}
	