package Exe4_2;

public class Banana extends Fruits{

	private double mass;

	public Banana() { //constructor without arguments
		super();
		mass=0;
	}
	
	public Banana(String n, double m) { //constructor with 2 arguments
		super(n);
		mass=m;
		
		setDetails(n,m);
	}
	
	public void setDetails(String n, double m) {
		if (m>=0)
			mass=m;
		else
			mass=0;
	}
	
	public double getmass() {
		return mass;
	}
	
	public double totalCalories () {
		return mass*0.887;
	}
	
	public String toString() {
		return super.toString() + "\nMass\t\t: " + mass + "g" + "\nTotal Calories\t: " + totalCalories() + " kcal";
	}
}
