package cs321_Project2;

/**
 * The main file for the program 
 * @author Nicklas Pinkston
 * @version 1.1
 * @since 2020-03-09
 */
public class CS321_Project2 {
	public static void main(String[] args) {
		System.out.println("Lodaing Menu...");
		
		Menu menu = new Menu();
		menu.RunTournament();
		
		System.out.println("Goodbye!");
	}
}