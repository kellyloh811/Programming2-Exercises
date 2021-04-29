package Exe4_3;

public class Fruits {

		private String name;
		
		public Fruits() { //constructor with no argument
			name=" ";
		}
		
		public Fruits(String n) { //constructor with argument
			name=n;
		}
		
		public String printBenefit() {
			return "Fruits protect against cancer and other diseases.";
		}
		
		public String getName() {
			return name;
		}
		
		public String toString() { //overriding method
			return name + " constructor is invoked" + "\nFruits\t\t: " + getName();
		}
}
