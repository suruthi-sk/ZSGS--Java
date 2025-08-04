/*
Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.
*/

class Vehicle{
	int vehicle_id;
	String brand_name;
	double price;
	static int vehicle_count=0;
	
	public Vehicle(int vehicle_id, String brand_name, double price) {
        this.vehicle_id = vehicle_id;
        this.brand_name = brand_name;
        this.price = price;
        vehicle_count++;  
    }
	
	public void display() {
        System.out.println("Vehicle ID: " + vehicle_id);
        System.out.println("Brand Name: " + brand_name);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static int getVehicleCount() {
        return vehicle_count;
    }
}

public class Problem4{
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(101, "Tesla", 75000);
        Vehicle v2 = new Vehicle(102, "BMW", 60000);
        Vehicle v3 = new Vehicle(103, "Audi", 65000);

        v1.display();
        v2.display();
        v3.display();

        System.out.println("Total Vehicles Created: " + Vehicle.getVehicleCount());
    }
}
	