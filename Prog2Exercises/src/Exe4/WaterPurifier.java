package Exe4;

public class WaterPurifier {

	private String brand, model;
	private int rentalperiod;
	
	public WaterPurifier(String b, String m, int rperiod){
		brand=b;
		model=m;
		rentalperiod=rperiod;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getRentalPeriod() {
		return rentalperiod;
	}
	
	public String toString() {
		return "Brand\t\t\t: " + brand + "\nModel\t\t\t: " + model + "\nRental period\t\t: " + rentalperiod + " years";
	}
}
