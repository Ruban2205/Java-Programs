package pkg3;

import pkg1.Book;
import pkg2.Admin;

import java.util.*;

public class User {
	String userAuthor, userTitle; 
	int userNoOfCopies;
	
	public Scanner scanner = new Scanner(System.in);
	
	public String Search() {
		System.out.print("Enter the title of book you want to search: ");
		userTitle = scanner.nextLine().toUpperCase();
		
		return userTitle; 
	}
}