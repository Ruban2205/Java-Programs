/* 3) Create a java application that uses multi-threading concept to perform the following.
1. Getting inputs from user by using the thread name called“t1”.
2. Perform addition operation using the thread name called “t2”
3. Perform division operation using the thread name called “t3”
4. Perform Sum of numbers using the thread name called “t4” */

//S=n(n+1)2

import java.util.*;

class Addition extends Thread{
	int x, y; 
	
	Addition(int x, int y){
		this.x = x; 
		this.y = y; 
	}
	
	public void run() {
		int c = 0; 
		c = x + y; 
		System.out.println("Addition Value is: " + c);
	}
}

class Division extends Thread{
	int x, y; 
	
	Division(int x, int y){
		this.x = x; 
		this.y = y; 
	}
	
	public void run() {
		int c = 0; 
		c = x / y; 
		System.out.println("Division Value is: " + c);
	}
}

class SumOfNumbers extends Thread{
	int num, i=0, sum=0; 
	
	SumOfNumbers(int num){
		this.num = num; 
	}
	
	public void run() {
		while (i<=num) {
			sum = sum + i; 
			i++;
		}
		System.out.println("Sum of " + num +" numbers is: " + sum);
	}
}

class Input extends Thread{
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Input1: ");
		int inp1 = scanner.nextInt(); 
	
		System.out.print("Enter the Input2: ");
		int inp2 = scanner.nextInt(); 
		
		System.out.print("Enter the Input3 to perform sum of n Numbers: ");
		int inp3 = scanner.nextInt(); 
		
		Addition t2 = new Addition(inp1, inp2);
		t2.start();
		
		Division t3 = new Division(inp1, inp2);
		t3.start(); 
		
		SumOfNumbers t4 = new SumOfNumbers(inp3); 
		t4.start();
	}
}


public class MultiThreadingOperations{
	
	public static void main(String[] args) {
		Input t1 = new Input(); 
		t1.start(); 
	}

}
