// @author Felix Thomas
// CS 309 Project 2
// 03/09/2020
package cs321_Project2;

import java.util.ArrayList;
import java.util.Random;

public class tournament {
	
	ArrayList<subTournament> subTournaments = new ArrayList<subTournament>();
	ArrayList<Fighter> winners = new ArrayList<Fighter>();
	ArrayList<Fighter> fighters = new ArrayList<Fighter>();
	String[] names = new String[] {"Anlow", "Arando", "Bram", "Cale", "Dalkon", "Daylen", "Dodd", "Dungarth", "Dyrk", "Eandro", "Falken", "Feck", "Fenton", 
			"Gryphero", "Hagar", "Jeras", "Krynt", "Lavant", "Leyten", "Madian", "Malfier", "Markus", "Meklan", "Namen", "Navaren", "Nerle", "Nilus", "Ningyan", "Norris", "Quentin", 
			"Semil", "Sevenson", "Steveren", "Talfen", "Tamond", "Taran", "Tavon", "Tegan", "Vanan", "Vincent", "Azura", "Brey", "Hallan", "Kasaki", "Lorelei", "Mirabel", "Pharana", 
			"Remora", "Rosalyn", "Sachil", "Saidi", "Tanika", "Tura", "Tylsa", "Vencia", "Xandrilla", "Andujar", "Armagan", "Armek", "Arzan", "Axaran", "Belaxarim", "Brevarr", "Djemidor", 
			"Draxan", "Fayal", "Grax", "Iojad", "Inzul", "Khiraj", "Kreytzen", "Lejek", "Mar", "Nazir", "Nedam", "Nevek", "Ravaran", "Razaan", "Sarax", "Sarram", "Savaxis", "Siangar", "Sirizan", 
			"Sunan", "Szuran", "Tajan", "Tamajon", "Tenahn", "Toxal", "Tzegyr", "Vantajar", "Vharkus", "Xafiq", "Zarkhil", "Artana", "Kalas", "Khagra", "Leytra", "Myrka", "Naya", "Sarcha", "Shirren", 
			"Sirivistra", "Sufana", "Tamara", "Vrumadi", "Zovra", "Agaro", "Arnan", "Auxlan", "Avamir", "Baelnar", "Balfam", "Bariken", "Borkûl", "Darkûl", "Dolmen", "Dyrnar", "Erag", "Ezegan", 
			"Ferrek", "Garmûl", "Glint", "Ghorvas", "Grimmalk", "Haeltar", "Halagmar", "Halzar", "Hlant", "Korlag", "Krag", "Krim", "Kurman", "Lurtrum", "Malagar", "Mardam", "Maulnar", "Melgar", 
			"Morak", "Orobok", "Rogath", "Roken", "Rozag", "Sabakzar", "Sharak", "Smethykk", "Swargar", "Thorbalt", "Thorin", "Tredigar", "Vabûl", "Vistrum", "Wolvar", "Beyla", "Fenryl", 
			"Grenenzel", "Krystolari", "Lokara", "Lurka", "Marnia", "Praxana", "Rokel", "Roksana", "Thurlfara", "Vauldra", "Veklani", "Vronwe", "Zebel", "Arthan", "Carvin", "Corby", 
			"Cullen", "Egen", "Ernest", "Gedi", "Heron", "Jeryl", "Keffen", "Kylem", "Kynt", "Leskyn", "Neff", "Orne", "Quarrel", "Rabbit", "Rilkin", "Snakebait", "Tarfen", "Titch", "Tuck", "Whim", 
			"Caliope", "Emily", "Piper", "Rixi", "Sabretha", "Teg", "Tilly", "Toira", "Vexia", "Vil", "Vzani", "Zanthe", "Ziza", "Ankhus", "Arkadi", "Armarius", "Armillius", "Archidius", 
			"Balmoloch", "Calderax", "Cavian", "Cenereth", "Chorum", "Corynax", "Dacian", "Daelius", "Damaceus", "Decimeth", "Demedor", "Demerian", "Dynachus", "Grassus", "Halius", 
			"Heleph", "Incirion", "Kalaradian", "Kamien", "Kazimir", "Kzandro", "Machem", "Maetheus", "Malfias", "Marchion", "Menerus", "Namazeus", "Nensis", "Prismeus", "Pyranikus", 
			"Razortail", "Sejanus", "Severian", "Suffer", "Syken", "Tarkus", "Vaius", "Xerek", "Zeth", "Zevon", "Affyria", "Cataclysmia", "Domitia", "Dorethau", "Excellence", "Hacari", 
			"Iritra", "Lachira", "Levatra", "Mecretia", "Milvia", "Nericia", "Precious", "Rain", "Samantia", "Sunshine", "Tenerife", "Traya", "Velavia", "Zaidi", "Zethaya"};
	
	public void InitializaTournament(int numFighters) {
		if (winners.isEmpty() == true) {
			for (int i = 0; i == numFighters; i++) {
				Fighter temp = new Fighter();
				Random rnd = new Random();
				temp.name = names[rnd.nextInt(names.length)];
				temp.strength = (rnd.nextInt(10) + 1);
				temp.reach = (rnd.nextInt(10) + 1);
				temp.speed = (rnd.nextInt(10) + 1);
				temp.weapon = MakeWeapon();
				fighters.add(temp);
			}
			for (int i = 0; i == numFighters/2; i = i+2) {
				subTournaments[i].fighter1 = fighters[i];
				subTournaments[i].fighter2 = fighters[i+1];
			}
		}
		else {
			for (int i = 0; i == winners.length; i = 1+2) {
				subTournaments[i].fighter1 = winners[i];
				subTournaments[i].fighter2 = winners[i+1]
			}
		}
	}
	
	private void DetermineWinner(ArrayList<subTournament> subTournaments) {
		for (int i = 0; i < subTounaments.length; i++) { 
			subTournament.DetermineWinner(subTournaments[i]);
		}
	}
}

class subTournament extends tournament{
	
	public TournamentArchetype archetype;
	ArrayList<Match> matches = new ArrayList<Match>();
	Fighter fighter1;
	Fighter fighter2;
	
	public void DetermineWinner(ArrayList<subTournament> subT) {
		winners.add(PlayMatch(fighter1, fighter2));
		System.out.println("The winner is " + PlayMatch(fighter1, fighter2).name + " !");
	}
}
