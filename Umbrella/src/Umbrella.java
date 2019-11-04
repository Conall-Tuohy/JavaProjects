/* SELF ASSESSMENT 
   1. Did I use easy-to-understand meaningful variable names? 
       Mark out of 10:10
       Comment: Used ifRaining and looksRainy which I felt were pretty self explanitory.
   2. Did I format the variable names properly (in lowerCamelCase)? 
       Mark out of 10: 10
       Comment: As mentioned previously,everything was said correctly.
   3. Did I indent the code appropriately? 
       Mark out of 10: 10
       Comment: As far as I know the if statements lined up with their brackets and I had one of the supervisors during the lab check it over and they approved.
   4. Did I read the input correctly from the user using appropriate questions? 
       Mark out of 20: 20
       Comment: Made sure to take into account what happened when closing the window as well.
   5. Did I use an appropriate (i.e. not more than necessary) series of if statements? 
       Mark out of 30: 30
       Comment: As far as I know this was the least amount of if statements I could have while feeling safe that nothing could go wrong. 
   6. Did I output the correct answer for each possibility in an easy to read format? 
       Mark out of 15: 15
       Comment: Rationally explained what to do in each outcome with some humour.
   7. How well did I complete this self-assessment? 
       Mark out of 5: 5
       Comment: May have been biased but I feel that I did well and learned a lot about JOptionPane and if statements with this project.
   Total Mark out of 100 (Add all the previous marks): 100
 */
import javax.swing.JOptionPane;


public class Umbrella {

	public static final int YES = 0;
	public static final int NO = 1;


	public static void main(String  args[]){
		//input
		int ifRaining = JOptionPane.showConfirmDialog(null, "Is it raining outside?", null, JOptionPane.YES_NO_OPTION);

		if (ifRaining == YES){
			JOptionPane.showMessageDialog(null, "Bring an umbrella and have it open or you'll probably get wet, unless you're a ninja.");
		} else if (ifRaining == NO){
			int looksRainy = JOptionPane.showConfirmDialog(null,"Does it look like it could rain?", null, JOptionPane.YES_NO_OPTION);
			if (looksRainy == YES){
				JOptionPane.showMessageDialog(null, "Bring an umbrella and have it closed, just in case it starts raining."); 

			} else if (looksRainy == NO){ 
				JOptionPane.showMessageDialog(null, "Don't bother bringing an umbrella, it's probably not going to rain."); 
			} else if (looksRainy == JOptionPane.CLOSED_OPTION){
				JOptionPane.showMessageDialog(null, "You closed it. Well done, I guess. Bye!!");
			}
		}
		
	}
}
