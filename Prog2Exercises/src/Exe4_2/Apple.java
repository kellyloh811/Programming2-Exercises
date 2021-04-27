package Exe4_2;

public class Apple extends Fruits{ //sub class

	private int price, quantity;
	
	public Apple() { //constructor without argument
		super();
		price=0;
		quantity=0;
	}
	
	public Apple(String n, int p, int q) { //constructor sub class with 3 arguments
		super(n);
		price=p;
		quantity=q;
		
		setDetails(n,p,q);
	}
	
	public void setDetails(String n, int p, int q) {
		if (p>=0)
			price=p;
		else
			price=0;
		
		if (q>=0)
			quantity=q;
		else
			quantity=0;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public int TotalPrice() {
		return price*quantity;
	}
	
	public String toString() { //overriding method
		return super.toString() + "\nPrice\t\t: RM" + price + "\nQuantity\t: " + quantity + "\nTotal price\t: RM" + TotalPrice();
	}
}
