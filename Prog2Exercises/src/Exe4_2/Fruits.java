package Exe4_2;

public class Fruits {

	private String name;
	
	public Fruits() { //constructor with no argument
		name=" ";
	}
	
	public Fruits(String n) { //constructor with argument
		name=n;
		
		setDetails(n);
	}
	
	public void setDetails(String name) {
		name=" ";
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { //overriding method
		return name + " constructor is invoked" + "\nFruits\t\t: " + getName();
	}
}
