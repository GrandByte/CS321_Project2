package cs321_Project2;

/**
 * The Jester enum
 * @author Dalton Cook
 * @version 1.4
 * @since 2020-03-08
 */
import java.lang.Integer;

public class Jester {	
	String winbet; //Initializes 
  	
	/**
	*Takes two fighter arguments, and prints out appropriate predictions based on a series of comparisons.
	*Also saves the name of the predicted fighter as a string to be used later. 
	*/
	void CommentOnStart(Fighter F1, Fighter F2)
	{
		if((Integer.compare(F1.strength, F2.strength)+ Integer.compare(F1.reach, F2.reach) + Integer.compare(F1.speed, F2.speed)) > 0)
		{
			System.out.println("Alright folks! It looks like this match is going to be a doozy. "
					+ "I think we're gonna see " + F1.Name + " Take home a win for today, with their");
			if(Integer.compare(F1.strength, F2.strength) > 0)
			{
				System.out.println("Mighty Strength,");
			}
			if(Integer.compare(F1.reach, F2.reach) > 0)
			{
				System.out.println("Incredible Reach,");
			}
			if(Integer.compare(F1.speed, F2.speed) > 0)
			{
				System.out.println("Astonishing Speed,");
			}
			System.out.println("and Charming Smile! Good luck and good fight everyone!");
			winbet = F1.Name;
		}
		else if((Integer.compare(F1.strength, F2.strength)+ Integer.compare(F1.reach, F2.reach) + Integer.compare(F1.speed, F2.speed)) < 0)
		{
			System.out.println("Alright folks! It looks like this match is going to be a doozy. "
					+ "I think we're gonna see " + F2.Name + " Take home a win for today, with their");
			if(Integer.compare(F1.strength, F2.strength) < 0)
			{
				System.out.println("Mighty Strength,");
			}
			if(Integer.compare(F1.reach, F2.reach) < 0)
			{
				System.out.println("Incredible Reach,");
			}
			if(Integer.compare(F1.speed, F2.speed) < 0)
			{
				System.out.println("Astonishing Speed,");
			}
			System.out.println("and Charming Smile! Good luck and good fight everyone!");
			winbet = F2.Name;
		}
	}
	
	/**
	*Takes one fighter argument, and prints out an announcement of said fighter's health passing the threshold of 5 damage. 
	*/
	void CommentOnMiddle(Fighter F)
	{
		System.out.println("Wow! " + F.Name + " is looking rough, seems like they're already halfway in their grave!");
	}
	/**
	*Takes one fighter argument, and prints out a reactionary statement after a comparison to check if the winner of the match was the previously predicted victor.
	*/
	void CommentOnEnd(Fighter winner)
	{
		if (winner.Name == winbet)
		{
			System.out.println("How about that, " + winner.Name + "won! Looks like these eyes are still as sharp as my wit.");
		}
		else
		{
			System.out.println("Well, that's certainly a surprise. It looks like " + winner.Name + " is the victor, against all odds! Everyone loves an underdog story, don't they?");
		}
	}
		
}
