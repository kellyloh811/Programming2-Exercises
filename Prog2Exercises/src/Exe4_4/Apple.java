package Exe4_4;

public class Apple extends Fruits{

private int quantity;
private double price;
	
	public Apple(String n, double p, int q) { 
		super(n);
		price=p;
		quantity=q;
		
		System.out.println("\nFruits\t: " + name);
		if (quantity<10) {
			System.out.printf("If quantity less than 10, Total Price is RM%.2f", TotalPrice());
		}
		else if (quantity>=10 && quantity<=50) {
			System.out.printf("If quantity more than 10, Total Price is RM%.2f", TotalPrice(2.30));
		}
		else {
			System.out.println("If quantity more than 50, You'll get a 10% discount.");
			System.out.printf("Total Price is RM%.2f", TotalPrice(1.20, 0.10));
		}
	}
	
	public double TotalPrice(){
		return price*quantity; 
	}
	
	public double TotalPrice(double p2) {
		return p2*quantity;
	}
	
	public double TotalPrice(double p3, double d) {
		return (p3*quantity)*(1-d);
	}
	
	public String printBenefit() { //overriding method
		return "\nApples lower high cholesterol and blood pressure.\n";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}
}
