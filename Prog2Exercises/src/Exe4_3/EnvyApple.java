package Exe4_3;

public class EnvyApple extends Apple{

	private String nutrients;
	
	public EnvyApple(String n, int p, int q, String nt){
		super(n,p,q);
		nutrients=nt;
	}
	
	public String Nutrients() { //overloading without parameter
		return "\nEnvy apples have Vitamin C.";
	}
	
	public String Nutrients(String f) { //overloading with 1 parameter
		return "\nEnvy apples have Vitamin C and " + nutrients + ".";
	}
	
	public String Nutrients(String f, String p) { //overloading with 2 parameters
		return "\nEnvy apples have Vitamin C, " + f + " and " + p +".";
	}
	
	public String printBenefit() { //overriding method
		return "Envy apples can help to treat anemia.";
	}
	
	public String toString() { //overriding method
		return super.toString() + Nutrients() + Nutrients("fibre") + Nutrients("fibre", "potassium");
	}
}
