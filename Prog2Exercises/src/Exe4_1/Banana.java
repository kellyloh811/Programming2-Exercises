package Exe4_1;

public class Banana extends Fruits{

	private double mass;

	public Banana(String name, double m) {
		super(name);
		this.mass=m;
		
	}
	
	public double totalCalories () {
		return this.mass*0.887;
	}
}
