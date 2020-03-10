package cs321_Project2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Creates a Weapon object for the Fighter class
 * @author Nicklas Pinkston
 * @version 1.2
 * @since 2020-03-08
 */
public class WeaponFactory {
	private static Map<String, Integer> atkRatings = new HashMap<String, Integer>();
	private static Map<String, Integer> defRatings = new HashMap<String, Integer>();
	
	private WeaponArchetype weaponArchetype;
	private static ArrayList<String> weaponList = new ArrayList<String>();
	
	/**
	 * Creates the ratings used to assign Weapons values. Only called once during runtime
	 */
	private static void CreateRatings() {
		//set weapon list
		weaponList.add("Halberd");
		weaponList.add("Lance");
		weaponList.add("Two-handed sword");
		weaponList.add("Staff");
		weaponList.add("Hand-and-a-half sword");
		weaponList.add("Rapier");
		weaponList.add("Dagger");
		weaponList.add("Cestus");
		weaponList.add("Gladius");
		
		//set attack ratings
		//long weapons
		atkRatings.put(weaponList.get(0), 3);
		atkRatings.put(weaponList.get(1), 1);
		atkRatings.put(weaponList.get(2), 2);
		//medium weapons
		atkRatings.put(weaponList.get(3), 1);
		atkRatings.put(weaponList.get(4), 3);
		atkRatings.put(weaponList.get(5), 3);
		//short weapons
		atkRatings.put(weaponList.get(6), 4);
		atkRatings.put(weaponList.get(7), 5);
		atkRatings.put(weaponList.get(8), 3);
				
		//set defense ratings
		//long weapons
		defRatings.put(weaponList.get(0), 0);
		defRatings.put(weaponList.get(1), 2);
		defRatings.put(weaponList.get(2), 2);
		//medium weapons
		defRatings.put(weaponList.get(3), 3);
		defRatings.put(weaponList.get(4), 2);
		defRatings.put(weaponList.get(5), 1);
		//short weapons
		defRatings.put(weaponList.get(6), 1);
		defRatings.put(weaponList.get(7), 0);
		defRatings.put(weaponList.get(8), 3);
	}
	
	/**
	 * Creates the Weapon Factory based on the Tournament Archetype
	 * @param tournamentArchetype The Archetype of the given Tournament
	 */
	public WeaponFactory(TournamentArchetype tournamentArchetype) {
		if (weaponList.isEmpty()) { CreateRatings(); } //if the ratings haven't been created then make it
		weaponArchetype = tournamentArchetype.getWeaponArchetype(tournamentArchetype); //and set the archetype
	}
	
	/**
	 * Creates the actual Weapon object for the user
	 * @return A Weapon based on the Factory's WeaponArchetype setting
	 */
	public Weapon MakeWeapon() {
		Weapon weapon = new Weapon();
		String weaponName = getWeaponName(); //get the name of a weapon to make
		
		weapon.archetype = weaponArchetype;
		weapon.attackRating = atkRatings.get(weaponName);
		weapon.defenseRating = defRatings.get(weaponName);
		weapon.name = weaponName;
		return weapon;
	}
	
	/**
	 * Gets the Weapon name based on randomness
	 * @return A String for the Weapon name
	 */
	private String getWeaponName() {
		//randomly generate a weapon based on archetype
		Random random = new Random();
		int randWeapon = random.nextInt(3);
		
		if(weaponArchetype == null) { //wild card scenario
			int i = random.nextInt(3);
			switch (i) {
			case 0:
				weaponArchetype = WeaponArchetype.LONG;
				break;
			case 1:
				weaponArchetype = WeaponArchetype.MEDIUM;
				break;
			case 2:
				weaponArchetype = WeaponArchetype.SHORT;
				break;
			}
		}
		
		//generate a random number to get a name from
		switch(weaponArchetype) {
		case LONG:
			randWeapon += 0; //add zero to get the long weapons
			break;
		case MEDIUM:
			randWeapon += 3; //add three to get the medium weapons
			break;
		case SHORT:
			randWeapon += 6; //add six to get to the short weapons
			break;
		}
		
		return weaponList.get(randWeapon); //return the result
	}
}