//Write a java program to develop a Menu driven calculator with the following operations (+, -, *, /, %)

import java.util.Scanner;

public class calculator{

    public static int userChoice;	//Declaring User choice 

    public static boolean isRunning = true;
    public static void menuDriven ()
      {
        System.out.println ("\n*****Calculator*****\n");
        System.out.println ("1. Addition");
        System.out.println ("2. Subtraction");
        System.out.println ("3. Multiplication");
        System.out.println ("4. Division");
        System.out.println ("5. Modulus");
        System.out.println ("6. Exit");
    
        Scanner scanner = new Scanner (System.in);
    
          System.out.print ("Enter your choice: ");
          userChoice = scanner.nextInt ();
    
        if(userChoice >= 6) {
        	 System.out.println("INVALID CHOICE\n");
             System.out.println("Thanks for using Calculator!! Developed by RUBAN GINO SINGH URK20CS2001");
             System.exit(0);
        }
      }

  public static void main (String[]args)
  {

    while (isRunning)
      {

    	menuDriven ();
    
    	Scanner scanner = new Scanner (System.in);
    
    	System.out.print ("Enter the first Number: ");
    	int userInput1 = scanner.nextInt ();
    
    	System.out.print ("Enter the second Number: ");
    	int userInput2 = scanner.nextInt ();
    
    	switch (userChoice)
    	  {
    	  case 1:
    	    Addition addition = new Addition (userInput1, userInput2);	// Instance of a Class addition
    	    System.out.println ("\nYour Addition Value is: " + addition.addition () + "\n");	//Calling the addition Method from the class Addition 
    	    break;
    
    	  case 2:
    	    Subtraction subtraction =
    	      new Subtraction (userInput1, userInput2);
    	    System.out.println ("\nYour Subtraction Value is: " +
    				subtraction.subtraction () + "\n");
    	    break;
    
    	  case 3:
    	    Multiplication multiplication =
    	      new Multiplication (userInput1, userInput2);
    	    System.out.println ("\nYour Multiplication Value is: " +
    				multiplication.multiplication () + "\n");
    	    break;
    
    	  case 4:
    	    Division division = new Division (userInput1, userInput2);
    	    System.out.println ("\nYour Division Value is: " +
    				division.division () + "\n");
    	    break;
    
    	  case 5:
    	    Modulus modulus = new Modulus (userInput1, userInput2);
    	    System.out.println ("\nYour Modulus Value is: " +
    				modulus.modulus () + "\n");
    	    break;
    
    	  case 6:
    	   isRunning = false;
    	   System.out.println(isRunning);
    	   //System.exit (0);
    	   break;
    	  }
    }
  }

}

class Addition
{

  int a, b;			//Declaring Variables

    Addition (int a, int b)
  {
    this.a = a;
    this.b = b;
  }				//Creating Parameterized Constructor

  public int addition ()
  {

    return this.a + this.b;

  }				//Void Doesn't return anything so we assign int to the function (Method)
}

class Subtraction
{

  int a, b;

    Subtraction (int a, int b)
  {
    this.a = a;
    this.b = b;
  }

  public int subtraction ()
  {

    return this.a - this.b;

  }
}

class Multiplication
{

  int a, b;

    Multiplication (int a, int b)
  {
    this.a = a;
    this.b = b;
  }

  public int multiplication ()
  {

    return this.a * this.b;

  }
}

class Division
{

  int a, b;

    Division (int a, int b)
  {
    this.a = a;
    this.b = b;
  }

  public int division ()
  {

    return this.a / this.b;

  }
}

class Modulus
{

  int a, b;

    Modulus (int a, int b)
  {
    this.a = a;
    this.b = b;
  }

  public int modulus ()
  {

    return this.a / this.b;

  }
}