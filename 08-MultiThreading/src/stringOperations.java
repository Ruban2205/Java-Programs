/*2) Create a java program to read a paragraph of text data and create 2
threads namely word, vowel and do the following operations with 2
seconds delay.
A. word thread display each word one by one.
B. vowel thread prints each vowel one by one
*/

import java.util.Scanner;

class Words extends Thread{
	String string;
	
	Words(String string){
		this.string = string;
	}
	
	public void run(){
		String word[] = string.split(" ");
		
		System.out.println("\nWords in the paragraph: ");
		try{
			for(int i=0;i<word.length;i++){
				Thread.sleep(2000);
				System.out.println(word[i]);
			}
			System.out.println("\nMaximum number of Words are Founded!");
		}
		catch(Exception exception){
			System.out.println(exception);
		}
	}
}

class Vowels extends Thread{
	String str;
	
	Vowels(String str){
		this.str = str;
	}
	
	public void run(){
		String word[] = str.split("");
		String str1 = "aeiouAEIOU";
		System.out.println("\nVowels in the paragraph: ");
		
		try{
			for(int i=0;i<str.length();i++){	
				Thread.sleep(2000);
				if(str1.contains(word[i])){	
					System.out.println(word[i]);
				}
			}
			System.out.println("\nMaximum number of Vowels are Founded!");
		}
		catch(Exception exception){
			System.out.println(exception);
		}
	}
}

public class stringOperations {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter a paragraph: ");
		String string = scanner.nextLine();
		
		Words t1 = new Words(string);
		Vowels t2 = new Vowels(string);
		
		t1.start();
		try{
			t1.join();
		}
		catch(Exception scanner){
			System.out.println(scanner);
		}
		t2.start();
	}

}