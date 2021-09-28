package pkg1;

import java.util.*;


class WithdrawException extends Exception{
	WithdrawException(String withdrawExcep){
		super(withdrawExcep);
	}
}

class BalanceException extends Exception{
	BalanceException(String balanceExcep){
		super(balanceExcep); 
	}
}

public class BankAtm {
	Scanner scanner = new Scanner(System.in); 
	
	double balance; 
	int atmPin; 

	BankAtm(){
		System.out.println("WELCOME TO THE BANK");
		atmPin = 12345; 
		balance = 0.0; 
	}
	
	void display() {
		try {
			if(balance > 500) {
				System.out.println(); 
				System.out.println("Your Account Balance: " + balance);
			}
			else {
				BalanceException e = new BalanceException("Insufficient amout is lesser than 500. Please Deposit Money!!");
				throw e; 
			}
		}
		catch(BalanceException e) {
			System.out.println(e);
		}
	}
	
	void withdraw() {
		System.out.println(); 
		System.out.print("Enter the Amount to be Withdrawm: ");
		double amount = scanner.nextDouble(); 
		
		System.out.print("\nEnter you ATM PIN: ");
		int pin = scanner.nextInt(); 
		
		if(atmPin == pin) {
			try {
				if((amount % 100 == 0) && (balance >= 500) && balance >= amount) {
					balance = balance - amount; 
					System.out.println("\n" +amount + " Withdrawn Successfully!!");
				}
				else {
					WithdrawException e = new WithdrawException("Insuffient Amount!!"); 
					throw e; 
				}
			}
			catch(WithdrawException e) {
				System.out.println(e);
			}
		}
		else {
			System.out.println("\nINCORRECT PIN ENTERED!!");
		}
	}
	
	void deposit() {
		System.out.print("\nEnter the amount to be Deposited: ");
		double amount = scanner.nextDouble(); 
		
		System.out.print("Enter the PIN: ");
		int pin = scanner.nextInt(); 
		
		if(atmPin == pin) {
			balance = balance + amount; 
			System.out.println("\n" + amount + " Deposited Successfully!!");
		} 
		else { 
			System.out.println("\nIncorrect PIN");
		}
	}
	
	void changePin() {
		System.out.print("\nEnter your PIN: ");
		int oldPin = scanner.nextInt(); 
		
		if(oldPin == atmPin) {
			System.out.print("Enter NEW PIN: ");
			int newPin = scanner.nextInt(); 
			
			atmPin = newPin; 
			
			System.out.println("\nPIN Changed");
		}
		else {
			System.out.println("\nINCORRECT PIN\n");
		}
	}
}
