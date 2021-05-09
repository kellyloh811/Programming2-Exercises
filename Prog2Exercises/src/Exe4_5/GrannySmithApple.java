package Exe4_5;

public class GrannySmithApple extends Apple{

	public GrannySmithApple(String n, int p, int q){
		super(n,p,q);
	}
	
	public String printBenefit() { //overriding method
		return "\nGranny Smith apples can help combat against chronic inflammation, which can lead to diabetes.\n";
	}
	
	public String toString() { //overriding method
		return super.toString();
	}
}
