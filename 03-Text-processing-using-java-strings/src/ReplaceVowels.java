/*
5) Write a JAVA program to get a long paragraph of text and find out all the vowel and
replace it with special symbol ($), finally outputs the given text and modified text.
 */

import java.util.Scanner;

public class ReplaceVowels {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Paragraph: ");
        String userInput = scanner.nextLine();
        
        char charArray[] = userInput.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
        	
               if (charArray[i]=='a' || charArray[i] =='e'||charArray[i]=='i'||charArray[i]=='o'||charArray[i]=='u' || charArray[i]=='A' || charArray[i] =='E'||charArray[i]=='I'||charArray[i]=='O'||charArray[i]=='U') {
                charArray[i]='$'; 
               }   
        }
        
        for (int i = 0; i < charArray.length; i++) {
        	
            System.out.print(charArray[i]);
        }
    }
}
