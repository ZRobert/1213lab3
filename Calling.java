//Robert Payne
//L02
//5/24/2012

import java.util.Scanner;

class Calling
{
	public static void main(String[] args)
	{
		//initialize keyboard input
		Scanner keyboard = new Scanner (System.in);
		//variable declarations
		String name;
		String address;
		String city;
		String state;
		String zip;
		char firstInitial;
		//prompts the user for their name, address, city, state, and zip
		System.out.print("Enter your name: ");
		name = keyboard.nextLine();
		System.out.print("Enter your address: ");
		address = keyboard.nextLine();
		System.out.print("Enter your city: ");
		city = keyboard.nextLine();
		System.out.print("Enter your state: ");
		state = keyboard.nextLine();
		System.out.print("Enter your zip code: ");
		zip = keyboard.nextLine();
		//outputs name, address, city, state, and zip in letter format
		System.out.println(name);
		System.out.println(address);
		System.out.println(city + ", " + state + " " + zip);
		//Takes the first letter and stores it in firstInitial
		firstInitial = name.charAt(0);
		//outputs first initial
		System.out.println("First Initial: " + firstInitial);
		//stores upper case version of name into name
		name = name.toUpperCase();
		//outputs the contents of name and the length
		System.out.println("Name: " + name + "\nLength of Name: " + name.length());
		
	}//Asks the user for their name, address, and outputs it.
}
		
		