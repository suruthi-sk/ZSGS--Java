/*
1. We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.
------------------------------------------------------------------------------------------------------------
*/

class Vehicles{
	float mileage;
	double price;
	
	Vehicles(float mileage, double price){
		this.mileage = mileage;
		this.price = price;
	}
	
	void display(){
		System.out.println("Mileage : " + mileage);
		System.out.println("Price : " + price);
		System.out.println();
	}
		
}

class Car extends Vehicles{
	double ownershipCost;
	int warranty;
	int seatingCapacity;
	String fuelType;
	
	Car(double ownershipCost, int warranty, int seatingCapacity, String fuelType, float mileage, double price){
		super(mileage, price);
		this.ownershipCost = ownershipCost;
		this.warranty = warranty;
		this.seatingCapacity = seatingCapacity;
		this.fuelType = fuelType;
	}
	
	void display(){
		super.display();
		System.out.println("Ownership Cost : " + ownershipCost);
		System.out.println("Warrenty : " + warranty);
		System.out.println("Seating Capacity : " + seatingCapacity);
		System.out.println("Fuel Type : " + fuelType);
		System.out.println();
	}
}

class Bike extends Vehicles{
	int noOfCylinders;
	int noOfGears;
	String coolingType;
	String wheelType;
	float fuelTankSize;
	
	Bike(int noOfCylinders, int noOfGears, String coolingType, String wheelType, float fuelTankSize, float mileage, double price){
		super(mileage, price);
		this.noOfCylinders = noOfCylinders;
		this.noOfGears = noOfGears;
		this.coolingType = coolingType;
		this.wheelType = wheelType;
		this.fuelTankSize = fuelTankSize;
	}
	
	void display(){
		super.display();
		System.out.println("Number of cylinders : " + noOfCylinders);
		System.out.println("Number of Gears : " + noOfGears);
		System.out.println("Cooling Type : " + coolingType);
		System.out.println("Wheel type : " + wheelType);
		System.out.println("Fuel tank size : " + fuelTankSize);
		System.out.println();
	}
}

class Audi extends Car{
	String modelType;
	
	Audi(String modelType, double ownershipCost, int warranty, int seatingCapacity, String fuelType, float mileage, double price){
		super(ownershipCost, warranty, seatingCapacity, fuelType, 
mileage, price);
		this.modelType = modelType;
	}
	
	void display(){
		super.display();
		System.out.println("Model Type : " + modelType);
		System.out.println();
		System.out.println("------------------------------------");
	}
}

class Ford extends Car{
	String modelType;
	
	Ford(String modelType, double ownershipCost, int warranty, int seatingCapacity, String fuelType, float mileage, double price){
		super(ownershipCost, warranty, seatingCapacity, fuelType, 
mileage, price);
		this.modelType = modelType;
	}
	
	void display(){
		super.display();
		System.out.println("Model Type : " + modelType);
		System.out.println();
		System.out.println("------------------------------------");
	}
}

class Bajaj extends Bike{
	String makeType;
	
	Bajaj(String makeType, int noOfCylinders, int noOfGears, String coolingType, String wheelType, float fuelTankSize, float mileage, double price){
		super(noOfCylinders, noOfGears, coolingType, wheelType, fuelTankSize, mileage, price);
		this.makeType = makeType;
	}
	
	void display(){
		super.display();
		System.out.println("Make Type : " + makeType);
		System.out.println();
		System.out.println("------------------------------------");
	}
}

class TVS extends Bike{
	String makeType;
	
	TVS(String makeType, int noOfCylinders, int noOfGears, String coolingType, String wheelType, float fuelTankSize, float mileage, double price){
		super(noOfCylinders, noOfGears, coolingType, wheelType, fuelTankSize, mileage, price);
		this.makeType = makeType;
	}
	
	void display(){
		super.display();
		System.out.println("Make Type : " + makeType);
		System.out.println();
		System.out.println("------------------------------------");
	}
}

public class Problem1{
	public static void main(String[] args){
		Audi audi = new Audi("Luxury sedans", 90000, 5, 8, "Petrol", 8.4f, 10000000);
		
		Ford ford = new Ford("Ford Endeavour", 600000, 7, 4, "Diesel", 20.0f, 3000000);
		
		Bajaj bajaj = new Bajaj("Motor-cycle", 1, 4, "Oil", "spokes", 5.5f, 30, 5000000);
		
		TVS tvs = new TVS("Scooty", 2, 3, "Air", "Alloy", 7, 27, 3000000);
		
		audi.display();
		ford.display();
		bajaj.display();
		tvs.display();
	}
}
		
		
