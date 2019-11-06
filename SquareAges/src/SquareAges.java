/* SELF ASSESSMENT 
   1. Did I use appropriate CONSTANTS instead of numbers within the code?  
       Mark out of 5: 5
       Comment: Started the program with constants for the maximum and minimum, age and year.
   2. Did I use easy-to-understand, meaningful CONSTANT names? 
       Mark out of 5: 5
       Comment: Made sure to say whether the were for year or age and whether they were the maximum or minimum value
   3. Did I format the CONSTANT names properly (in UPPERCASE)? 
       Mark out of 5: 5
       Comment: Yes. I did. Just for you.. and my grades.
   4. Did I use easy-to-understand meaningful variable names? 
       Mark out of 10: 10
       Comment: I think age and ageSquared are easy to understand. ageSquared could have been called year but that's not as easy to interpret
   5. Did I format the variable names properly (in lowerCamelCase)? 
       Mark out of 10: 10
       Comment: I did indeed.
   6. Did I indent the code appropriately? 
       Mark out of 10: 10
       Comment: To the best of my knowledge, yes.
   7. Did I use an appropriate for loop to test all possibilities?  There should be only one. 
       Mark out of 20:  20
       Comment: I used one For loop and that sufficed. My original code was muuch longer and required a while but a polished it to this.
   8. Did I correctly check if people alive today were or could be alive in a year that is the square of their age in that year. 
       Mark out of 30:  30
       Comment: There is only one year for that. The second two conditions in the IF statement are to make sure they aren't dead and if they're born yet.
   9. How well did I complete this self-assessment? 
       Mark out of 5: 5
       Comment: Perfectly. 
   Total Mark out of 100 (Add all the previous marks): 100
*/
public class SquareAges {
	
	public static final int MIN_AGE = 0;
	public static final int MAX_AGE = 123;
	public static final int MIN_YEAR = (2018-123);
	public static final int MAX_YEAR = (2018+123);
	
	public static void main(String args[]){
	
	for (int age =MIN_AGE; (age <= MAX_AGE); age++){
		int ageSquared = age*age;
		if ((ageSquared > MIN_YEAR) && (ageSquared < MAX_YEAR) &&
               (ageSquared - age > MIN_YEAR) && (ageSquared + age < MAX_YEAR)){
			System.out.println("In the year " + ageSquared + " somebody aged " + age + " will be the square of the year.");
			}
		}
	}
}
