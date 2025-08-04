/*
5. Design a class named`BankAccount that uses the concept of encapsulation. The class should have the following private data members: account number, account holder name, and balance. Provide public getter and setter methods to access and modify these fields. Also, include a method to deposit and withdraw amount ensuring that the balance cannot go negative.
*/

import java.util.Scanner;

class BankAccount{
	private String accNumber;
	private String accHolderName;
	private double balance;
	
	BankAccount(String accNumber, String accHolderName, double balance){
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
	
	public String getAccountNumber(){
		return accNumber;
	}
	
	public String getAccountHolderName(){
		return accHolderName;
	}
	
	public void setAccountHolderName(String accHolderName){
		this.accHolderName = accHolderName;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	void display(){
		System.out.println();
		System.out.println("Account number : " + accNumber);
		System.out.println("Account Holder Name : "+ accHolderName);
		System.out.println("Balance : " + balance);
	}
}

public class Problem5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Account number : ");
		String no = sc.next();
		sc.nextLine();
		System.out.print("Enter Account holder name : ");
		String name = sc.nextLine();
		System.out.print("Enter balance : ");
		double balance = sc.nextDouble();
		
		BankAccount bank = new BankAccount(no, name, balance);
		
		System.out.println("Enter choice: \n1.Deposit \n2.Withdraw");
		int opt = sc.nextInt();
		
		if(opt==1){
			System.out.print("Enter the amount to deposit : ");
			double amount = sc.nextDouble();
			
			double availBalance = bank.getBalance();
			bank.setBalance(availBalance+amount);
		} else if(opt==2){
			System.out.print("Enter the amount to withdraw : ");
			double amount = sc.nextDouble();
			
			double availBalance = bank.getBalance();
			if(amount>availBalance) System.out.println("Insufficient Balance");
			else bank.setBalance(availBalance-amount);
		} else {
			System.out.println("Invalid input");
		}
		
		bank.display();
	}
}
		
		
	