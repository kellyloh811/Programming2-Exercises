package Exe4;

public class Coway extends WaterPurifier{

	private int retailprice, monthlyrental;
	
	public Coway(String b, String m, int rperiod, int rprice, int mr) {
		super(b, m, rperiod);
		retailprice=rprice;
		monthlyrental=mr;
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
