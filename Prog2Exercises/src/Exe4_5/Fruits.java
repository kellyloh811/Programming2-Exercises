package Exe4_5;

public abstract class Fruits {

	protected String name;
	
	public abstract String name();
	
	public Fruits() { //constructor with no argument
		name=" ";
	}
	
	public Fruits(String n) { //constructor with argument
		name=n;
	}
	
	public String printBenefit() {
		return "\nFruits protect against cancer and other diseases.";
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { //overriding method
		return name + " constructor is invoked" + "\nFruits\t\t: " + getName();
	}
	
}
