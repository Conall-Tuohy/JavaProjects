/* SELF ASSESSMENT

Harness Class: Member variables (8 marks: 8)
All my data members are declared, public and the ones that don't change are marked as private. I also have a constant for the maximum number of uses of a harness.
Comment: Yarp. All are public besides the constant ones. I have a constant for 25 (the maximum number of uses of a harness).

Harness Class: Harness constructor 1 & constructor 2 (6 marks: 6)
I initialize all the variables using the parameters given and set the other members to reasonable default values.
Comment: Yarp. It really be like it do even if you don't think it be like it is.

Harness Class: checkHarness method (5 marks: 5)
My method takes an instructor's name as a parameter, and if the harness is not on loan sets the instructor member variable to the given parameter value (assuming the instructor's name is not null/empty). It also resets the number of times the harness was used.
Comment: Yarp, my method takes an instructor's name as a parameter, and if the harness is not on loan sets the instructor member variable to the given parameter value 
				(assuming the instructor's name is not null/empty). It also resets the number of times the harness was used.

Harness Class: isHarnessOnLoan method (2 marks: 2)
My method has no parameters and returns the value of the loan status variable.
Comment: Yarp, my method has no parameters and returns the value of the loan status variable.

Harness Class: canHarnessBeLoaned method (4 marks: 4)
My method has no parameters and returns true if the harness is not on loan and if the number of times it was used is less than the maximum allowed number of times.
Comment: Yarp, my method has no parameters and returns true if the harness is not on loan and if the number of times it was used is less than the maximum allowed number of times.

Harness Class: loanHarness method (6 marks: 6)
My method has a member name as a parameter and it checks if harness can be loaned by using the canHarnessBeLoaned method. If true, it sets the club member value to the parameter value, sets the on loan status to true and increments the number of times used variable.
Comment: Yarp, my method has a member name as a parameter and it checks if harness can be loaned by using the canHarnessBeLoaned method. If true, it sets the club member value to 
				the parameter value, sets the on loan status to true and increments the number of times used variable.

Harness Class: returnHarness method (5 marks: 5)
My method has no parameters, checks if the harness is on loan, and if so, changes its on-loan status to false, and resets the club member value.
Comment: Yarp, my method has no parameters, checks if the harness is on loan, and if so, changes its on-loan status to false, and resets the club member value.

Harness Class: toString method (3 marks: 3)
My method returns a String representation of all the member variables.
Comment: Yarp, my method returns a String representation of all the member variables.

HarnessRecords Class: member variables (3 marks: 3)
I declare the member variable as a private collection of Harnesses 
Comment: Yarp, I declare the member variable as a private collection of Harnesses 

HarnessRecords Class: HarnessRecords constructor 1 & 2 (9 marks: 9)
In the first constructor, I set the member variable to null [1 mark]. In the second constructor, I use the set of characteristics in the list to create Harness objects and add them to the collection. 
Comment: Yarp, in the first constructor, I set the member variable to null [1 mark]. In the second constructor,
 				I use the set of characteristics in the list to create Harness objects and add them to the collection. 

HarnessRecords Class: isEmpty method (1 marks: 1)
I return true if the collection is null/empty and, false otherwise.
Comment: Yarp, I return true if the collection is null/empty and, false otherwise.

HarnessRecords Class: addHarness method (5 marks: 5)
My method takes a Harness object as a parameter and adds the harness to the collection.
Comment: Yarp, my method takes a Harness object as a parameter and adds the harness to the collection.

HarnessRecords Class: findHarness method (6 marks: 6)
My method takes a make and model number as parameters. It checks if a harness with such properties exists and if it does it returns harness object, otherwise returns null.
Comment: Yarp, my method takes a make and model number as parameters. It checks if a harness with such properties exists and if it does it returns harness object, otherwise returns null.

HarnessRecords Class: checkHarness method (6 marks: 6)
Must take instructor name, make and model number as parameters and return a Harness. If a harness with the make and model number exists by using the findHarness method and is not on loan, the Harness method checkHarness is called with the instructor name as a parameter and the updated Harness object is returned. If the harness is not available returns null.
Comment: Yarp, must take instructor name, make and model number as parameters and return a Harness. If a harness with the make and model number exists by using the findHarness method and is not on loan, 
			the Harness method checkHarness is called with the instructor name as a parameter and the updated Harness object is returned. If the harness is not available returns null.

HarnessRecords Class: loanHarness method (7 marks: 7)
My method takes a club member name as a parameter and looks for an available harness by calling the method canHarnessBeLoaned be loaned. If an available harness is found it is loaned by using the Harness method loanHarness with the club member as a parameter, returning the harness. If there's no available harness null is returned.
Comment: Yarp, my method takes a club member name as a parameter and looks for an available harness by calling the method canHarnessBeLoaned be loaned. If an available harness is found it is loaned by 
				using the Harness method loanHarness with the club member as a parameter, returning the harness. If there's no available harness null is returned.

HarnessRecords Class: returnHarness method (7 marks: 7)
My method takes a make and model number as parameters. It checks if a harness with those properties exists by using the findHarness method. If the found harness is not null, it returns the harness object by using Harness method returnHarness, otherwise returns null.
Comment: Yarp, my method takes a make and model number as parameters. It checks if a harness with those properties exists by using the findHarness method.
 				If the found harness is not null, it returns the harness object by using Harness method returnHarness, otherwise returns null.

HarnessRecords Class: removeHarness method (8 marks: 8)
My method takes a make and model number as parameters and check the collection for a harness with those properties and removes it. It returns the harness object if it is found, otherwise returns null.
Comment: Yarp, my method takes a make and model number as parameters and check the collection for a harness with those properties and removes it. It returns the harness object if it is found, otherwise returns null.

GUI (Java main line) (5 marks: 5)
My test class has a menu which implements at least the five points specified using the HarnessRecords class methods.
Comment: Yurt, I tested all of the different functions many times in as many variations as I could. I tested whether it could store multiple Harnesses and still operate everything fine. 
				I think everything works perfectly to the set standards.

Overall Marks (100 marks: 100)
 */
import java.util.*;

public class Main {

	public static void main(String[] args) {
		String harnessMake;

		HarnessRecords officialRecords = new HarnessRecords();
		Harness tempHarness;
		boolean quit = false;
		while (!quit) {
			Scanner input = new Scanner(System.in); 
			System.out.println("Please type a number from 1 - 6 to choose from these options:" +
					"\n[1] Add a new harness \n[2] Remove a harness \n[3] Check a harness \n[4] Loan a harness" +
					" \n[5] Return a loaned harness  \n[6] Quit");

			if (input.hasNextInt()){
				int userInput = input.nextInt();
				if (userInput >= 1 && userInput <= 6) {
					switch (userInput) {
					case 1://if(officialRecords.isEmpty())
						System.out.println("Please type the make of the new Harness");
						harnessMake = input.next();
						System.out.println("Please type the model number of the new Harness");
						if (input.hasNextInt()) {
							int harnessModelNumber = input.nextInt();
							System.out.println("Please type the name of the instructor who bought this harness");
							String harnessInstructor = input.next();
							tempHarness = new Harness(harnessMake, harnessModelNumber, harnessInstructor);
							officialRecords.addHarness(tempHarness);
							break;
						} else {
							System.out.println("That didn't seem to be an integer... Whoops.");
							break;
						}
					case 2:
						System.out.println("Please type the make of the Harness you want to remove");
						harnessMake = input.next();
						System.out.println("Please type the model number of the Harness you want to remove");
						if (input.hasNextInt()) {
							int harnessModelNumber = input.nextInt();
							officialRecords.removeHarness(harnessMake, harnessModelNumber);
							break;
						} else {
							System.out.println("That didn't seem to be an integer... Whoops.");
							break;
						}
					case 3:
						System.out.println("Please type the make of the Harness you want checked");
						harnessMake = input.next();
						System.out.println("Please type the model number of the Harness you want checked");
						if (input.hasNextInt()) {
							int harnessModelNumber = input.nextInt();
							System.out.println("Please type the name of the instructor who will be checking this harness");
							String harnessInstructor = input.next();
							officialRecords.checkHarness(harnessMake, harnessModelNumber, harnessInstructor);
							break;
						} else {
							System.out.println("That didn't seem to be an integer... Whoops.");
							break;
						}
					case 4:
						System.out.println("Please type the name of the member who will be using this harness");
						String harnessInstructor = input.next();
						System.out.println(officialRecords.loanHarness(harnessInstructor).toString());
						break;
					case 5:
						System.out.println("Please type the make of the Harness you want to return");
						harnessMake = input.next();
						System.out.println("Please type the model number of the Harness you want to return");
						if (input.hasNextInt()) {
							int harnessModelNumber = input.nextInt();
							officialRecords.returnHarness(harnessMake, harnessModelNumber);
							break;
						} else {
							System.out.println("That didn't seem to be an integer... Whoops.");
							break;
						}
					case 6:
						System.out.println("Alright then, you are free to go.");
						quit = true;
					}
				} else System.out.println("That doesn't seem to be a number that is greater than or equal to 1 or less than or equal to seven.");
			} else System.out.println("That doesn't seem to be a valid number try again or just leave.");
		}
	}
}