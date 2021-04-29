package Exe4_3;

public class Banana extends Fruits{

	private double mass;
	
	public Banana(String n, double m) { 
		super(n);
		mass=m;
		
	}
	
	public double getmass() {
		return mass;
	}
	
	public double totalCalories () { //overloading without parameter
		return mass*0.887;
	}
	
	public double totalCalories (double m) { //overloading with 1 parameter
		return m*0.887;
	}
	
	public double totalCalories (double m, double c) { //overloading with 2 parameters
		return m*c;
	}
	
	public String printBenefit() { //overriding method
		return "Bananas can aid digestion and help beat gastrointestinal issues.";
	}
	
	public String toString() { //overriding method
		return super.toString() + "\nMass\t\t: " + mass + "g" + "\nTotal Calories\t: " + totalCalories() + " kcal" + "\nTotal Calories\t: " + totalCalories(500) + " kcal" + "\nTotal Calories\t: " + totalCalories(500,0.887) + " kcal" + "\n" + printBenefit();
	}
}
