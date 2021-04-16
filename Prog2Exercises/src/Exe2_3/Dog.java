package Exe2_3;
import java.util.*;
public class Dog {

	Scanner s = new Scanner (System.in);
	
	void profile() {
		System.out.println("Please enter breed, colour and size.");
		String breed = s.next();
		String colour = s.next();
		char size = s.next().charAt(0);
		
		System.out.println("It is a " + breed + " with " + colour + " colour and " + size+" size.\n");
	}
	
	void nutrition() {
		System.out.println("Dogs with different age group require different nutrition. "
				+ "\nYou can check what type of nutrition that your dog need from here.");
		System.out.println("Please enter the age group of the dog."
				+ "\nPlease enter \nA for puupy \nB for adult \nC for senior");
		char age = s.next().charAt(0);
		
		switch (age) {
		case 'A':
			System.out.println("A puppy needs more energy and protein.\n");
			break;
		case 'B':
			System.out.println("A adult dog needs more calcium and protein.\n");
			break;
		case 'C':
			System.out.println("A senior dog needs more trace elements and vitamins.\n");
			
		}
	}
	
	void period() {
		System.out.println("Please enter the weight in kg of the dog.");
		double weight = s.nextDouble();
		double food = weight*35;
		System.out.println("It needs to eat "+food+"grams of food a day.\n");
		System.out.println("Please enter the mass(kg) of the food in one packet.");
		double mass = s.nextDouble();
		double period = (mass*1000)/food;
		System.out.println("Your dog can finsih one packet of food in " +period +" days.\n");
	}
	
	void price() {
		System.out.println("One packet of Royal Canin dog food is RM70.\nOne packet of First Choice dog food is RM65.\nWhich one did you want to purchase?");
		System.out.println("Please enter the quantity of your choice.");
		System.out.print("Quantity for Royal Canin:");
		int quantityr = s.nextInt();
		System.out.print("Quantity for First Choice:");
		int quantityf = s.nextInt();
		double total = (quantityr*70)+(quantityf*65);
		
		if (total>100) {
			double discount = total*0.1;
			double finalprice = total - discount;
			System.out.printf("\nThe total price of your purchase is RM%.2f",total);
			System.out.print("\nCongratulation! You've purchase over RM100 and you will get a 10% discount!");
			System.out.printf("\nDiscount received is RM%.2f",discount);
			System.out.printf("\nThe final price after discount is RM%.2f",finalprice);
		}
		else {
			System.out.printf("The total price of your purchase is RM%.2f",total);
		}
	}
	
	
}
