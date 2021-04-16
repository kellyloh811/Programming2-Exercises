package Exe2_4;

public class Oven {

	String brand;
	String model;
	String colour;
	int capacity;
	int power;
	int WarrantyPeriod;
	
	//Setter Methods
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	
	public void setColour(String colour) {
		this.colour=colour;
	}
	
	public void setCapacity(int capacity) {
		this.capacity=capacity;
	}
	
	public void setPower(int power) {
		this.power=power;
	}
	
	public void setWarrantyPeriod(int WarrantyPeriod) {
		this.WarrantyPeriod=WarrantyPeriod;
	}
	
	//Getter Methods
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public int getWarrantyPeriod() {
		return this.WarrantyPeriod;
	}
}
