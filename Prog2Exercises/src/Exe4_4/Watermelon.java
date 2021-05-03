package Exe4_4;

public class Watermelon extends Fruits{

	private String colour, type;
	private char seedless;
	
	public Watermelon(String n, String t, String c, char s){ //constructor with 3 arguments
		super(n);
		type=t;
		colour=c;
		seedless=s;
		
		System.out.println("\nFruits\t\t: " + name);
		switch(type) {
		case "King of Hearts":
			System.out.println(Profile());
			break;
		case "Amarillo":
			System.out.println(Profile('Y'));
			break;
		case "Black Diamond":
			System.out.println(Profile('Y', "Red"));
			break;
		}
	}
	
	public String Profile() {
		return "Type\t\t: " + type + "\nSeedless\t: " + seedless + "\nColour\t\t: " + colour;
	}
	
	public String Profile(char s) {
		return "Type\t\t: " + type + "\nSeedless\t: " + s + "\nColour\t\t: " + colour;
	}
	
	public String Profile(char s, String c) {
		return "Type\t\t: " + type + "\nSeedless\t: " + s + "\nColour\t\t: " + c;
	}
	
	public String printBenefit() { //overriding method
		return "Watermelon can help us hydrate because it has 92% of high water content.\n";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}
}
