/* SELF ASSESSMENT

 1. Did I use appropriate, easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE?

        Mark out of 5: 5
        Comment: Constants were needed for Kens functions and also could have been used for Kens equation for the correct
        		day but I felt like keeping the numbers as the original numbers and having the equation beneath would be
        		suitable considering the numbers are used once and their relevance is unknown. 

 2. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)?

        Mark out of 5: 5
        Comment:   Used lowerCamelCase and was able to make all variables relate to its purpose.

 3. Did I indent the code appropriately?

        Mark out of 5:  5
        Comment: 	Yes. Used crtl + a, crtl + i at the end as well as doing it correctly throughout anyway.

 4. Did I define the required functions correctly (names, parameters & return type) and invoke them correctly?

       Mark out of 20: 20
        Comment:  All functions were called correctly and used properly.

 5. Did I implement the dayOfTheWeek function correctly and in a manner that can be understood?

       Mark out of 20: 20
        Comment:  Yes

 6. Did I implement the other functions correctly, giving credit for any code that you take from elsewhere?

       Mark out of 20: 20 
        Comment:  Yes

 7. Did I obtain (and process) the input from the user in the correct format (dd/mm/yyyy), and deal with any invalid input properly?       
      Mark out of 10: 10 
        Comment: Yes

 8. Does the program produce the output in the correct format (e.g. Monday, 25th December 2017)?

       Mark out of 10: 10 
        Comment:  Yes

 9. How well did I complete this self-assessment?

        Mark out of 5: 5 
        Comment: Perfectly

 Total Mark out of 100 (Add all the previous marks): 100

 */ 
import java.util.Scanner;
import java.lang.Math;
import javax.swing.JOptionPane;

public class Days {

	public static final int DAYS_IN_APRIL_JUNE_SEPT_NOV = 30;
	public static final int DAYS_IN_FEBRUARY_NORMALLY = 28;
	public static final int DAYS_IN_FEBRUARY_IN_LEAP_YEAR = 29;
	public static final int DAYS_IN_MOST_MONTHS = 31;
	public static final int NUMBER_OF_MONTHS = 12;	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try
		{
			String input = JOptionPane.showInputDialog("Please inut the date month and year in the format 'dd/m/yyyy'");
			Scanner scanner = new Scanner( input );
			scanner.useDelimiter("/");
			int day = scanner.nextInt();
			int month = scanner.nextInt();
			int year = scanner.nextInt();

			if (validDate( day, month, year))
			{
				int usedYearFigure = year;
				if((month==1) || (month == 2)){
					usedYearFigure = year - 1;
				}
				int firstTwoYearDigits = usedYearFigure/100;
				int lastTwoYearDigits = usedYearFigure%100;
				double w = (day + Math.floor(2.6 * (((month + 9) % 12) + 1) - 0.2) + lastTwoYearDigits
						+ Math.floor(lastTwoYearDigits/4) + Math.floor(firstTwoYearDigits/4) - 2*firstTwoYearDigits)%7;
				//w = (day + floor(2.6 * (((month + 9) % 12) + 1) - 0.2) + y + floor(y/4) + floor(c/4) - 2c) mod 7
				int daysNumber = (int) w;
				if (daysNumber<0)
					daysNumber = daysNumber + 7;
				JOptionPane.showMessageDialog(null, dayString(daysNumber) + ", " + day + dayEndings(day) + " " + monthString(month) + " " + year);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "" + day + "/" + month + "/" + year + " is not a valid date.",
						"Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		catch (NullPointerException exception)
		{
		}
		catch (java.util.NoSuchElementException exception)
		{
			JOptionPane.showMessageDialog(null, "No valid numbers entered.",
					"Error", JOptionPane.ERROR_MESSAGE);
		}

	}
	//validDates, DaysInMonth and isLeapYear code taken from Kens notes on Blackboard.
	public static boolean validDate( int day, int month, int year)
	{
		return ((year >= 0) && (month >= 1) && (month <= NUMBER_OF_MONTHS) &&
				(day >= 1) && (day <= daysInMonth( month, year )));
	}
	public static String dayEndings( int day)
	{
		switch (day)
		{
		case 1:
		case 21:
		case 31:
			return "st";
		case 2:
		case 22:
			return "nd";
		case 3:
		case 23:
			return "rd";
		default:
			return "th";
		}
	}
	public static int daysInMonth( int month, int year )
	{
		int numberOfDaysInMonth = DAYS_IN_MOST_MONTHS;
		switch (month)
		{
		case 2:
			numberOfDaysInMonth = isLeapYear( year ) ? DAYS_IN_FEBRUARY_IN_LEAP_YEAR :
				DAYS_IN_FEBRUARY_NORMALLY;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numberOfDaysInMonth = DAYS_IN_APRIL_JUNE_SEPT_NOV;
			break;
		default:
			numberOfDaysInMonth = DAYS_IN_MOST_MONTHS;
			break;
		}
		return numberOfDaysInMonth;
	}	
	public static boolean isLeapYear( int year )
	{
		return (((year%4 == 0) && (year%100 != 0)) || (year%400 == 0));
	}
	public static String dayString (int daysNumber)
	{
		switch(daysNumber)
		{
		case 0: return "Sunday";
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Wednesday";
		case 4: return  "Thursday";
		case 5: return "Friday";
		case 6: return "Saturday";
		
		}
		return null;
	}
	public static String monthString (int month)
	{
		switch(month)
		{
		case 1: return "January";
		case 2: return "Febuary";
		case 3: return "March";
		case 4: return "April";
		case 5: return "May";
		case 6: return "June";
		case 7: return "July";
		case 8: return "August";
		case 9: return "September";
		case 10: return "October";
		case 11: return "November";
		case 12: return "December";
		}
		return null;
	}
}	