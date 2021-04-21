package Exe4;
import java.util.*;
public class WaterPurifier {

	private String brand, model;
	private int rentalperiod;
	
	Scanner in = new Scanner (System.in);
	
	public WaterPurifier() {
		System.out.print("Please enter the brand\t\t: ");
		this.brand=in.nextLine();
		System.out.print("Please enter the model\t\t: ");
		this.model=in.nextLine();
		System.out.print("Please enter the rental period\t: ");
		this.rentalperiod=in.nextInt();
	}
	
	public WaterPurifier(String b, String m, int rperiod){
		this.brand=b;
		this.model=m;
		this.rentalperiod=rperiod;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getRentalPeriod() {
		return this.rentalperiod;
	}
	
	public String toString() {
		return "\nBrand\t\t\t: " + brand + "\nModel\t\t\t: " + model + "\nRental period\t\t: " + rentalperiod + " years";
	}
}
