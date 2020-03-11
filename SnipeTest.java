package cs321_Project2;

/**
 * The Snipe Unit Testing Program
 * @author Dalton Cook
 * @version 1.3
 * @since 2020-03-10
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SnipeTest {

	/*
	boolean beakIsLong;
	boolean bodyIsFat;
	boolean longDistanceFlier;
	boolean conservativeGenes;
	int age;
	boolean isAlive;
	int energy;
	*/

	
	/**
	 * Used to initialize the first Snipe class to be tested
	 */

	public Snipe beforeEach1(){
		Snipe sn4 = new Snipe();
		sn4.beakIsLong = true;
		sn4.conservativeGenes = true;
		sn4.bodyIsFat = true;
		sn4.longDistanceFlier = true;
		sn4.age = 1;
		sn4.isAlive = true;
		sn4.energy = 2;
		
		return sn4;
	}
	
	/**
	 * Used to initialize the second Snipe class to be tested
	 */
	public Snipe beforeEach2()
		{
		Snipe sn3 = new Snipe();
		sn3.beakIsLong = false;
		sn3.conservativeGenes = false;
		sn3.bodyIsFat = false;
		sn3.longDistanceFlier = false;
		sn3.age = 2;
		sn3.isAlive = false;
		sn3.energy = 2;
		return sn3;
	}
	
	Snipe sn1 = beforeEach1();
	Snipe sn2 = beforeEach2();
	
	/**
	 * Used to test the GetFoodChance function, to ensure the returned percentage was correct
	 */
	
	@Test
	public void foodTest() {
		float sum = sn1.GetFoodChance(sn1);
		System.out.println(sn1.beakIsLong);
		System.out.println(sn1.longDistanceFlier);
		System.out.println(sum);
		assertEquals(sum, 80.0, 0.1);
		
		sum = sn2.GetFoodChance(sn2);
		System.out.println(sum);
		assertEquals(30, sum, 0.1);		

		
		//fail("Not yet implemented");
	}
	
	/**
	 * Used to test the GetSurvivalChance function, to ensure the returned percentage was correct
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void surviveTest() {
		float sum = sn1.GetSurvivalChance(sn1);
		System.out.println(sum);
		assertEquals(sum, 25, 0.1);
		
		sum = sn2.GetSurvivalChance(sn2);
		assertEquals(sum, 85, 0.1);		
		
		//fail("Not yet implemented");
	}
	
	/**
	 * Used to test the GenerateOffspring function, to test how the function creates offspring with different parameters
	 */
	@Test
	public void geneTest() {
		Snipe x = new Snipe();
		x = sn1.GenerateOffspring(sn1, sn2);
		assertEquals(x.beakIsLong, sn1.beakIsLong);
		assertEquals(x.bodyIsFat, sn1.bodyIsFat);
		assertEquals(x.longDistanceFlier, sn1.longDistanceFlier);
		assertEquals(x.conservativeGenes, sn1.conservativeGenes);
		
		Snipe y = new Snipe();
		y = sn2.GenerateOffspring(sn2, sn1);
		assertEquals(y.beakIsLong, sn1.beakIsLong);
		assertEquals(y.bodyIsFat, sn1.bodyIsFat);
		assertEquals(y.longDistanceFlier, sn1.longDistanceFlier);
		assertEquals(y.conservativeGenes, sn1.conservativeGenes);
		
		
		//fail("Not yet implemented");
	}
}

