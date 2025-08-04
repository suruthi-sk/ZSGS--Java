/*
1. Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.

Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
‌
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed.
*/

import java.util.Scanner;

class MedicalRecord{
	int recordId;
	String patientName;
	String dateOfVisit;
	String diagnosis;
	
	void inputRecordDetails(int recordId, String patientName, String dateOfVisit, String diagnosis){
		this.recordId = recordId;
		this.patientName = patientName;
		this.dateOfVisit = dateOfVisit;
		this.diagnosis = diagnosis;
	}
	
	void displayRecord(){
		System.out.println("Record Id : " + recordId);
		System.out.println("Patient Name : " + patientName);
		System.out.println("Date of Visit : " + dateOfVisit);
		System.out.println("Diagnosis : " + diagnosis);
	}
}

class InPatientRecord extends MedicalRecord{
	int roomNumber;
	int numberOfDaysAdmitted;
	double roomCharges;
	double totalCharge;
	
	InPatientRecord(int roomNumber, int numberOfDaysAdmitted, double roomCharges){
		this.roomNumber = roomNumber;
		this.numberOfDaysAdmitted = numberOfDaysAdmitted;
		this.roomCharges = roomCharges;
	}
	
	double calculateTotalCharges(){
		totalCharge = numberOfDaysAdmitted*roomCharges;
		return totalCharge;
	}
	
	void displayRecord(){
		System.out.println();
		super.displayRecord();
		System.out.println("Room number : " + roomNumber);
		System.out.println("Number of Days admitted : " + numberOfDaysAdmitted);
		System.out.println("Room charges : " + roomCharges);
		calculateTotalCharges();
		System.out.println("Total inpatient charge : " + totalCharge);
	}
}

class OutPatientRecord extends MedicalRecord{
	String doctorName;
	double consultationFee;
	
	OutPatientRecord(String doctorName, double consultationFee){
		this.doctorName = doctorName;
		this.consultationFee = consultationFee;
	}
	
	void displayRecord(){
		System.out.println();
		super.displayRecord();
		System.out.println("Doctor Name : " + doctorName);
		System.out.println("Consultation Fee : " + consultationFee);
	}
}

public class Problem1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Inpatient \n2.Out patient");
		int n = sc.nextInt();
		
		System.out.print("Enter Record number : ");
		int recNO = sc.nextInt();
		System.out.print("Enter Patient name : ");
		sc.nextLine();
		String name = sc.next();
		System.out.print("Enter date of visit : ");
		String date = sc.next();
		sc.nextLine();
		System.out.print("Enter diagnosis : ");
		String diagnosis = sc.nextLine();
		
		if(n==1){
			System.out.print("Enter room number : ");
			int roomNo = sc.nextInt();
			System.out.print("Enter number of days admitted : " );
			int days = sc.nextInt();
			System.out.print("Enter Room charges : ");
			double charges = sc.nextDouble();
			
			InPatientRecord in = new InPatientRecord(roomNo, days, charges);
			in.inputRecordDetails(recNO, name, date, diagnosis);
			in.displayRecord();
		}
		
		else if(n==2){
			sc.nextLine();
			System.out.print("Enter Doctor name : ");
			String dName = sc.nextLine();
			System.out.print("Enter consultation Fee : ");
			double fee = sc.nextDouble();
			
			OutPatientRecord out = new OutPatientRecord(dName, fee);
			out.inputRecordDetails(recNO, name, date, diagnosis);
			out.displayRecord();
		}
		
		else{
			System.out.print("Enter valid input!");
		}
	}
}
			
			
		
		