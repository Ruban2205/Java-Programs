package pkg2;

import java.util.*;
import pkg1.Book;

public class Admin{
	String addAuthor, addTitle; 
	int addNoOfCopies; 
	
	public Scanner scanner = new Scanner(System.in);
	
	public Book addBook() {
		System.out.println("*Please provide the book TITLE as Upper Case!");
		System.out.print("\nEnter the book title*: ");
		addTitle = scanner.nextLine();
		
		System.out.print("Enter the book author: ");
		addAuthor = scanner.nextLine();
		
		System.out.print("Enter the No of Copies: ");
		addNoOfCopies = scanner.nextInt(); 
		
		Book book = new Book(addTitle, addAuthor, addNoOfCopies);
		
		System.out.println("\nBook is ADDED Successfully!!!");
		
		return book;
	}
}
