/*2) Write a menu driven program in Java to automate the Banking operations Create custom
exceptions to deal with the following situations
a. Account is created with Initial Balance < 500
b. Withdraw operation when balance amount < withdraw amount
c. Pin change
*/

package pkg1;

import java.util.*;

public class Banking {
	
	public static Scanner scanner = new Scanner(System.in);
	public static boolean isBanking = true;
	
	public static void main(String[] args) {
		BankAtm atm = new BankAtm();
		
		while(isBanking) {
			System.out.println(); 
			System.out.println("1. BALANCE");
			System.out.println("2. DEPOSIT");
			System.out.println("3. WITHDRAW");
			System.out.println("4. PIN CHANGE");
			System.out.println("5. EXIT");
			
			System.out.print("Enter your choice: ");
			int userChoice = scanner.nextInt(); 
			
			if(userChoice == 1) {
				atm.display();
			}
			else if(userChoice == 2) {
				atm.deposit();
			}
			else if(userChoice == 3) {
				atm.withdraw();
			}
			else if(userChoice == 4) {
				atm.changePin();
			}
			else if(userChoice == 5) {
				System.out.println("\nThanks for using the BANK by URK20CS2001");
				isBanking = false; 
				break; 
			}
			else {
				System.out.println("INVALID INPUT!!");
			}
		}
	}
}
