package Exe4;
import java.util.*;
public class Coway extends WaterPurifier{

	private int retailprice, monthlyrental;
	
	Scanner in = new Scanner (System.in);
	
	public Coway(String b, String m, int rperiod) {
		super(b, m, rperiod);
		System.out.print("Please enter the retail price\t\t: ");
		retailprice=in.nextInt();
		System.out.print("Please enter the monthly rental price\t: ");
		monthlyrental=in.nextInt();
		System.out.println();
	}
	
	public int getRetailPrice() {
		return retailprice;
	}
	
	public int getMonthlyRental() {
		return monthlyrental;
	}
	
	public int getAnnualRental() {
		return monthlyrental*12;
	}
	
	public int getTotalRentalPrice() {
		return super.getRentalPeriod()*getAnnualRental();
	}
	
	public String toString() {
		return super.toString() + "\nRetail price\t\t: RM" + retailprice + "\nMonthly rental price\t: RM" + monthlyrental;
	}
}
