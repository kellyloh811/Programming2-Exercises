package Exe4_2;

public class Watermelon extends Fruits{

	private String colour;
	private char seedless;
	
	public Watermelon() { //constructor without argument
		super();
		colour=" ";
		seedless=' ';
	}
	
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
	
	public String toString() {
		return super.toString() + "\nColour\t\t: " + getColour() + "\nSeedless\t: " + getSeedless();
	}
}
