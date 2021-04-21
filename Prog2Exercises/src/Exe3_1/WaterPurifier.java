package Exe3_1;

import java.util.Scanner;

public class WaterPurifier {

Scanner in = new Scanner(System.in);
	
	private String brand, model;
	private int function,retailprice, monthlyrental;
	private char childlock, hotwater, ambientwater, coldwater;
	
	
	//default constructor
	WaterPurifier(){
		System.out.println("Please enter the brand of the water purifier : ");
		this.brand=in.nextLine();
		System.out.println("Please enter the model of the water purifier : ");
		this.model=in.nextLine();
		System.out.println("How many function does this water purifier have?");
		this.function=in.nextInt();
		System.out.println("Is this water purifier have child safety lock?");
		this.childlock=in.next().charAt(0);
		System.out.println("Can this water purifier dispense hot water?");
		this.hotwater=in.next().charAt(0);
		System.out.println("Can this water purifier dispense ambient water?");
		this.ambientwater=in.next().charAt(0);
		System.out.println("Can this water purifier dispense cold water?");
		this.coldwater=in.next().charAt(0);
		System.out.println("Please enter the retail price of this water purifier : ");
		this.retailprice=in.nextInt();
		System.out.println("Please enter the price of monthly rental of this water purifier : ");
		this.monthlyrental=in.nextInt();
	}
	
	//Parameterized constructor
	WaterPurifier(String brand, String model, int function, char childlock, char hotwater, char ambientwater, char coldwater, int retailprice, int monthlyrental){
		this.brand=brand;
		this.model=model;
		this.function=function;
		this.childlock=childlock;
		this.hotwater=hotwater;
		this.ambientwater=ambientwater;
		this.coldwater=coldwater;
		this.retailprice=retailprice;
		this.monthlyrental=monthlyrental;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getFunction() {
		return this.function;
	}
	
	public char getChildLock() {
		return this.childlock;
	}
	
	public char getHotWater() {
		return this.hotwater;
	}
	
	public char getAmbientWater() {
		return this.ambientwater;
	}
	
	public char getColdWater() {
		return this.coldwater;
	}
	
	public int getRetailPrice() {
		return this.retailprice;
	}
	
	public int getMonthlyRental() {
		return this.monthlyrental;
	}
	
	public int calAnnualRental() {
		return this.monthlyrental*12;
	}
}
