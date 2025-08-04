/*
1. All the banks operating in India are controlled by RBI. RBI has set a well defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example, suppose RBI has set minimum interest rate applicable to a saving bank account to be 4% annually; however, banks are free to use 4% interest rate or to set any rates above it.
Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and methods in each class.
Hint:
Class Customer
{
//Personal Details ...
// Few functions ...
}
Class Account
{
// Account Detail ...
// Few functions ...
}
Class RBI
{
Customer c; //hasA relationship
Account a; //hasA relationship
..
Public double GetInterestRate() { }
Public double GetWithdrawalLimit() { }
}
Class SBI extends public RBI
{
//Use RBI functionality or define own functionality.
}
Class ICICI extends public RBI
{
//Use RBI functionality or define own functionality.
}

*/

import java.util.Scanner;

class Customer{
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phone;

    public Customer(String name, int age, String gender, String email, String phone){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    public void displayCustomer(){
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " (" + gender + ")");
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}

class Account{
    private String accountNumber;
    private String accountType; 
    private double balance;
    private double interestEarned;
    private String lastTransactionDate;

    public Account(String accountNumber, String accountType, double balance){
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.interestEarned = 0.0;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited " + amount + ". \nNew Balance: " + balance);
    }

    public void withdraw(double amount, double withdrawalLimit, double minBalance){
        if (amount > withdrawalLimit){
            System.out.println("Withdrawal limit exceeds.");
        }else if (balance - amount < minBalance){
            System.out.println("Minimun balance limit exceeds.");
        }else{
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". \nRemaining Balance: " + balance);
        }
    }

    public void addInterest(double rate){
        double interest = (balance * rate) / 100;
        interestEarned += interest;
        balance += interest;
        System.out.println("Interest of " + interest + " added. New Balance: " + balance);
    }

    public void displayAccount(){
        System.out.println();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + interestEarned);
        System.out.println("Last Transaction Date: " + lastTransactionDate);
    }
}

class RBI{
    protected Customer customer;
    protected Account account;

    protected double minInterestRate = 4.0;
    protected double minBalance = 1000.0;
    protected double withdrawalLimit = 25000.0;

    public RBI(Customer customer, Account account){
        this.customer = customer;
        this.account = account;
    }

    public double getInterestRate(){
        return minInterestRate;
    }

    public double getWithdrawalLimit(){
        return withdrawalLimit;
    }

    public double getMinBalance(){
        return minBalance;
    }

    public void displayBankDetails(){
        customer.displayCustomer();
        account.displayAccount();
        System.out.println();
        System.out.println("Interest Rate: " + getInterestRate() );
        System.out.println("Minimum Balance: " + getMinBalance());
        System.out.println("Withdrawal Limit per transaction: " + getWithdrawalLimit());
    }
}

class SBI extends RBI{
    public SBI(Customer c, Account a){
        super(c, a);
    }

    public double getInterestRate(){
        return 4.5;
    }

    public double getWithdrawalLimit(){
        return 40000;
    }

    public double getMinBalance(){
        return 1500;
    }

    public void displayBankDetails(){
        System.out.println();
        super.displayBankDetails();
    }
}

class ICICI extends RBI{
    public ICICI(Customer c, Account a){
        super(c, a);
    }

    public double getInterestRate(){
        return 5.0;
    }

    public double getWithdrawalLimit(){
        return 50000;
    }

    public double getMinBalance(){
        return 2000;
    }

    public void displayBankDetails(){
        System.out.println();
        super.displayBankDetails();
    }
}


public class Problem1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        Customer customer = new Customer(name, age, gender, email, phone);

        System.out.print("\nEnter Account Number: ");
        String accNo = sc.next();
        System.out.print("Enter Account Type (Savings/Current): ");
        String accType = sc.next();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account account = new Account(accNo, accType, balance);

        System.out.println("\nChoose Your Bank: ");
        System.out.println("1. SBI");
        System.out.println("2. ICICI");
        int choice = sc.nextInt();

        RBI bank;
        if (choice == 1) bank = new SBI(customer, account);
        else if (choice == 2) bank = new ICICI(customer, account);
        else {
            System.out.println("Invalid bank choice!");
            return;
        }

        boolean running = true;
        while (running) {
            System.out.println("\nMENU");
            System.out.println("1. View Account Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Add Interest");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    bank.displayBankDetails();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double wd = sc.nextDouble();
                    account.withdraw(wd, bank.getWithdrawalLimit(), bank.getMinBalance());
                    break;
                case 4:
                    account.addInterest(bank.getInterestRate());
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for using our Bank System!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
