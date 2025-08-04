/*
4. Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common method but implement booking differently.
*/

import java.util.Scanner;


public class Problem4{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		TicketBooking ticket;
		
		System.out.print("Enter source : ");
		String src = sc.next();
		System.out.print("Enter Destination : ");
		String dest = sc.next();
		System.out.print("Enter number of passengers : ");
		int pas = sc.nextInt();
		System.out.println("Choose the mode of transport  \n1. Bus \n2.Train \n3.Flight ");
		int opt =sc.nextInt();
		
		if(opt == 1){
			ticket = new Bus(src, dest, pas);
			ticket.display();
		}
		else if(opt==2){
			ticket = new Train(src, dest, pas);
			ticket.display();
		}
		else if(opt==3){
			ticket = new Flight(src, dest, pas);
			ticket.display();
		}
		else{
			System.out.println("Invalid input");
		}
	}
}

class TicketBooking{
	String source;
	String destination;
	
	TicketBooking(String source, String destination){
		this.source = source;
		this.destination = destination;
	}
	
	void display(){
		System.out.println("Source : " + source);
		System.out.println("Destination : " + destination);
	}

}

class Bus extends TicketBooking{
	int no;
	Bus(String source, String destination, int no){
		super(source, destination);
		this.no = no;
	}
	
	double bookTicket(){
		return no*200;
	}
	
	void display(){
		super.display();
		System.out.println("Number of Passengers : " + no);
		System.out.print("Total travel fair : "+ bookTicket());
		System.out.println("\nBus Ticket Booked Successfully");
		System.out.println("----------------------------");
	}
}
		
class Train extends TicketBooking{
	int no;
	Train(String source, String destination, int no){
		super(source, destination);
		this.no = no;
	}
	
	double bookTicket(){
		return no*500;
	}
	
	void display(){
		super.display();
		System.out.println("Number of Passengers : " + no);
		System.out.print("Total travel fair : "+ bookTicket());
		System.out.println("\nTrain Ticket Booked Successfully");
		System.out.println("----------------------------");
	}
}

class Flight extends TicketBooking{
	int no;
	Flight(String source, String destination, int no){
		super(source, destination);
		this.no = no;
	}
	
	double bookTicket(){
		return no*2000;
	}
	
	void display(){
		super.display();
		System.out.println("Number of Passengers : " + no);
		System.out.print("Total travel fair : "+ bookTicket());
		System.out.println("\nFlight Ticket Booked Successfully");
		System.out.println("----------------------------");
	}
}
