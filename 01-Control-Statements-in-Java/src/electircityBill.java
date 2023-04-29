//Write a java program to calculate Electricy bill for the following tariff.
/*
 Unit Range         Cost per unit
 1-100              1 Re.05 paise
 101-300            2 Rs35 paise
 301-500            3 Rs 50 paise
 >500               4 Rs 20 paise
 
 */

import java.util.Scanner;

public class electircityBill {
	
	public static void main (String[] args) {
		
		System.out.println("<-----Calculate your Electricity Bill----->\n");
		System.out.print("Enter the unit recieved in your electricity invoice: ");
		
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		
		double totalAmount = 0.0; 
		
		if (userInput == 0) {
			System.out.println("Congratulations!! You have nothing to pay!!");
		} 
		
		else if (userInput >= 1 && userInput <= 100) {
			System.out.println("*****Electricity INVOICE*****");
			totalAmount = userInput * 1.5;
			System.out.println("You have to pay " + totalAmount + " as your monthly Electricy Bill\n");
			System.out.println("Thanks for reciving the payment!! Please pay before the Deadline!!");
		} 
		
		else if (userInput >= 101 && userInput <= 300){
			totalAmount = (100 * 1.05) + ((userInput-100)*2.35);
			System.out.println("You have to pay " + totalAmount + " as your monthly Electricity Bill\n");
			System.out.println("Thanks for reciving the payment!! Please pay before the Deadline!!");
		} 
		
		else if (userInput >= 301 && userInput <=500) {
			totalAmount = (100 * 1.05) + (200 * 2.35) + ((userInput - 300)* 3.50); 
			System.out.println("You have to pay " + totalAmount + " as your monthly Electricity Bill\n");
			System.out.println("Thanks for reciving the payment!! Please pay before the Deadline!!");
		} 
		
		else if (userInput > 500) {
			totalAmount = (100 * 1.05) + (200 * 2.35) + (200 * 3.50) + ((userInput - 500)*4.20);
			System.out.println("You have to pay " + totalAmount + " as your monthly Electricity Bill\n");
			System.out.println("Thanks for reciving the payment!! Please pay before the Deadline!!");
		} else { 
			System.out.println("INVALID INPUT");
		}
	}
}

	