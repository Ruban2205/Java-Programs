// 10-Part-1 Write a program in Java to count the occurrence of a given character in an array?

import java.util.Scanner;

public class occurenceOfArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Array Size: ");
		int arraySize = scanner.nextInt();
		
		char charArray[] = new char[arraySize];
		
		System.out.println("Enter the Characters line by line: ");
		
		for(int i=0; i<arraySize; i++) {
			charArray[i] = scanner.next().charAt(0);
		}
		String userInput = new String(charArray);
		
		System.out.println("Enter the character that you want to be count: ");
		
		char countChar = scanner.next().charAt(0);
		int initialCount = 0; 
		
		for(int j=0; j<arraySize; j++) {
			if(charArray[j] == countChar) {
				initialCount += 1;
			}
		}
		System.out.println("Your Given Input: " + userInput);
		System.out.println("Given Character Count: " + initialCount);
	}
		
}
