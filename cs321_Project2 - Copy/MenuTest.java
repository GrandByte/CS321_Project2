package cs321_Project2;

/**
 * The Menu Unit Testing Program
 * @author Dalton Cook
 * @version 1.3
 * @since 2020-03-10
 */

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class MenuTest {

	
	/**
 	* A testing function for ReadDeathReport
	* Verifies that the DeathReports strings aren't modified within the function 
 	*/
	@Test
	public void ReadDeathReportTest() {
		Menu testrun = new Menu();
		

		List<String> help =  new ArrayList<String>(3);
		testrun.DeathReports = help;
		testrun.DeathReports.add("15 Predatory");
		testrun.DeathReports.add("37 Starvation");
		testrun.ReadDeathReport();
		assertEquals(testrun.DeathReports.get(0), "15 Predatory");
		assertEquals(testrun.DeathReports.get(1), "37 Starvation");
	}

}
