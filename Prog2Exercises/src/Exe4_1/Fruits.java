package Exe4_1;

public class Fruits {
	
	private String name;
	public Fruits(String name) {
		this.name=name;
		System.out.println(name + " constructor is invoked");
	}
	
	public String toString() {
		return "Fruits\t\t: " + name;
	}
}
