package Exe4_3;

public class GrannySmithApple extends Apple {

private String colour;
	
	public GrannySmithApple(String n, int p, int q, String c){
		super(n,p,q);
		colour=c;
	}
	
	public String Details() { //overloading without parameter
		return "\nGranny Smith apples are " + colour + " in colour.";
	}
	
	public String Details(char s) { //overloading with 1 parameter
		return "\nGranny Smith apples are" + colour + " in colour. It is a " + s + " size apple.";
	}
	
	public String Details(char s, String place) { //overloading with 2 parameters
		return "\nGranny Smith apples are" + colour + " in colour. It is a " + s + " size apple. It is come from " + place + ".";
	}
	
	public String printBenefit() { //overriding method
		return "Granny Smith apples can help combat against chronic inflammation, which can lead to diabetes.";
	}
	
	public String toString() { //overriding method
		return super.toString() + Details() + Details('S') + Details('S',"Australia");
	}
}
