import java.util.Scanner;

/**
 * 
 */

/**
 * @author scott.hardman
 *
 */
public class ArrayExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int[] myArray = {13, 17, 20, 2, 6, 8, -3, 10};
		int index = -1;
		int minimum;
		int userValue;
		
		//To iterate through an array, we use a for loop!
		// i is the current index we are looking at in the array
		// i will search through every element in the array
		// because i will continue until it is as large as the length
		// of the array
		for(int i = 0; i < myArray.length; i++){
			
			//This will display all values
			System.out.print(myArray[i] + "   ");
			
		}
		
		//This code gets the value you want to search from the user
		System.out.println();
		System.out.println("What value do you want the index of?");
		userValue = userInput.nextInt();
		
		//To search for something, I need to look at every element
		//of the array. This is accomplished by looping through all
		//the elements.
		for(int i = 0; i < myArray.length; i++){
			if(myArray[i]==userValue){
				index = i;
			}
		}
		
		if(index == -1){
			System.out.println("This is not in the array!");
		} else {
			System.out.println(userValue + " is at index " + index);
		}

		
		
		/**
		 * Finding the minimum value in an array
		 */
		
		minimum = myArray[0];
		
		//To find the minimum value of the array, we have to
		//search through every element of the array and see if
		//the current value is smaller than the previous value
		
		for(int i = 0; i < myArray.length; i++){
			
			//Checks whether the current element is less than minimum
			if(myArray[i] < minimum){
				
				//If yes, change minimum to the current element
				minimum = myArray[i];
				
			}
			
			
		}
		
		System.out.println("The minimum value is: " + minimum);
		
		
		userInput.close();
		
		
		
		
		
		
		

	}

}
