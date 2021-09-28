/*
 2) Implement the following procedure to generate prime numbers from 1 to 100 into a
program. This procedure is called sieve of Eratosthenes.
step 1 - Fill an array num[100] with numbers from 1 to 100
step 2 - Starting with the second entry in the array, set all its multiples to
zero. 
step 3 - Proceed to the next non-zero element and set all its
multiples to zero.
step 4 - Repeat step 3 till you have set up the multiples of all the non-zero
elements to zero
step 5 - At the conclusion of step 4, all the non-zero entries left in the array
would be prime numbers, so print out these numbers.
 */


public class primeNubmerSieveProcedure {
	
	public static void main(String[] args) {
		int primeNumber[] = new int[101];
		
		primeNumber[0] = 0; 
		primeNumber[1] = 0; 
		
			for (int i=2; i<=100; i++) {
				primeNumber[i] = i;
			}
			
			for (int j=2; j<=Math.sqrt(100); j++) {
				
				if(primeNumber[j] != 0) {
					
					for(int k=j; k*j<=100; k++) {
						primeNumber[k*j] = 0;  
					}
				}
			}
			
			System.out.println("The prime number from 1 to 100 are: ");
			
			for(int i=2; i<=100; i++) {
				if(primeNumber[i] != 0) {
					System.out.println(i);
				}
			}
			
		}

}
