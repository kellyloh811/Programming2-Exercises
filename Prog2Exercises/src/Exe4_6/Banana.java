package Exe4_6;

public class Banana extends Apple {
	
	public Banana(String n, double p, int q) { 
		super(n, p, q);
	}
	
	public String printBenefit() { //overriding method
		return "\nBananas can aid digestion and help beat gastrointestinal issues.\n";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}
}
