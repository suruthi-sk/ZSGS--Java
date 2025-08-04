/*
4. Design a travel booking system using two packages:`travel.booking – includes a class`Ticket with ticket ID, destination, and fare.`travel.user – includes a class`User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class
*/

import java.util.Scanner;
import travel.booking.Ticket;
import travel.user.User;

public class Problem4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		User user = new User(10, "suruthi", 3, 34, "Chennai", "Bangalore", 230);
		user.bookTicket();
	}
}