/*
4)A book shop maintains the inventory of books that are being sold at the shop. The
list includes details such as author, title, price, publisher and stock position.

Whenever a customer wants a book, the sales person inputs the title and author and
the system searches the list and displays whether it is available or not. If it is not, an
appropriate message is displayed. 
If it is, then the system displays the book details and requests for the number of copies required.
If the requested copies are available,
the total cost of the requested copies is displayed; otherwise the message “Required
copies is not in stock” is displayed. Design a system using a class called books with
suitable member functions and constructors.

Also incorporate the following features:
a) The price of the books should be updated as and when required.
Use a private member function to implement this.
b) The stock value of each book should be automatically updated as soon as
a transaction is completed.
c) The number of successful and unsuccessful transactions should be
recorded for the purpose of statistical analysis. Use static data members
to keep count of transactions.
 */

import java.util.*;

class Book {

    String author, title, publisher;
    int noOfCopies;

    private float totalPrice, pricePerBook;

    public Book(String title, String author, float pricePerBook, String publisher, int noOfCopies) {
        this.title = title;
        this.author = author;
        this.pricePerBook = pricePerBook;
        this.publisher = publisher;
        this.noOfCopies = noOfCopies;
        this.totalPrice = 0;
    }

    public void displayBook() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.pricePerBook);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("No Of Copies: " + this.noOfCopies);
        // System.out.println("Total earnings: " + this.totalPrice);
    }

    public void report() {
        System.out.println("Title: " + this.title);
        System.out.println("Price: " + this.pricePerBook);
        System.out.println("No Of Copies: " + this.noOfCopies);
        System.out.println();
    }

    public float getPrice() {
        return pricePerBook;
    }

    public void setPrice(float pricePerBook) {
        this.pricePerBook = pricePerBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

}

class BookInventory {

    public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", "Rowlling", 780, "Rowlling Publications", 20);
        Book book2 = new Book("The Programmers life", "Ruban", 1500, "Ruban Publications", 30);
        Book book3 = new Book("How to learn java?", "Gino", 500, "Gino Publications", 25);
        Book book4 = new Book("Nothing without Code", "Kom", 950, "Kim Publications", 50);
        Book book5 = new Book("Life without code", "Johnson", 650, "John Publications", 30);
        Book book6 = new Book("Hack me", "Snowin", 830, "DevSnow Publications", 10);

        ArrayList<Book> books = new ArrayList<Book>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        String user_input;
        String book_name;
        float book_price;
        int book_copies;
        float book_earnings;
        int successfull = 0;
        int unsuccessfull = 0;
        boolean isPurchasing = true;


        while (isPurchasing) {

            System.out.println("Available books: ");
            for (Book book : books) {
                System.out.println("\t" + book.getTitle());
            }
            
            System.out.println();
            System.out.println("To exit press, type 'q' !");

            System.out.println();
            System.out.print("What would you like to buy?: \n ->");
            user_input = scanner.nextLine();

            if(user_input.equals("q")){
                System.out.println("Thank for visting us!");
                isPurchasing = false;
            }

            else if(user_input.equals("report")){
            	
            	System.out.println("\nSTATISTICAL REPORT");

                float total_amount = 0;

                for (Book book: books){
                    book.report();
                    total_amount += book.getTotalPrice();
                }

                System.out.println("Total earnings: " + total_amount);
                System.out.println(); 
                System.out.println("Statistical Analytics");
                System.out.println("Total successfull payments: " + successfull);
                System.out.println("Total unsuccessfull payments: " + unsuccessfull);
                System.out.println(); 
            }
            
            else {

                for (Book book : books) {

                    book_name = book.getTitle();
                    book_price = book.getPrice();
                    book_copies = book.getNoOfCopies();
                    book_earnings = book.getTotalPrice();

                    if (user_input.equals(book_name)) {
                        
                        System.out.println();
                        System.out.println(book_name + " is Available!");

                        System.out.println();
                        book.displayBook();
                        System.out.println();

                        System.out.print("How many copies do you want?: ");
                        int noOfCopiesWanted = scanner.nextInt();
                        float total_amount = book_price * (float) noOfCopiesWanted;

                        if (noOfCopiesWanted <= book_copies) {
                            System.out.println("Total Cost for the book '" + book_name + "' is: " + total_amount);
                            System.out.println();
                            System.out.print("Comfirmation: Do you want to purchase '" + book_name + "'?(y/n): ");
                            char isLikedToPurchase = scanner.next().charAt(0);

                            if (isLikedToPurchase == 'y') {
                                book_copies -= noOfCopiesWanted;
                                book.setNoOfCopies(book_copies);
                                book_earnings += total_amount;
                                book.setTotalPrice(book_earnings);
                                
                                System.out.println("Thanks for the purchasing!! We recieved your payment!!");

                                successfull += 1;

                                System.out.println();
                                book.displayBook();
                                System.out.println();

                                System.out.print("Would you like to continue purchasing?(y/n): ");
                                char isContinue = scanner.next().charAt(0);

                                if (isContinue == 'y'){
                                    user_input = scanner.nextLine();
                                }

                                else {
                                    System.out.println("Thank for visting us!");
                                    isPurchasing = false;
                                    break;
                                }

                            }
                            else {
                                unsuccessfull += 1;
                                System.out.print("Would you like to continue purchasing?(y/n): ");
                                char isContinue = scanner.next().charAt(0);

                                if (isContinue == 'y'){
                                    user_input = scanner.nextLine();
                                }

                                else {
                                    System.out.println("Thank for visting us!");
                                    isPurchasing = false;
                                    break;
                                }
                            }

                        } else {
                            System.out.println("Sorry," + noOfCopiesWanted + " copies are not available!");

                            System.out.print("Would you like to continue purchasing?(y/n): ");

                            char isContinue = scanner.next().charAt(0);
                            System.out.println();

                                if (isContinue == 'y'){
                                    user_input = scanner.nextLine();
                                }

                                else {
                                    System.out.println("Thank for visting us!");
                                    isPurchasing = false;
                                    break;
                                }
                            
                        }

                    }
    
                    else {
                        System.out.println("Searching for the book.........");

                        // System.out.println(books.get(books.size()-1).getTitle());
                        // System.out.println(book_name);
                        
                        if(books.get(books.size()-1).getTitle().equals(book_name)){
                          System.out.println("Sorry, the book you're looking for is not available.");

                          System.out.print("Would you like to continue purchasing?(y/n): ");

                            char isContinue = scanner.next().charAt(0);
                            System.out.println();

                                if (isContinue == 'y'){
                                    user_input = scanner.nextLine();
                                }

                                else {
                                    System.out.println("Thank for visting us!");
                                    isPurchasing = false;
                                    break;
                                }
                        }
                        
                    }
                    
                }
                
            }
        }
    }
}
