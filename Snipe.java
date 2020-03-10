package cs321_Project2;

public class Snipe {
boolean beakIsLong;
boolean bodyIsFat;
boolean longDistanceFlier;
boolean conservativeGenes;
int age;
boolean isAlive;
int energy;

float GetFoodChance(Snipe x){
	float sum = 50;
	if(x.beakIsLong == true)
		sum += 10;
	else
		sum -= 10;
	if(x.longDistanceFlier == true)
		sum += 20;
	else
		sum -= 10;
	return sum;
}
float GetSurvivalChance(Snipe x){
	float sum = 50;
	if(x.beakIsLong == true)
		sum -= 5;
	else
		sum += 5;
	if(x.bodyIsFat == true)
		sum -= 10;
	else
		sum += 10;
	if(x.longDistanceFlier == true)
		sum -= 10;
	else
		sum += 20;
	return sum;
}
Snipe GenerateOffspring(Snipe y, Snipe z)
{
	Snipe x = new Snipe();
	int syg = 0, szg = 0;
	if (y.conservativeGenes == true)
		syg = 100;
	else
		syg = 25;
	if (z.conservativeGenes == true)
		szg = 100;
	else
		szg = 25;
	if(syg == 100 || syg > 25 && szg != 100)
		x.beakIsLong = y.beakIsLong;
	else
		x.beakIsLong = z.beakIsLong;
	if(szg == 100 || szg > 25 && syg != 100)
		x.bodyIsFat = z.bodyIsFat;
	else
		x.bodyIsFat = y.bodyIsFat;
	if(syg == 100 || syg > 25 && szg != 100)
		x.longDistanceFlier = y.longDistanceFlier;
	else
		x.longDistanceFlier = z.longDistanceFlier;
	if(syg == 100 || syg > 25 && szg != 100)
		x.conservativeGenes = y.conservativeGenes;
	else
		x.conservativeGenes = z.conservativeGenes;
	
	return x;
}
void LoseEnergy(Snipe x)
{
	System.out.println("This sure does work. This snipe has " + x.energy + " energy left");
}
}
