package Exe4_1;

public class Envy extends Apple{

	private char size;
	private String colour,nutrients;
	
	Envy(String name, int p, int q, char s, String c, String n){
		super(name,p,q);
		this.colour=c;
		this.size=s;
		this.nutrients=n;
	}
	
	public String toString() {
		return super.toString() + "\nColour\t\t: " + colour + "\nSize\t\t: " + size + "\nNutrients\t: "+ nutrients;
	}
	
}
