/*
8) Write a program that uses an array of pointers to strings str[ ]. Receive two strings str1
and str2 and check if str1 is embedded in any of the strings in str[ ]. If str1 is
found,
then replace it with str2.
For example: the given array of string is
char *str[ ] = {
"We will teach you how to...",
"Move a mountain",
"Level a building",
"Erase the past",
"Make a million",
"...all through C!"
} ;
if str1 contains "mountain" and str2 contains "car", then the second string in str
should
get changed to "Move a car".
 */

import java.util.Scanner;


public class StringReplace {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string[] = { "We will teach you how to...",
						 "Move a mountain",
						 "Erase the past",
						 "Make a million",
						 "...all through C!"
		};
		
//		System.out.println("The Given String is: \n");
		
		System.out.print("Enter the first String: ");
		String string1 = new String(); 
		string1 = scanner.next(); 
		
		System.out.print("Enter the second String: ");
		String string2 = new String();
		string2 = scanner.next(); 
		
		boolean check = false; 
		
		for(int i=0; i<string.length; i++) {
			if(string[i].contains(string1)) {
				string[i] = string[i].replace(string1, string2); 
				check = true; 
			}
		}
		
		if(check) {
			System.out.println("The string contains " + string1 + "\n");
			System.out.println("The Replaced string is: \n");
			for(int i=0; i<string.length; i++) {
				System.out.println(string[i]);
			}
			
			} else {
				System.out.println("The paragraph doesn't contain " + string1 + "\n" );
				scanner.close();
		}
	}
}
