package cs321_Project2;

import java.util.ArrayList;

class SubTournament extends Tournament{
	
	public TournamentArchetype archetype;
	ArrayList<Match> matches = new ArrayList<Match>();
	Fighter fighter1;
	Fighter fighter2;
	
	public void DetermineWinner(ArrayList<SubTournament> subT) {
		winners.add(PlayMatch(fighter1, fighter2));
		System.out.println("The winner is " + PlayMatch(fighter1, fighter2).Name + " !");
	}
}