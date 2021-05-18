package Exe4_6;

public class Watermelon extends Apple {
	
	public Watermelon(String n, double p, int q) { 
		super(n, p, q);
	}
	
	public String printBenefit() { //overriding method
		return "\nWatermelon can help us hydrate because it has 92% of high water content.\n";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}

}
