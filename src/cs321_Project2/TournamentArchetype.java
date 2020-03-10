package cs321_Project2;

/**
 * The Tournament Archetype enum with an added conversion between Weapon Archetype
 * @author Nicklas Pinkston
 * @version 1.2
 * @since 2020-03-06
 */
public enum TournamentArchetype {
	LONG, MEDIUM, SHORT, WILD;
	
	/**
	 * Converts a Tournament Archetype into a Weapon Archetype
	 * @param tournamentArchetype The Tournament Archetype enum to convert
	 * @return Either Long, Medium, or Short if the Tournament Archetype is that, or null if it is Wild Card
	 */
	public WeaponArchetype getWeaponArchetype(TournamentArchetype tournamentArchetype) {
		WeaponArchetype returnValue;
		switch(tournamentArchetype) {
		case LONG:
			returnValue =  WeaponArchetype.LONG;
			break;
		case MEDIUM:
			returnValue =  WeaponArchetype.MEDIUM;
			break;
		case SHORT:
			returnValue =  WeaponArchetype.SHORT;
			break;
		default: //assumes wild card scenario
			returnValue =  null;
		}
		return returnValue;
	}
};