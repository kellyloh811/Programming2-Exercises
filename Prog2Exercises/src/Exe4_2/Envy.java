package Exe4_2;

public class Envy extends Apple{

	private char size;
	private String colour,nutrients;
	
	public Envy() {
		super();
		colour=" ";
		size=' ';
		nutrients=" ";
	}
	
	public Envy(String n, int p, int q, char s, String c, String nt){
		super(n,p,q);
		colour=c;
		size=s;
		nutrients=nt;
	}
	
	public char getSize() {
		return size;
	}
	
	public String getColour() {
		return colour;
	}
	
	public String getNutrients() {
		return nutrients;
	}
	
	public String toString() {
		return super.toString() + "\nColour\t\t: " + getColour() + "\nSize\t\t: " + getSize() + "\nNutrients\t: "+ getNutrients();
	}
}
