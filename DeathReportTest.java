package cs321_Project2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DeathReportTest {
	
	@Test
	public void DeathReportTest() {
		DeathReport deathReport = new DeathReport();
		deathReport.year = 5;
		deathReport.age = 3;
		deathReport.cause = CauseOfDeath.STARVATION;
		
		assertEquals(deathReport.year, 5);
		assertEquals(deathReport.age, 3);
		assertEquals(deathReport.cause, CauseOfDeath.STARVATION);
		
		DeathReport deathReport2 = new DeathReport();
		deathReport2.year = 12;
		deathReport2.age = 10;
		deathReport2.cause = CauseOfDeath.PREDATION;
		
		assertEquals(deathReport2.year, 12);
		assertEquals(deathReport2.age, 10);
		assertEquals(deathReport2.cause, CauseOfDeath.PREDATION);
	}
}