package Exe4_6;

public class Apple extends Fruits{

	private int quantity;
	private double price;
	
	public Apple(String n, double p, int q) { 
		super(n);
		price=p;
		quantity=q;
		
		System.out.println(name());
		Price atp = new AppleTotalPrice(); //atp = apple total price
		Price btp = new BananaTotalPrice(); //btp = banana total price
		Price wtp = new WatermelonTotalPrice(); //wtp = watermelon total price
		if (quantity<10) {
			System.out.printf("If quantity less than 10, Total Price is RM%.2f", (price*quantity));
		}
		else if (quantity>=10 && quantity<=50) {
			if(n == "Apple" || n == "ENVY Apple" || n == "GRANNY SMITH Apple") {
				System.out.printf("If quantity more than 10, Total Price is RM%.2f", atp.tprice(q));
			}
			else if (n == "Banana") {
				System.out.printf("If quantity more than 10, Total Price is RM%.2f", btp.tprice(q));
			}
			else if (n == "Watermelon") {
				System.out.printf("If quantity more than 10, Total Price is RM%.2f", wtp.tprice(q));
			}
			
		}
		else {
			if(n == "Apple" || n == "ENVY Apple" || n == "GRANNY SMITH Apple") {
				DiscountRate aa = new AppleDiscount();
				double ad = aa.discountrate(); //ad = apple discount
				System.out.println("If quantity more than 50, You'll get a 10% discount.");
				System.out.printf("Total Price is RM%.2f", atp.tprice(q, ad));
			}
			else if (n == "Banana") {
				DiscountRate bb = new BananaDiscount();
				double bd = bb.discountrate(); //bd = banana discount
				System.out.println("If quantity more than 50, You'll get a 20% discount.");
				System.out.printf("Total Price is RM%.2f", btp.tprice(q, bd));
			}
			else if (n == "Watermelon") {
				DiscountRate ww = new WatermelonDiscount();
				double wd = ww.discountrate(); //wd = watermelon discount
				System.out.println("If quantity more than 50, You'll get a 30% discount.");
				System.out.printf("Total Price is RM%.2f", btp.tprice(q, wd));
			}
		}
	}
	
	public String name() {
		return "Fruits\t: " + name;
	}
	
	public String printBenefit() { //overriding method
		return "\nApples lower high cholesterol and blood pressure.\n";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}
}
