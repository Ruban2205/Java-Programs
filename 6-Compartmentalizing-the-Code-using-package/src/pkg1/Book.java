package pkg1;

public class Book {
	String author;
	public String title;
	int noOfCopies; 
	
	public Book(String title, String author, int noOfCopies) {
		this.title = title; 
		this.author = author;  
		this.noOfCopies = noOfCopies; 
	}
	
	public void displayBooks() {
		System.out.println();
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("No of Copies: " + this.noOfCopies);
	}
	
}
