import java.util.Scanner;

/**
 * 
 */

/**
 * Jasmyn Stansfield
 * Mr. Hardman
 * Assignment 6, program 3
 * December 16 2016
 */
public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int userNum;
		boolean isPrime;
		
		System.out.println("Please enter a number to check if it is prime:");
		userNum = userInput.nextInt();

		isPrime =isPrime(userNum);
		
		if(userNum == 1){
			
			System.out.println("1 is not prime");
			
		} else if (isPrime == true){
			
			System.out.println(userNum + " is prime");
			
		} else {
			
			System.out.println(userNum + " is not prime");
		}
			
		userInput.close();
		
	}
	
	 /**
	  * isPrime will check if an entered number is prime
	  * 
	  * @param userNum is the number entered by the user
	  * @return a boolean to tell if a number is prime
	  */
	public static boolean isPrime (int userNum){
		
		boolean prime = true;
		
		for(int i = 2; prime && i <= Math.sqrt(userNum); i++){	
			if (userNum % i == 0){
				
				prime = false;
				
			}
		}
		return prime;
	}

}
