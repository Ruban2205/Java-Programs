/*Write a program to implement the Library Information System usingpackages
with the following instructions
a) Create a Books class in pkg1.
b) Create an Admin class in pkg2.
c) Create a User class in pkg3.
d) Import all packages in Test class and do the following operations in a menu-driven
fashion. Add books, Search books, and List books.*/

import pkg1.Book; 
import pkg2.Admin;
import pkg3.User;

import java.util.*;

public class Test {
	
	public static boolean isShopping = true; 
	public static Scanner scanner = new Scanner(System.in); 
	
	static void MenuDrive() {
		System.out.println();
		System.out.println("1. ADD BOOK");
		System.out.println("2. LIST BOOK");
		System.out.println("3. SEARCH BOOK");
		System.out.println("4. EXIT");
	}
	
	public static void main(String[] args) {
		int userChoice; 
		
		Book book1 = new Book("EASY JAVA", "Rowlling", 50);
        Book book2 = new Book("PROGRAMMER", "Ruban", 60);
        Book book3 = new Book("HACK ME", "DevSnow", 80);

        ArrayList<Book> books = new ArrayList<Book>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        
        System.out.println("<=====WELCOME TO LIBRARY INFO MANAGEMENT=====>");
		
		while(isShopping) {
			MenuDrive(); 
			
			System.out.print("Enter your Choice: ");
			userChoice = scanner.nextInt(); 
			
			String userTitle;
			boolean isFounded = false; 
			
			switch(userChoice) {
			case 1: 
				Admin admin = new Admin(); 
				books.add(admin.addBook());
				break; 
				
			case 2:  
				System.out.println();
				System.out.println("<=====THE AVAILABLE BOOKS ARE=====>");
				for(Book book:books) {
					book.displayBooks();
				}
				break;
				
			case 3: 
				User user = new User();
				userTitle = user.Search();
				
				for(Book book:books) {
					if(userTitle.equals(book.title)) {
						book.displayBooks();
						isFounded=true; 
					}
				}
				
				if(!isFounded) {
					System.out.println("Book is not founded!!");
				}
				break;
				
			case 4: 
				System.out.println("Thanks for Using Book Management by URK20CS2001!!");
				isShopping = false; 
				break;
				
			default: 
				System.out.println("<-----INVALID USER CHOICE----->");
				break;
			}
			
		}
		
		
	}
}
