/*
1) Write a JAVA program that asks the user to input 5 sequences of characters. Then
it will ask the user for a character to search for and will output the maximum
number of times that it occurred between the 5 sequences.
Example:
Sequence 1: aabc
Sequence 2: aaaa
If the user chooses to search for character 'a', the program will output "Character a
occurred a maximum of 4 times" because it occurred 4 times in the second
sequence, and only twice in the first sequence.
 */

import java.util.Scanner;

public class sequenceOfCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strArray[] = new String[5];
		int intArray[] = new int[5];
		
		System.out.println("Enter five sentences: ");
		for(int i=0;i<5;i++)
		{
			strArray[i] = scanner.nextLine();
		}
		
		
		System.out.println("Enter a character to be searched: ");
		char searchChar = scanner.nextLine().charAt(0);
		
		
		for(int j=0;j<5;j++)
		{
			int count = 0;
			String string = strArray[j];
			for(int k=0;k<string.length();k++)
			{
				char character = string.charAt(k);
				if(character == searchChar)
				{
					count += 1;
				}
			}
			intArray[j] = count;
		}

		int maximumOccurance = intArray[0];
		
		for(int x=0;x<5;x++)
		{
			if(maximumOccurance < intArray[x])
			{
				maximumOccurance = intArray[x];
			}
		}
		System.out.println("Maximum Occurance character in the sequence is: " + maximumOccurance);
	}
}
