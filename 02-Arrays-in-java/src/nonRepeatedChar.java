/**
 Write a program in Java to find the first non-repeated character in a character array.
 For example, the first non-repeated character in the input 'abcdab' is 'c'  
 */

import java.util.*;
public class nonRepeatedChar{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the character: ");
		String userInput = scanner.nextLine();
		
		int length= userInput.length();
		for(int i=0;i<length;i++)
		{
			int count = 1;
			for(int j=0;j<length;j++)
			{
				if (j == i) 
					continue;
				
				if(userInput.charAt(i)==userInput.charAt(j)) 
					count=count +1;
			}
			if(count == 1) {
				System.out.println("The first Non-Repeated Character is: " + userInput.charAt(i));
				break;
			}
		}
	}
}


//charAt() is a method that returns the character from the specified index.






















//import java.util.Scanner; 
//
//public class nonRepeatedChar {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter the Array Size: ");
//		
//		int arrSize = scanner.nextInt(); 
//		
//		char charArray[] = new char[arrSize];
//		
//		System.out.println("Enter the characters line by line: ");
//		
//		for(int i=0; i<arrSize; i++) {
//			charArray[i] = scanner.next().charAt(0);
//		}
//		String userInput = new String(charArray);
//		
//		System.out.println("Your Given Input: " + userInput);
//	
//		for(int j=0; j<userInput.length(); j++) {
//			boolean uniqueChar = true; 
//			
//			for(int k=0; k<userInput.length(); k++) {
//				if(j != k && userInput.charAt(j) == userInput.charAt(k)) {
//					uniqueChar = false; 
//				}
//			}
//			
//			if(uniqueChar) {
//				System.out.println("The first Non-repeated Character is: " +userInput.charAt(j));
//				break; 
//			}
//			else {
//				System.out.println("All Characters are Repeated!! No Unique character are Available in this variation!! Try Some other Variations!!");
//				break; 
//			}
//		}
//	}
//}