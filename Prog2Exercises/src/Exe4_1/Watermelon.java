package Exe4_1;

public class Watermelon extends Fruits{

	private String colour;
	private char seedless;
	
	Watermelon(String name, String c, char s){
		super(name);
		this.colour=c;
		this.seedless=s;
		
	}
	
	public String toString() {
		return super.toString() + "\nColour\t\t: " + colour + "\nSeedless\t: " + seedless;
	}
}
