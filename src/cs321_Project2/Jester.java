package cs321_Project2;

import java.lang.Integer;

public class Jester {	
	String winbet;
	
	void CommentOnStart(Fighter F1, Fighter F2)
	{
		if((Integer.compare(F1.strength, F2.strength)+ Integer.compare(F1.reach, F2.reach) + Integer.compare(F1.speed, F2.speed)) > 0)
		{
			System.out.println("Alright folks! It looks like this match is going to be a doozy. "
					+ "I think we're gonna see " + F1.name + " Take home a win for today, with their");
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
			winbet = F1.name;
		}
		else if((Integer.compare(F1.strength, F2.strength)+ Integer.compare(F1.reach, F2.reach) + Integer.compare(F1.speed, F2.speed)) < 0)
		{
			System.out.println("Alright folks! It looks like this match is going to be a doozy. "
					+ "I think we're gonna see " + F2.name + " Take home a win for today, with their");
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
			winbet = F2.name;
		}
	}
	void CommentOnMiddle(Fighter F)
	{
		System.out.println("Wow! " + F.name + " is looking rough, seems like they're already halfway in their grave!");
	}
	void CommentOnEnd(Fighter winner)
	{
		if (winner.name == winbet)
		{
			System.out.println("How about that, " + winner.name + "won! Looks like these eyes are still as sharp as my wit.");
		}
		else
		{
			System.out.println("Well, that's certainly a surprise. It looks like " + winner.name + " is the victor, against all odds! Everyone loves an underdog story, don't they?");
		}
	}
		
}
