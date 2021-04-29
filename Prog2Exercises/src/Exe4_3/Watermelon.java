package Exe4_3;

public class Watermelon extends Fruits{

	private String colour;
	private char seedless;
	
	public Watermelon(String n, String c, char s){ //constructor with 3 arguments
		super(n);
		colour=c;
		seedless=s;
	}
	
	public String getColour() {
		return colour;
	}
	
	public char getSeedless() {
		return seedless;
	}
	
	public int TotalMass() { //overloading without parameter
		return 700;
	}
	
	public int TotalMass(int q) { //overloading with 1 parameter
		return 700*q;
	}
	
	public int TotalMass(int q, int m) { //overloading with 2 parameters
		return q*m;
	}
	
	public String printBenefit() { //overriding method
		return "Watermelon can help us hydrate because it has 92% of high water content.";
	}
	
	public String toString() { //overriding method
		return super.toString() + "\nColour\t\t: " + getColour() + "\nSeedless\t: " + getSeedless() + "\nTotal Mass\t: " + TotalMass() + " grams" + "\nTotal Mass\t: " + TotalMass(3) + " grams" + "\nTotal Mass\t: " + TotalMass(4, 700) + " grams" + "\n" + printBenefit();
	}
}
