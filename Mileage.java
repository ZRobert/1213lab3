//Robert Payne
//L02
//5/24/2012

import java.util.Scanner;

class Mileage
{
	public static void main(String[] args)
	{
		//initialize keyboard input
		Scanner keyboard = new Scanner (System.in);
		//variable declarations
		double milesDriven;
		double gallonsUsed;
		double mpg;
		//user data entry
		System.out.print("Enter miles driven: ");
		milesDriven = keyboard.nextDouble();
		System.out.print("Enter gallons used: ");
		gallonsUsed = keyboard.nextDouble();
		//processing MPG
		mpg = milesDriven / gallonsUsed;
		//output MPG
		System.out.println("Miles per gallon: " + mpg);
	}//Calculates and displays Miles per Gallon
}
/*
Task 4 answers:
1. 20.0
2. 19.607843137254903
3. 24.15
4. Infinity
*/