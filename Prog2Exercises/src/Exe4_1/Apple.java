package Exe4_1;

public class Apple extends Fruits{

	private int price, quantity;
	
	public Apple (String name, int p, int q) {
		super(name);
		this.price=p;
		this.quantity=q;
		
	}
	
	public int TotalPrice () {
		return this.price*this.quantity;
	}
	
	public String toString() {
		return super.toString()+ "\nPrice\t\t: RM" + price + "\nQuantity\t: " + quantity;
	}
}
