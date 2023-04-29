//Write a java program to print the star pattern
/*

	*
  * * *
* * * * *

*/

import java.util.Scanner;

public class astrikPattern {
	
	private static final String Star = "* ";
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of Lines: ");
		
		int lines = scanner.nextInt();
		
		for(int i=0; i<lines; i++) {
			
			for(int k=i; k<lines; k++) {
				System.out.print("  ");
			}
			
			for(int j=0; j<=2*i; j++) {
				System.out.print(Star);
			}
			
			System.out.println();
		}	
	}
}






















































//int row; 
//
//System.out.print("Enter the number of rows: ");
//
//Scanner scanner = new Scanner(System.in);
//row = scanner.nextInt();
//
//for (int i=0; i <= row; i++) {
//	
//	if(i%2==0) {
//		
//		for(int j=row-i; j>1; j--) {
//			System.out.print(" ");
//		}
//		
//		for(int j=0; j<=i; j++) {
//			System.out.print(Star);
//		}
//		
//		System.out.println();
//	}
//}
//

