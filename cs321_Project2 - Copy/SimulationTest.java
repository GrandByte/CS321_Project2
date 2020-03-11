package cs321_Project2;

import static org.junit.Assert.*;
import org.junit.Test;

public class SimulationTest {
	
	@Test
	public void DataTest() {
		Simulation simulation = new Simulation();
		simulation.numYears = 15;
		Environment env = new Environment();
		env.isPlentiful = true;
		env.isDangerous = true;
		simulation.env = env;
		
		assertEquals(simulation.env.isPlentiful, true);
		assertEquals(simulation.env.isDangerous, true);
		assertEquals(simulation.numYears, 15);
		
		Simulation simulation2 = new Simulation();
		simulation2.numYears = 25;
		Environment env2 = new Environment();
		env2.isPlentiful = false;
		env2.isDangerous = false;
		simulation2.env = env2;
		
		assertEquals(simulation.env.isPlentiful, true);
		assertEquals(simulation.env.isDangerous, true);
		assertEquals(simulation.numYears, 15);
	}
	
	@Test
	public void SummarizeDeathsTest() {
		Simulation simulation = new Simulation();
		simulation.numYears = 15;
		Environment env = new Environment();
		env.isPlentiful = true;
		env.isDangerous = true;
		simulation.env = env;
		simulation.RunNewSimulation();
		String deaths = simulation.SummarizeDeaths();
		
		assertNotNull("String deaths is empty!", deaths);
	}
}