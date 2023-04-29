// 10-Part-2 Write a program in Java to return the highest occurred character in an array?

import java.util.Scanner;

public class highestOccuredChar {
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
		
		int x = 0; 
		char result = ' ';
		
		for(int i=0; i<charArray.length; i++) {
			int initialCount = 0;
			
			for(int j=0; j<charArray.length; j++) {
				if(charArray[i] == charArray[j]) {
					initialCount += 1; 
				}
			}
			
			if(x < initialCount) {
				x = initialCount; 
				result = charArray[i];
				
			}
		}
		System.out.println("Your Given Input: " + userInput);
		System.out.println("Highest occuring Character: " + result);
	}
}