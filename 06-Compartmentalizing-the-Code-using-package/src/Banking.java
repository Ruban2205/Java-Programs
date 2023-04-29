/* Qn(1) - 1
Develop an application in Java for automating the Banking Operations using interfaces.
Create an interface called “Transaction” which contains the functions such as deposit,
withdraw, and viewBalance. Create another interface called “Displayable” which
contains the Display () function to display the account details.
Create an abstract class called “Account” with bank account details such as acc_name,
acc_no, and balance. Add necessary constructors.
Create a “Bank” class which implements the “Transaction”, “Displayable” interfaces
and inherits “Account” class.
Perform menu driven operations like Deposit, Withdraw and Balance Enquiry, View
Account Details from a Main class. Write logics in the corresponding methods.*/

import java.util.Scanner;

interface Transaction{

    default void deposit(){}
    default void withdrawal(){}
    default void viewBalance(){}

}

interface Displayable{
    static void display(String accountName, int accountNumber, double balance){
        System.out.println("Name: " + accountName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class Account{

    String accountName;
    int accountNumber;
    double balance;

}

class Bank extends Account implements Transaction, Displayable{

    double balance = 0;
    Scanner scanner = new Scanner(System.in);

    Bank(String accountName, int accountNumber){
        super.accountName = accountName;
        super.accountNumber = accountNumber;
        super.balance = this.balance;
    }

    public void deposit(){
        System.out.print("\nEnter the amount you want to deposit: ");
        double depositAmount = scanner.nextDouble();
        setBalance(depositAmount);
        
        System.out.println(depositAmount + " Deposited Successfully!!");
    }

    public void withdrawal(){
        double previousAmount = this.balance;
        System.out.print("\nEnter the amount you want to withdrawal: ");
        double withdrawlAmount = scanner.nextDouble();
        
        setBalance(previousAmount - withdrawlAmount);
        
        System.out.println(withdrawlAmount + " Withdrawn Successfully!!");
    }
    
    public void display() {
    	System.out.println("\n<--YOUR RECIEPT-->");
    	System.out.println("Name: " + accountName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void viewBalance(){
        System.out.println("Balance: " + this.balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Banking {

    static Scanner scanner = new Scanner(System.in);
    static boolean isBanking = true;

    static void menuDrive(){
    	System.out.println();
        System.out.println("1. DEPOSIT");
        System.out.println("2. WITHDRAWL");
        System.out.println("3. BALANCE");
        System.out.println("4. EXIT");
    }

    public static void main(String[] args) {
    	
    	System.out.println("<===WELCOME TO OUR BANK===>");
    	System.out.println();

        System.out.print("Enter your account name: ");
        String accountName = scanner.nextLine();

        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();

        Bank bank = new Bank(accountName, accountNumber);
        
        while (isBanking){

            menuDrive();

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1){
                bank.deposit();
                bank.display();
            }
            else if (choice == 2){
                bank.withdrawal();
                bank.display();
            }
            else if (choice == 3){
                bank.viewBalance();
            }
            else if (choice == 4){
                System.out.println("Thank you! by URK20CS2001");
                isBanking = false;
            }

            else{
                System.out.println("Please enter the valid choice!");
            }

        }
    }

}