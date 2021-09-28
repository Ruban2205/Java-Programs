// 8) -> Write a menu driven application to Library Management using Java to demonstrate the 
// concept of Inheritance. Your application must contain the following functionalities along 
// with the use of method overriding, and super keyword.
// a. The following details must be there for each Book
// i. bookTitle
// ii. bookAuthor
// iii. bookNoOfCopies
// iv. bookAvailability
// v.bookEdition
// vi. bookPublisher
// b. Get the Book details from librarian
// c. In the menu give options to borrow, return and Search options

import java.util.*;
 
class Books{
  String author, title, publisher, edition; 
  int noOfCopies; 

  public void displayBooks(){
    System.out.println(); 
  }

}

class Librarian extends Books{
  String book_title, book_author, book_publisher, book_edition;
  int book_copies;

  public Librarian(String title, String author, String publisher, String edition, int noOfCopies){
    this.title = title; 
    this.author = author; 
    this.publisher = publisher; 
    this.edition = edition; 
    this.noOfCopies = noOfCopies; 
  }
  
//  public Librarian(){}

  public void displayBooks(){
    super.displayBooks(); 
    System.out.println("Title: " + this.title);
    System.out.println("Author: " + this.author);
    System.out.println("Publisher: " + this.publisher);
    System.out.println("Edition: " + this.edition);
    System.out.println("No Of Copies: " + this.noOfCopies);
  }

  public String getTitle(){
    return title; 
  } 

  public void borrow(int num){
	  noOfCopies -= num;
  }

  public void return_book(int num1){
	  noOfCopies += num1;
  }
}

public class LibraryManagement {
  public static Scanner scanner = new Scanner(System.in);
  public static Scanner scanner1 = new Scanner(System.in);
  public static boolean isRunning = true; 

  public static void main(String[] args) {
  String book_title;
  int userInput1, userInput2; 
  
  Librarian arr[] = new Librarian[6]; 
  
  Librarian book1 = new Librarian("Harry Potter", "Rowlling", "Rowlling publications", "2nd Edition", 50);
  arr[0] = book1;
  Librarian book2 = new Librarian("Programmers life", "Ruban", "Ruban publications", "4t Edition", 60);
  arr[1] = book2;
  Librarian book3 = new Librarian("Learn java", "Gino", "Gino publications", "11th Edition", 40);
  arr[2] = book3;
  Librarian book4 = new Librarian("Programming", "Marry Kom", "Marry Kom publications", "8th Edition", 50);
  arr[3] = book4;
  Librarian book5 = new Librarian("Coding Life", "John", "John publications", "10th Edition", 80);
  arr[4] = book5;
  Librarian book6 = new Librarian("Hack me", "DevSnow", "Snowin publications", "5th Edition", 100);
  arr[5] = book6;
  
    while(isRunning){
      System.out.println(); 
      System.out.println("<======WELCOME TO LIBRARY MANAGEMENT SYSTEM======>");
      System.out.println();
      System.out.println("1. BOOK DETAILS");
      System.out.println("2. BORROW");
      System.out.println("3. RETURN"); 
      System.out.println("4. SEARCH"); 
      System.out.println("5. EXIT");
      System.out.println(); 

      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();

      if(choice == 1){
    	  for(int i=0;i<6;i++){
          	arr[i].displayBooks();
        }
      }
      else if(choice == 2){
        System.out.print("Enter the book name: ");
        book_title = scanner1.nextLine();

        for(int i=0;i<6;i++){
        	if(arr[i].getTitle().equals(book_title)){
        		System.out.print("Enter number of books needed: ");
        		userInput1 = scanner.nextInt();
            System.out.println(userInput1 + " Books borrowed successfully!!");
        		
        		arr[i].borrow(userInput1);
        	}
        }
      }
      else if(choice == 3){
    	  System.out.print("Enter the book name: ");
        book_title = scanner1.nextLine();

        for(int i=0;i<6;i++){
          if(arr[i].getTitle().equals(book_title)){
            System.out.print("Enter number of books to be returned: ");
          	userInput2 = scanner.nextInt();
            System.out.println(userInput2 + " Books returned successfully!!");
          		
          	arr[i].return_book(userInput2);
        	}
        }
      }
      else if(choice == 4){
    	  System.out.print("Enter the book name: ");
        book_title = scanner1.nextLine();

    	  for(int i=0;i<6;i++){
          	if(arr[i].getTitle().equals(book_title)){
          		System.out.println();
          		System.out.println(book_title + " book Founded!!");
          		arr[i].displayBooks();
        	}
        }
      }
      else if(choice == 5){
    	  System.out.println("Thank you! by URK20CS2001");
    	  System.out.println(); 
    	  System.out.println("Thanks For using LIBRARY MANAGEMENT");
    	  break;
      }
      else{
    	  System.out.println("<XXXXX-INVALID INPUT-XXXXX>");
      }
    }
  }
}