package Exe4_1;

public class GrannySmith extends Apple{

	private String colour, placeoforigin;
	
	GrannySmith(String name, int p, int q, String c, String place){
		super(name,p,q);
		this.colour=c;
		this.placeoforigin=place;
	}
	
	public String toString() {
		return super.toString() + "\nColour\t\t: " + colour + "\nPlace of origin\t: " + placeoforigin;
	}
}
