/*
Define a class in JAVA with following description:

Private Members:
 A data member Flight number of type integer
 A data member Destination of type string
 A data member Distance of type float
 A data member Fuel of type float
 A member function CALFUEL () to calculate the value
of Fuel as per the following criteria

Distance                      Fuel
<=1000                     -  500
more than 1000 and <=2000  -  1100
more than 2000             -  2200

Public Members:
1)A function FEEDINFO() to allow user to enter values for
Flight Number, Destination, Distance & call function CALFUEL() to calculate the quantity of Fuel 

2)A function SHOWINFO () to allow user to view the content
of all the data members solution
*/

import java.util.*;

class FuelCalculator {

  public static Scanner scanner = new Scanner(System.in);

  private static int flightNumber;
  private static String destination; 
  private static float distance; 
  private static float fuel; 

  public static void FEEDINFO(){
    System.out.println();
    System.out.print("Enter your Flight Number: ");
    flightNumber = scanner.nextInt();
    String temp = scanner.nextLine();  
    
    System.out.print("Enter your Destination: ");
    destination = scanner.nextLine(); 
    
    System.out.print("Enter the Distance: ");
    distance = scanner.nextFloat();  

  }

  private static void CALFUEL(){
    if(distance <= 1000){
      System.out.println("500 litre of fuel is needed!");
    } else if(distance > 1000 && distance <=2000){
      System.out.println("1100 litre of fuel is needed!!"); 
    }else{
      System.out.println("2200 litre of fuel is needed!!!");
    }
    
  } 

  public static void SHOWINFO(){
	System.out.println();
    System.out.println("Flight Number: " + flightNumber);
    System.out.println("Destination: " + destination);
    System.out.println("Distance: " + distance); 
  } 

  public static void main(String[] args) {
    FEEDINFO();
    CALFUEL();

    System.out.println(); 

    System.out.print("Would you like to display the details?(y/n): ");
    char userInput = scanner.next().charAt(0); 
    
    if(userInput == 'y'){
      SHOWINFO(); 
    }
    else{
      System.out.println("Thanks for using the Fuel!!");
    }
  }
}
