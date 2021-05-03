package Exe4_4;

public class Banana extends Fruits{

protected double calories;
protected char size;

	
	public Banana(String n, double c, char s) { 
		super(n);
		calories=c;
		size=s;
		
		System.out.println("\nFruits\t: " + name);
		switch(size) {
		case 'S':
			System.out.println("Total calories of " + size + " size banana is " + totalCalories() + " kcal.");
			break;
		case 'M':
			System.out.println("Total calories of " + size + " size banana is " + totalCalories(105) + " kcal.");
			break;
		case 'L':
			System.out.println("Total calories of " + size + " size banana is " + totalCalories(121) + " kcal.");
			break;
		}
		
	}
	
	public double totalCalories() {
		return calories;
	}
	
	public double totalCalories(double c) {
		return c;
	}
	
	public String printBenefit() { //overriding method
		return "Bananas can aid digestion and help beat gastrointestinal issues.\n";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}
}
