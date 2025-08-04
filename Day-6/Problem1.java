/*
1. Illustrate the concept-Encapsulation with the Payment Gateway System.[The class should encapsulate private data members such as transaction ID, payer name, payee name, amount, payment method, and transaction status. Provide appropriate public getter and setter methods to access and modify these details securely. Also include a method to display the transaction summary.]
*/

class Transaction{
	private int transactionID;
	private String payerName;
	private String payeeName;
	private double amount;
	private String paymentMethod;
	private boolean transactionStatus;
	
	Transaction(int transactionID, String payerName, String payeeName, double amount, String paymentMethod, boolean transactionStatus){
		this.transactionID = transactionID;
		this.payerName = payerName;
		this.payeeName = payeeName;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.transactionStatus = transactionStatus;
	}
	
	public void setTransactionId(int transactionID){
		this.transactionID = transactionID;
	}
	
	public int getTransactionID(){
		return transactionID;
	}
	
	public void setPayerName(String payerName){
		this.payerName = payerName;
	}
	
	public String getPayerName(){
		return payerName;
	}
	
	public void setPayeeName(String payeeName){
		this.payeeName = payeeName;
	}
	
	public String getPayeeName(){
		return payeeName;
	}
	
	public void setAmount(double amount){
		this.amount = amount;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public void setPaymentMethod(String paymentMethod){
		this.paymentMethod = paymentMethod;
	}
	
	public String getPaymentMethod(){
		return paymentMethod;
	}
	
	public void setTransactionStatus(boolean transactionStatus){
		this.transactionStatus = transactionStatus;
	}
	
	public boolean getTransactionStatus(){
		return transactionStatus;
	}
	
	void display(){
		System.out.println("Transaction ID : " + transactionID);
		System.out.println("Payer Name : " + payerName);
		System.out.println("Payee Name : " + payeeName);
		System.out.println("Amount : " + amount);
		System.out.println("Payment method : " + paymentMethod);
		if(getTransactionStatus())
			System.out.println("Transaction Status : Success ");
		else
			System.out.println("Transaction Status : Failure ");
	}
}

public class Problem1{
	public static void main(String[] args){
		Transaction pay = new Transaction(203, "Suruthi", "kar", 20000, "Online payment", true);
		
		pay.setPayeeName("Jack");
		pay.display();
	}
}