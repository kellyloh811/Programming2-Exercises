package Exe4_3;

public class Apple extends Fruits{

private int price, quantity;
	
	public Apple(String n, int p, int q) { 
		super(n);
		price=p;
		quantity=q;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public int TotalPrice() { //overloading without parameter
		return 3*quantity;
	}
	
	public int TotalPrice(int p) { //overloading with 1 parameter
		return p*quantity;
	}
	
	public int TotalPrice(int m, int p) { //overloading with 2 parameters
		return m*p;
	}
	
	public String printBenefit() { //overriding method
		return "Apples lower high cholesterol and blood pressure.";
	}
	
	public String toString() { //overriding method
		return super.toString() + "\nPrice\t\t: RM" + price + "\nQuantity\t: " + quantity + "\nTotal price\t: RM" + TotalPrice() + "\nTotal price\t: RM" + TotalPrice(4)+ "\nTotal price\t: RM" + TotalPrice(500,4) + "\n" + printBenefit();
	}
}
