package Exe4_5;

public class Banana extends Fruits implements DiscountRate{

	protected double calories;
	protected char size;
	private double discount;
	
	public Banana(String n, double c, char s) { 
		super(n);
		calories=c;
		size=s;
		
		System.out.println(name());
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
	
	public String name() {
		return "Fruits\t: " + name;
	}
	
	public double discountrate() {
		if (size == 'S') {
			discount = 0.10;
		}
		else if (size == 'M') {
			discount = 0.15;
		}
		else {
			discount = 0.20;
		}
		return discount;
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
		return printBenefit() + "Discount Rate\t: " + discountrate() + "\n";
	}
}