/*
5. Develop a Java application for a Ticket Booking System that allows users to book tickets for different types of transportation modes such as Bus, Train, and Flight.
Define a common interface or abstract class`Ticket with a method`bookTicket() that each transportation mode must implement differently.
Create classes`BusTicket,`TrainTicket, and`FlightTicket that extend the abstract class or implement the interface.
Demonstrate runtime polymorphism by calling the`bookTicket() method using a reference of the base class/interface.
*/

import java.util.Scanner;

interface Ticket{
	void bookTicket();
}

class Bus implements Ticket{
	int seatType;
	int noOfPassengers;
	double fair;
	
	Bus(int seatType, int noOfPassengers){
		this.seatType = seatType;	
		this.noOfPassengers = noOfPassengers;
	}
	
	double chooseFair(){
		if(seatType==1) return 1000;
		else return 500;
	}
	
	public void bookTicket(){
		String seat ;
		if(seatType==1) seat = "Sleeper";
		else seat = "Seater";
		System.out.println("Passengers prefered seat type : " + seat);
		System.out.println("Number of Seats booked : " + noOfPassengers);
		double f = chooseFair();
		System.out.println("Ticket price (per head) : " + f);
		System.out.println("Total price : " + (f*(double)noOfPassengers));
		System.out.print("Allocated seat number : " );
		for(int i=1;i<noOfPassengers;i++){
			if(i>50){
				System.out.println("Seat Full");
				break;
			}
			else{
				System.out.println("Seat" + i);
			}
		}
		System.out.println("Bus ticket booked successfully....!");
	}
}

class Train implements Ticket{
	int compartment;
	int berth;
	double fair;
	int noOfPassengers;
	
	Train(int compartment, int berth, int noOfPassengers){
		this.compartment = compartment;
		this.berth = berth;
		this.noOfPassengers = noOfPassengers;
	}
	
	double chooseFair(){
		if(compartment==1){
			if(berth==1) fair = 3000;
			else if(berth==2) fair = 2000;
			else fair = 1000;
		}
		else if(compartment==2){
			if(berth==1) fair = 700;
			else if(berth==2) fair = 600;
			else fair = 500;
		}
		else{
			fair = 200;
		}
		
		return fair;
	}
	
	String chooseCompartment(){
		if(compartment==1) 
			return "AC";
		else if(compartment==2) 
			return "Sleeper";
		else 
			return "General";
	}
	
	String chooseBerth(){
		if(berth==1) 
			return "LB";
		else if(berth==2) 
			return "MB";
		else 
			return "UB";
	}
	
	public void bookTicket(){
		System.out.println("Compartment : " + chooseCompartment());
		System.out.println("Berth : " + chooseBerth());
		System.out.println("Number of Seats booked : " + noOfPassengers);
		double f = chooseFair();
		System.out.println("Ticket price (per head) : " + f);
		System.out.println("Total Ticket price : " + f*(double)noOfPassengers);
		System.out.println("Train ticket booked successfully......!");
	}
}

class Flight implements Ticket{
	int classType;
	int noOfPassengers;
	double fair;
	
	Flight(int classType, int noOfPassengers){
		this.classType = classType;
		this.noOfPassengers = noOfPassengers;
	}
	
	double chooseFair(){
		if(classType==1)
			fair = 10000;
		else 
			fair = 5000;
		return fair;
	}
		
	String chooseClass(){
		if(classType==1) return "Business Class";
		else return "Economy class";
	}
	
	public void bookTicket(){
		System.out.println("Class type : " + chooseClass());
		System.out.println("Number of Seats : " + noOfPassengers);
		double f = chooseFair();
		System.out.println("Ticket price (per head) : " + f);
		System.out.println("Total price : " + f*(double)noOfPassengers);
		System.out.println("Flight ticket booked Successfully......!");
	}
}

public class Problem5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter source : ");
		String source = sc.next();
		System.out.print("Enter destination : ");
		String dest = sc.next();
		System.out.print("Enter Travel date : ");
		String date = sc.next();
		
		System.out.println("Enter the mode of transport you want to use... \n1.Bus \n2.Train \n3.Flight ");
		int opt = sc.nextInt();
		
		if(opt==1){
			System.out.print("1.Sleeper \n2.Seater \n Which one do you prefer(enter only option number?");
			int n = sc.nextInt();
			System.out.print("Enter number of seats you want to book");
			int p = sc.nextInt();
			
			Bus bus = new Bus(n,p);
			
			display(source, dest, date);
			bus.bookTicket();
		} else if(opt==2) {
			System.out.print("1.AC \n2.Sleeper \n3.General \nWhich one do you prefer (enter only option number)? ");
			int c = sc.nextInt();
			System.out.print("1.LB \n2.MB \n3.UB Which one do you prefer (enter only option number)? ");
			int b = sc.nextInt();
			System.out.print("Enter number of seats you want to book : ");
			int p = sc.nextInt();
			
			Train train = new Train(c,b,p);
			display(source, dest, date);
			train.bookTicket();
		} else if(opt==3) {
			System.out.print("1.Business class \n2.Economy class \nWhich one do you prefer (enter only option number)? ");
			int c = sc.nextInt();
			System.out.print("Enter number of seats you want to book: ");
			int p = sc.nextInt();
			
			Flight flight = new Flight(c,p);
			display(source, dest, date);
			flight.bookTicket();
		} else {
			System.out.print("Invalid Input");
		}
	}
	
	static void display(String source, String dest, String date){
		System.out.println();
		System.out.println("Booking Details");
		System.out.println("__________________");
		System.out.println("Source : " + source);
		System.out.println("Destination : " + dest);
		System.out.println("Travel Date : " + date);
	}
}	