//1) Write a program that create a thread and display the line of multiplication table of number 5 for every 3 seconds.

public class MultiplicationTable extends Thread {
	
	public void run() {
		int num = 5; 
		String s = "👇";
		
		System.out.println("Multiplication Table of 5 " + s);
		
		try {
			for (int i=1; i<=10; i++) {
				Thread.sleep(3000);
				System.out.println(i + " x " + num + " = " + i*num);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
				
	}
	
	public static void main(String[] args) {
		MultiplicationTable multiplication = new MultiplicationTable();
		multiplication.start();
	}
}



