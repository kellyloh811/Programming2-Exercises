package Exe4_2;

public class GrannySmith extends Apple{

	private String colour, placeoforigin;
	
	public GrannySmith() {
		super();
		colour=" ";
		placeoforigin=" ";
	}
	
	public GrannySmith(String n, int p, int q, String c, String place){
		super(n,p,q);
		colour=c;
		placeoforigin=place;
	}
	
	public String getColour() {
		return colour;
	}
	
	public String getPlaceOfOrigin() {
		return placeoforigin;
	}
	
	public String toString() {
		return super.toString() + "\nColour\t\t: " + getColour() + "\nPlace of origin\t: " + getPlaceOfOrigin();
	}
}
