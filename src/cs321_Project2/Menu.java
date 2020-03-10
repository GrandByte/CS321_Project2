package cs321_Project2;

import java.util.Scanner;

/**
 * Handles Menu functions and creates the Tournament
 * @author Nicklas Pinkston
 * @version 1.1
 * @since 2020-03-09
 */
public class Menu {
	private int entrants;
	private Scanner s = new Scanner(System.in);
	
	/**
	 * Creates the Menu object and Readies the Tournament
	 */
	public Menu() {
		System.out.println("Welcome to the Tournament of Champions!");
		entrants = EnterFighterCount();
		System.out.println("Excellent! Onward to the tournament!");
		RunTournament();
	}
	
	/**
	 * Creates the Tournament object and then throws control to it
	 */
	public void RunTournament() {
		Tournament tournament = new Tournament(entrants);
		tournament.InitializeTournament();
	}
	
	/**
	 * Obtains and sanitizes the fighter count from the user
	 * @return A power of two between 4 and 512 for the number of total fighters in the tournament
	 */
	private int EnterFighterCount() {
		System.out.print("Please enter the total number of fighters: ");
		int i = s.nextInt();
		
		//dirty but who cares
		if (i != 4 && i != 8 && i != 16 && i != 32 && i != 64 && i != 128 && i != 256 && i != 512) {
			System.out.println("Sorry! The number of fighters must be a power of two! Try again!");
			return EnterFighterCount();
		}
		else return i;
	}
}