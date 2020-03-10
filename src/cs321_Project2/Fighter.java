/**
 * 
 */
package cs321_Project2;

import java.util.ArrayList;
import java.util.Random;
/**
 * @author tab0037
 *
 */
public class Fighter {
		int strength;
		int reach;
		int speed;
		Weapon weapon;
		String Name;
		
		// i dont know where to put the coin flip exactly but
		private int result;
		
		public Fighter() {} //jic
		
		public boolean StrongerThan(Fighter fighter1, Fighter fighter2)
		{// since there could be a TIE
		 // a tie breaker will be handled by checking SPEED first
			if(fighter1.strength == fighter2.strength)
			{ // tie case. so break the tie
				if(fighter1.speed == fighter2.speed) // after finishing this i realized i could just call upon the fasterthan bool function but. whatever.
				{//SPEED TIE. 50/50 flip like how Pokemon would handle speed ties
					Random randomNum = new Random();
					result = randomNum.nextInt(2);
					// 0 = heads; 1 = tails
					// heads -> 1 wins
					// tails -> 2 wins
					if(result == 0)
						return true;
					else
						return false;
				}
				else if(fighter1.speed > fighter2.speed)
				{ // fighter 1 is faster
					return true;
				}
				else // fighter 2 is faster
					return false;
			}
			else if (fighter1.strength > fighter2.strength)
			{ // Fighter 1 stronger than 2
				return true;
			}
			else
			{ // fighter 2 stronger than 1
				return false;
			}
			//TRUE = FIGHTER 1 GOT THE BUFF
			//FALSE = FIGHTER 2 GOT THE BUFF
		}
		
		public boolean LongerReachedThan(Fighter fighter1, Fighter fighter2)
		{// same structure as StrongerThan but regarding reach
				if(fighter1.reach == fighter2.reach)
				{ // tie case. so break the tie
					if(fighter1.weapon.archetype == fighter2.weapon.archetype) // after finishing this i realized i could just call upon the fasterthan bool function but. whatever.
					// this SHOULD check if the matchups are SS, MM, and LL for fighter 1 and 2 respectively right?
					// just in case ill add this alternative if statement within a comment
				  //if((fighter1.weapon.archetype.LONG & fighter2.weapon.archetype.LONG) | (fighter1.weapon.archetype.MEDIUM & fighter2.weapon.archetype.MEDIUM) | (fighter1.weapon.archetype.SHORT & fighter2.weapon.archetype.SHORT))	
					{//REACH TIE. 50/50 flip like how Pokemon would handle speed ties
						Random randomNum = new Random();
						result = randomNum.nextInt(2);
						// 0 = heads; 1 = tails
						// heads -> 1 wins
						// tails -> 2 wins
						if(result == 0)
							return true; // fighter 1 gets the buff
						else
							return false; // fighter 2 gets the buff
					}
					else if((fighter1.weapon.archetype == WeaponArchetype.LONG & fighter2.weapon.archetype == WeaponArchetype.MEDIUM) | (fighter1.weapon.archetype == WeaponArchetype.LONG & fighter2.weapon.archetype == WeaponArchetype.SHORT) | (fighter1.weapon.archetype == WeaponArchetype.MEDIUM & fighter2.weapon.archetype == WeaponArchetype.SHORT))
					{ // fighter 1 has longer weapon
						return true;
					}
				  //else if((fighter1.weapon.archetype.MEDIUM & fighter2.weapon.archetype.LONG) | (fighter1.weapon.archetype.SMALL & fighter2.weapon.archetype.LONG) | (fighter1.weapon.archetype.SHORT & fighter2.weapon.archetype.MEDIUM))
					  //return false;
					else // fighter 2 has longer weapon
						// THIS SHOULD BE A CATCH ALL FOR THE LAST THREE WEAPON SCENARIOS RIGHT?
						// those being ML, SL, SM for fighter 1 and 2 respectively? right?
						// please double check this guys
						// just in case, i typed out another else if statement for this case ABOVE this else statement. and if it reaches this statement itll just say whatever and give the buff to fighter 2
						return false;
				}
				else if (fighter1.reach > fighter2.reach)
				{ // Fighter 1 longer than 2
					return true;
				}
				else
				{ // fighter 2 longer than 1
					return false;
				}
				//TRUE = FIGHTER 1 GOT THE BUFF
				//FALSE = FIGHTER 2 GOT THE BUFF
		}
		
		public boolean FasterThan(Fighter fighter1, Fighter fighter2)
		{// ''
			if(fighter1.speed == fighter2.speed) // after finishing this i realized i could just call upon the fasterthan bool function but. whatever.
			{//SPEED TIE. 50/50 flip like how Pokemon would handle speed ties
				Random randomNum = new Random();
				result = randomNum.nextInt(2);
				// 0 = heads; 1 = tails
				// heads -> 1 wins
				// tails -> 2 wins
				if(result == 0)
					return true;
				else
					return false;
			}
			else if(fighter1.speed > fighter2.speed)
			{ // fighter 1 is faster
				return true;
			}
			else // fighter 2 is faster
				return false;
		}
		
		public int GetAttackPerformance(Fighter fighter)
		{
			int total = 0;
			int dieValue;
			Random randomNum = new Random();
			for(int i = 0; i < fighter.weapon.attackRating; i++)
			{
			dieValue = (randomNum.nextInt(6) + 1);
			total += dieValue;
			}
			return total;
		}
		
		public int GetDefensePerformance(Fighter fighter)
		{
			int total = 0;
			int dieValue;
			Random randomNum = new Random();
			for(int i = 0; i < fighter.weapon.defenseRating; i++)
			{
				dieValue = (randomNum.nextInt(6) + 1);
				total += dieValue;
			}
			return total;
		}
}


