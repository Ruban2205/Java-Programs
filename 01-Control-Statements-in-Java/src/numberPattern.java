//write a java program to print this number pattern. 
/* 
    1
  1 2 1
1 2 3 2 1
 
 */

import java.util.Scanner;

public class numberPattern {
	
	public static void main(String args[])
	 {
	 int lines;
	 
	 Scanner scanner = new Scanner(System.in);
	     System.out.print("Enter the no of lines: ");
	 lines=scanner.nextInt();
	 
	     for(int i=1;i<=lines;i++) {
	 
	        for(int j=1;j<=lines-i;j++) {
	     System.out.print("  "); 
	     } 
	        for(int j=1;j<=i;j++){
	     System.out.print(j+" ");
	     } 
	        for(int j=i-1;j>=1;j--) {
	     System.out.print(j + " "); 
	     } 
	 
	         System.out.println();
	     }
	 }
}