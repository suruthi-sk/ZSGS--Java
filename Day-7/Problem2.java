/*
2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a main class where you can accept payment using different methods.
*/

import java.util.Scanner;

interface PaymentMethod{
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod{
    private String cardNo;
    private String holderName;
    private String bankName;
    private String ifscCode;
    private int cvv;

    public CreditCardPayment(String cardNo, String holderName, String bankName, String ifscCode, int cvv){
        this.cardNo = cardNo;
        this.holderName = holderName;
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.cvv = cvv;
    }

    public void pay(double amount){
        System.out.println("\nProcessing Credit Card Payment...");
        System.out.println("Account Holder Name : " + holderName);
        System.out.println("Bank Name : " + bankName);
        System.out.println("IFSC Code : " + ifscCode);
        System.out.println("Amount Paid : " + amount);
        System.out.println("Payment Successful via Credit Card!\n");
    }
}

class DebitCardPayment implements PaymentMethod{
    private String cardNo;
    private String holderName;

    public DebitCardPayment(String cardNo, String holderName){
        this.cardNo = cardNo;
        this.holderName = holderName;
    }

    public void pay(double amount){
        System.out.println("\nProcessing Debit Card Payment...");
        System.out.println("Account Holder Name : " + holderName);
        System.out.println("Amount Paid : " + amount);
        System.out.println("Payment Successful via Debit Card!\n");
    }
}

class UPIPayment implements PaymentMethod{
    private String upiId;

    public UPIPayment(String upiId){
        this.upiId = upiId;
    }

    public void pay(double amount){
        System.out.println("\nProcessing UPI Payment...");
        System.out.println("UPI ID : " + upiId);
        System.out.println("Amount Paid : " + amount);
        System.out.println("Payment Successful via UPI!\n");
    }
}

public class Problem2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PaymentMethod payment;

        System.out.println("Enter payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. UPI Payment");
        System.out.print("Choose (1-3): ");
        int option = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Amount to Pay: ₹");
        double amount = sc.nextDouble();
        sc.nextLine();

        switch (option){
            case 1:
                System.out.print("Enter Card Number: ");
                String cno = sc.next();
                sc.nextLine(); 

                System.out.print("Enter Card Holder Name: ");
                String cname = sc.nextLine();

                System.out.print("Enter Bank Name: ");
                String bank = sc.nextLine();

                System.out.print("Enter IFSC Code: ");
                String ifsc = sc.next();

                System.out.print("Enter CVV (3 digits): ");
                int cvv = sc.nextInt();

                payment = new CreditCardPayment(cno, cname, bank, ifsc, cvv);
                payment.pay(amount);
                break;

            case 2:
                System.out.print("Enter Card Number: ");
                String dno = sc.next();
                sc.nextLine();

                System.out.print("Enter Card Holder Name: ");
                String dname = sc.nextLine();

                payment = new DebitCardPayment(dno, dname);
                payment.pay(amount);
                break;

            case 3:
                System.out.print("Enter UPI ID: ");
                String upi = sc.next();

                payment = new UPIPayment(upi);
                payment.pay(amount);
                break;

            default:
                System.out.println("Invalid Option!");
        }
        sc.close();
    }
}
