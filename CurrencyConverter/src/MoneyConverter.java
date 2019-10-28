/*		SELF ASSESMENT
	1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 10:   10  
       //Used them to define all old currencies into pence.
   2. Did I use easy-to-understand, meaningful CONSTANT names?
       Mark out of 5:  5
       //Made sure to state what type of currency it was and what it became.
    3. Did I format the CONSTANT names properly (in UPPERCASE)?
       Mark out of 5:  5
       //Used uppercase and use of "_" between words.
   4. Did I use easy-to-understand meaningful variable names?
       Mark out of 10:  10
       //Made sure to follow the coding standards and make sure that the name was relevant to the variable.
   5. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 10:  10
       //All formatted correctly.
   6. Did I indent the code appropriately?
       Mark out of 10:  10
       //Made sure to go back and correct all lines to indent correctly.
   7. Did I read the input correctly from the user using (an) appropriate question(s)?
       Mark out of 10:  10
       //Asked multiple questions to avoid confusion with format of input for the user.
   8. Did I compute the answer correctly for all cases?
       Mark out of 20:  20
       //Tested rigorously with as many cases as I could think of and, to my knowlege, everything was computed perfectly.
   9. Did I output the correct answer in the correct format (as shown in the examples)?
       Mark out of 10:  10
       //Yes, adding commas to improve grammar and legibility.
   10. How well did I complete this self-assessment?
       Mark out of 10:  8
       //Was most likely extremely biased as I was inclined to give myself full marks for everything.
       //Although I made sure I adhered to all coding standards and give all answers in the proper format before I did the self assessment.
   Total Mark out of 100 (Add all the previous marks): 98
*/
import javax.swing.JOptionPane;
import java.util.Scanner;

public class MoneyConverter {
	public static final int NEW_PENNIES_TO_OLD = 67;
	public static final int SHILLINGS_TO_NEW_PENNIES = 12*67;
	public static final int OLD_POUND_TO_NEW_PENNIES = 20*12*67;
	public static final int NEW_POUND_TO_NEW_PENNIES = 100;
	
	public static void main(String[] args) {
			//input
		String currencyInput = JOptionPane.showInputDialog("Enter the amount of old pounds you have:");
		Scanner poundsScanner = new Scanner(currencyInput);
		double oldPounds = poundsScanner.nextDouble();
		
		currencyInput = JOptionPane.showInputDialog("Enter the amount of old shillings you have:");
		Scanner	shillingsScanner = new Scanner(currencyInput);
		double oldShillings = shillingsScanner.nextDouble();
		
		currencyInput = JOptionPane.showInputDialog("Enter the amount of old pence you have:");
		Scanner	penniesScanner = new Scanner(currencyInput);
		double oldPennies = penniesScanner.nextDouble();
		
		penniesScanner.close();
		shillingsScanner.close();
		poundsScanner.close();
			//calculations
		double newMoney = ((oldPounds*OLD_POUND_TO_NEW_PENNIES) + (oldShillings*SHILLINGS_TO_NEW_PENNIES) + 
			(oldPennies*NEW_PENNIES_TO_OLD))/NEW_POUND_TO_NEW_PENNIES;
		//Changing all Old Currencies into New Pennies
			//ouput
		JOptionPane.showMessageDialog(null, oldPounds + " old pounds, " + oldShillings + " old shillings, and "
				+ oldPennies + " old pence = " + "£" + String.format("%.2f",newMoney));
	}
}
