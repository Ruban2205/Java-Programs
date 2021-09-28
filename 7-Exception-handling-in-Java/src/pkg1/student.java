/*3. Define Exception Handling. Write a java program to create a user defined exception for the
following
a) Create a student class and get the name of the student and 3 subject marks
b) Find the length of the name. If the length > 7 throw LengthException
c) Find the average of marks, if avg < 50 throw FailedException
d) If avg < 75 && avg > 50 throw NotFirstClassException
e) If avg > 75 throw FirstClassException*/

package pkg1;
import java.util.*;

class Grade extends Exception{
	Grade(String studentMark){
		super(studentMark);
	}
}

public class student {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int average; 
		int subject1; 
		int subject2; 
		int subject3; 
		
		System.out.println("WELCOME TO GRADE CHECKER");
		
		Grade grade1 = new Grade("\nFirstClassException"); 
		Grade grade2 = new Grade("\nFaliedException");
		Grade grade3 = new Grade("\nNotFirstClassException");
		Grade grade4 = new Grade("\nLengthException");
		
		System.out.print("\nEnter your NAME: ");
		String name = scanner.next(); 
		int length = name.length(); 
		
		System.out.print("Enter the mark of FIRST Subject: ");
		subject1 = scanner.nextInt(); 
		
		System.out.print("Enter the mark of SECOND Subject: ");
		subject2 = scanner.nextInt(); 
		
		System.out.print("Enter the mark of THIRD Subject: " + "\n");
		subject3 = scanner.nextInt(); 
		
		average = (subject1 + subject2 + subject3)/3; 
		
		try {
			if(length > 7) {
				throw(grade4);
			}
		} 
		catch(Grade e) {
			System.out.println(e);
		}
		
		try {
			if(average > 75) {
				throw(grade1);
			}
			else if(average < 75) {
				throw(grade3);
			}
			else if(average < 50) {
				throw(grade2);
			}
		}
		catch(Grade e) {
//			e.printStackTrace();
			System.out.println(e);
		}
	}
}
