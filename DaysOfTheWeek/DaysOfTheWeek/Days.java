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
				JOptionPane.showMessageDialog(null, "" + day + "/" + month + "/" + year + " is a valid date.");
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
				if (daysNumber<0){
					daysNumber = daysNumber + 7;
					
				}
				String dayString = "";
				switch(daysNumber)
				{
				case 0: dayString = "Sunday";
				break;
				case 1: dayString = "Monday";
				break;
				case 2: dayString = "Tuesday";
				break;
				case 3: dayString = "Wednesday";
				break;
				case 4: dayString = "Thursday";
				break;
				case 5: dayString = "Friday";
				break;
				case 6: dayString = "Saturday";
				break;
				}
				String monthString = "";
				switch (month)
				{
				case 1: monthString = "January";
				break;
				case 2: monthString = "Febuary";
				break;
				case 3: monthString = "March";
				break;
				case 4: monthString = "April";
				break;
				case 5: monthString = "May";
				break;
				case 6: monthString = "June";
				break;
				case 7: monthString = "July";
				break;
				case 8: monthString = "August";
				break;
				case 9: monthString = "September";
				break;
				case 10: monthString = "October";
				break;
				case 11: monthString = "November";
				break;
				case 12: monthString = "December";
				break;
				
				}
				JOptionPane.showMessageDialog(null, dayString + ", " + day + + " " + monthString + " " + year);
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
	//Valid Dates, DaysInMonth and isLeapYear code taken from Kens notes on Blackboard.
	
	public static boolean validDate( int day, int month, int year)
	{
		return ((year >= 0) && (month >= 1) && (month <= NUMBER_OF_MONTHS) &&
				(day >= 1) && (day <= daysInMonth( month, year )));
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
}