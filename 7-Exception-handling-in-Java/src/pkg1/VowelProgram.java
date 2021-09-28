/*
 1. Create an array of characters which will be initialized during run time with vowels. If user 
enters any consonant, your code should generate a user-defined checked exception, 
InvalidVowelException. The description or message of InvalidVowelException is "character is 
consonant". Handle the exception by using try, catch, finally, throw and throws.
 */

package pkg1;

import java.util.*; 

class InvalidVowelException extends Exception{
	InvalidVowelException(String vowelException){
		super(vowelException);
	}
}

public class VowelProgram {
	static void throwException() throws InvalidVowelException{
		InvalidVowelException exception = new InvalidVowelException("Character is Consonant");
		throw exception; 
	}
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int arrSize;
		
		System.out.print("\nEnter the size of the ARRAY: ");
		arrSize = scanner.nextInt(); 
		
		char charArray[] = new char[arrSize]; 
		
		System.out.println("Enter the CHARACERS for the ARRAY: ");
		for(int i=0; i<arrSize; i++) {
			System.out.println("Enter the Character: " + (i+1) + " : ");
			char character = scanner.next().charAt(0);
			
			try {
				if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'||character=='A'||character=='E'||character=='I'||character=='O'||character=='U') {
					charArray[i] = character; 
				}
				else {
					throwException(); 
				}
			} 
			catch(InvalidVowelException e) {
				System.out.println(e);
				i = i-1; 
			}
			finally {
				System.out.println();
			}
		}
		System.out.println("The ARRAY is: " + Arrays.toString(charArray));
	}
}
