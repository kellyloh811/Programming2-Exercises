package Exe4_5;

public class EnvyApple extends Apple{

	public EnvyApple (String n, int p, int q){
		super(n,p,q);
	}
	
	public String printBenefit() { //overriding method
		return "\nEnvy apples can help to treat anemia.\n";
	}
	
	public String toString() { //overriding method
		return super.toString();
	}
}
