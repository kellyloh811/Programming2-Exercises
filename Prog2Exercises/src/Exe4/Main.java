package Exe4;

public class Main {

	public static void main(String[] args) {

		WaterPurifier obj1 = new WaterPurifier("Coway", "CHP-264L", 5);
		System.out.println(obj1);
		System.out.println();
		
		Coway obj2 = new Coway("Coway", "CHP-264L", 5);
		System.out.println(obj2);
		System.out.println("Price of annual rental\t: RM" + obj2.getAnnualRental());
		System.out.println("Total price of rental\t: RM" + obj2.getTotalRentalPrice());
		
	}

}
