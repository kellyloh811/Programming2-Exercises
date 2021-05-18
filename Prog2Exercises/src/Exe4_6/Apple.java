package Exe4_6;

public class Apple extends Fruits{

	private int quantity;
	private double price;
	
	public Apple(String n, double p, int q) { 
		super(n);
		price=p;
		quantity=q;
		
		System.out.println(name());
		Price atp = new TotalPrice(); //atp = apple total price
		Price btp = new TotalPrice(); //btp = banana total price
		Price wtp = new TotalPrice(); //wtp = watermelon total price
		if (quantity<10) {
			System.out.printf("If quantity less than 10, Total Price is RM%.2f", atp.tprice(p, q));
		}
		else if (quantity>=10 && quantity<=50) {
			if(n == "Apple" || n == "ENVY Apple" || n == "GRANNY SMITH Apple") {
				double ap = 3.00; //ap = apple price
				System.out.printf("If quantity more than 10, Total Price is RM%.2f", atp.tprice(ap, q));
			}
			else if (n == "Banana") {
				double bp = 3.70; //bp = banana price
				System.out.printf("If quantity more than 10, Total Price is RM%.2f", btp.tprice(bp, q));
			}
			else if (n == "Watermelon") {
				double wp = 12.10; //wp = watermelon price
				System.out.printf("If quantity more than 10, Total Price is RM%.2f", wtp.tprice(wp, q));
			}
			
		}
		else {
			if(n == "Apple" || n == "ENVY Apple" || n == "GRANNY SMITH Apple") {
				double ap2 = 2.50;
				DiscountRate aa = new AppleDiscount();
				double ad = aa.discountrate(); //ad = apple discount
				System.out.println("If quantity more than 50, You'll get a 10% discount.");
				System.out.printf("Total Price is RM%.2f", atp.tprice(ap2, q, ad));
			}
			else if (n == "Banana") {
				double ab2 = 3.20;
				DiscountRate bb = new BananaDiscount();
				double bd = bb.discountrate(); //bd = banana discount
				System.out.println("If quantity more than 50, You'll get a 10% discount.");
				System.out.printf("Total Price is RM%.2f", btp.tprice(ab2, q, bd));
			}
			else if (n == "Watermelon") {
				double aw2 = 11.60;
				DiscountRate ww = new WatermelonDiscount();
				double wd = ww.discountrate(); //wd = watermelon discount
				System.out.println("If quantity more than 50, You'll get a 10% discount.");
				System.out.printf("Total Price is RM%.2f", btp.tprice(aw2, q, wd));
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
