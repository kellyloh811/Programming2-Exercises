package Scanner;
import java.util.*;
public class Animal {

	Scanner s = new Scanner (System.in);
	
	void profile() {
		System.out.println("Please enter breed, colour and size.");
		String breed = s.next();
		String colour = s.next();
		char size = s.next().charAt(0);
		
		System.out.println("It is a " + breed + " with " + colour + " colour and " + size+" size.\n");
	}
	
	void food() {
		System.out.println("Different animals eat different foods. You can check the food what does the animal eat from here.");
		System.out.println("Please enter an animal from dog, cat, rabbit and lion.");
		String animal = s.next();
		
		switch (animal) {
		case "dog":
			System.out.println("Dogs eat raw meats and rice.\n");
			break;
		case "cat":
			System.out.println("Cats eat meats and fishes.\n");
			break;
		case "rabbit":
			System.out.println("Rabbits eat hay and grass.\n");
			break;
		case "lion":
			System.out.println("Lions eat zebras and hares.\n");
		}
	}
	
	void period() {
		System.out.println("Please enter the weight in kg of the dog.");
		double weight = s.nextDouble();
		double food = weight*35;
		System.out.println("It needs to eat "+(food)+"grams of food a day.\n");
		System.out.println("Please enter the mass(kg) of the food in one packet.");
		double mass = s.nextDouble();
		double period = (mass*1000)/food;
		System.out.println("Your dog can finsih one packet of food in "+ period +" days.\n");
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
			System.out.printf("The total price of your purchase is RM %.2f",total);
			System.out.printf("\nDiscount received\t: RM%.2f",discount);
			System.out.printf("\nFinal price\t\t: RM%.2f",finalprice);
		}
		else {
			System.out.printf("The total price of your purchase is RM%.2f",total);
		}
	}
	
	
}
