
import java.util.Scanner;


public class HighScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		System.out.println("How many Scores do you want the scoreboard to keep displayed?");
		int arrayLengthGiven = input.nextInt();
		int[] highScores = new int[arrayLengthGiven];
		initialiseHighScores(highScores);

		boolean finished = false;
		while(!finished){
			System.out.println();
			System.out.println("Now enter a number to be inserted into the scoreboard!");
			int nextHighScore = input.nextInt();
			higherThan(highScores,nextHighScore);
			printHighScores(highScores);
		}
	}
	public static int[] initialiseHighScores(int[] highScores)
	{//initialiseHighScores () which sets all high scores to zero.
		if (highScores != null)
		{
			for (int index=0; index<highScores.length; index++)
				highScores[index]=0;
		} return highScores;
	}
	public static void printHighScores(int[] highScores)
	{//printHighScores() which prints the high scores in the format:
		//“The high scores are 345, 300, 234”, for all existing high scores in the list (remember that sometimes it won’t be full).
		System.out.print("The high scores are " + highScores[0]);
		for (int index = 1; index<highScores.length;index++)
		{
			System.out.print(", " + highScores[index]);
		}
	}
	public static void higherThan(int[] highScores,int nextHighScore )
	{//higherThan() which takes the high scores and a new score and
		//returns whether the passed score is higher than any of those in the high score list.
		for (int index = 0; index<highScores.length;index++)
		{
			if (nextHighScore > highScores[index])
				nextHighScore = insertScore(highScores, index, nextHighScore);
		}
	}
	public static int insertScore(int[] highScores, int index, int nextHighScore)
	{//insertScore() which takes the current high score list and a new score and 
		//updates it by inserting the new score at the appropriate position in the list
		int tempNumber = nextHighScore;
		nextHighScore = highScores[index];
		highScores[index] = tempNumber;
		return nextHighScore;
	}

}

