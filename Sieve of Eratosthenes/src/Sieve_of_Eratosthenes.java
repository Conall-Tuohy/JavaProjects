import java.util.*;
import java.lang.*;
public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.println("Please type a number >= 2 :");
		if(input.hasNextInt())
		{int userInput = input.nextInt();
		if (userInput>=2)
			sieve(userInput+1);
		else
			System.out.println("That doesn't seem to be a number that is greater than or equal to two.");
		} else 	System.out.println("That doesn't seem to be a number.");

	}
	public static boolean[] createSequence (int input){
		boolean[] array = new boolean[input];
		for(int index = 0; index < input; index++)
			array[index] = true;

		String outputString = "2";
		for (int printArray = 3; printArray<array.length; printArray++)
			if (array[printArray] == true)
				outputString = outputString + ", " + (printArray);
		System.out.println(outputString);
		return array;
	}
	public static void crossOutHigherMultiples (boolean[] array, int currentNumber, int input){

		if(array[currentNumber] ==true)
		{
			for (int numberMultiple = 2*currentNumber; numberMultiple<array.length; numberMultiple+=currentNumber){
				array[numberMultiple]=false;

				//System.out.println("multiple: " + numberMultiple);
			}
		}
	}
	public static boolean[] sieve (int input){
		double maxNumber= Math.sqrt(input);
		boolean[] array = createSequence(input);
		String oldString = "";
		for (int currentNumber = 2; currentNumber<maxNumber; currentNumber++)
		{ 
			crossOutHigherMultiples(array,currentNumber,input);
			if (sequenceToString(array)!=oldString && array[currentNumber])
			{
				System.out.println(sequenceToString(array));
				oldString = sequenceToString(array);
			}
		}
		nonCrossedOutSubseqToString(array);
		return array;

	}
	public static String sequenceToString  (boolean[] array){
		String outputString = "2";
		for (int printArray = 3; printArray<array.length; printArray++)
			if (array[printArray] == true)
				outputString = outputString + ", " + (printArray);
			else 
				outputString = outputString + ", " +  "["+(printArray)+"]";

		return outputString;
	}
	public static void nonCrossedOutSubseqToString  (boolean[] array){
		String primeString = "2";
		for (int printArray = 3; printArray<array.length; printArray++){
			if (array[printArray])
				primeString = primeString + ", " + (printArray);
		}
		System.out.println(primeString);
	}
}
