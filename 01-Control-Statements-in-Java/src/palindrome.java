//Write a java program to find a palindrome of a given number

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		int userInput = scanner.nextInt();
		int original_number = userInput;
		
		int reverse = 0;
		
		while(userInput!=0) {
			reverse = reverse*10 + userInput%10;
			userInput = userInput/10;
		}
		
		System.out.println("Result: " + reverse);
		
		if (original_number == reverse) {
			System.out.println(original_number + " is a Palindrome Number");
		} else {
			System.out.println(original_number + " is not a Palindrome Number");
		}
	}
}