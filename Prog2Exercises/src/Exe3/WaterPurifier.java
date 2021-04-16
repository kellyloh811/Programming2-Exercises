package Exe3;
import java.util.Scanner;
public class WaterPurifier {

	Scanner in = new Scanner(System.in);
	
	String brand, model;
	int function,retailprice, monthlyrental;
	char childlock, hotwater, ambientwater, coldwater;
	
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
}
