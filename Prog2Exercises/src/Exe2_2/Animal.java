package Exe2_2;	

public class Animal {

	void profile(String breed, String colour, char size) {
		System.out.println("Breed	: " + breed);
		System.out.println("Colour	: " + colour);
		System.out.println("Size	: " + size);
	}
	
	void EatingHabit(String a,String e, String f1, String f2, int w) {
		System.out.println(a + " is " + e + ".");
		System.out.println(a + " eat " + f1 + " and " + f2 + ".");
		
		if (a == "Dog") {
			System.out.println("A dog with weight " + w + "kg needs to eat " + (w*35) + "grams of food a day.");
		}
		else if (a == "Cat") {
			System.out.println("A cat with weight " + w + "kg needs to eat " + (w*40) + "grams of food a day.");
		}
		else if (a == "Rabbit") {
			System.out.println("A rabbit with weight " + w + "kg needs to eat " + (w*25) + "grams of food a day.");
		}
		else if (a == "Lion") {
			System.out.println("A lion with weight " + w + "kg needs to eat " + (w*45) + "grams of food a day.");
		}
	}
	
	void cost(String a, double c, int w, int d) {
		if (a == "Dog") {
			System.out.println("The cost of dog food is RM" + c + " per kg.");
			System.out.println("The cost of food for a dog with weight " + w + "kg is RM"+ (w*0.035*c*d)+ " for " + d + " days.");
		}
		else if (a == "Cat") {
			System.out.println("The cost of cat food is RM" + c + " per kg.");
			System.out.println("The cost of food for a cat with weight " + w + "kg is RM"+ (w*0.040*c*d)+ " for " + d + " days.");
		}
		else if (a == "Rabbit") {
			System.out.println("The cost of rabbit food is RM" + c + " per kg.");
			System.out.println("The cost of food for a rabbit with weight " + w + "kg is RM"+ (w*0.025*c*d)+ " for " + d + " days.");
		}
		else if (a == "Lion") {
			System.out.println("The cost of lion food is RM" + c + " per kg.");
			System.out.println("The cost of food for a lion with weight " + w + "kg is RM"+ (w*0.045*c*d)+ "for " + d + " days.");
		}
	}
	
	void aging(String a, int y1, int y2, int ag1, int ag2) {
		if (a == "Dog") {
			System.out.println(a + " can live about " + ag1 + " to " + ag2 + " years.");
			System.out.println(a + " with "+ y1 +" years old is equal to " + (y1*y2) +" years old in human years.");
			System.out.println(a + " which is " + y1 + " years old this year still can live about " + (ag1-y1) + " to " + (ag2-y1)+ " years.");
		}
		else if (a == "Cat") {
			System.out.println(a + " can live about " + ag1 + " to " + ag2 + " years.");
			System.out.println(a + " with "+ y1 +" years old is equal to " + (y1*y2) +" years old in human years.");
			System.out.println(a + " which is " + y1 + " years old this year still can live about " + (ag1-y1) + " to " + (ag2-y1)+ " years.");
		}
		else if (a == "Rabbit") {
			System.out.println(a + " can live about " + ag1 + " to " + ag2 + " years.");
			System.out.println(a + " with "+ y1 +" years old is equal to " + (y1*y2) +" years old in human years.");
			System.out.println(a + " which is " + y1 + " years old this year still can live about " + (ag1-y1) + " to " + (ag2-y1)+ " years.");
		}
		else if (a == "Lion") {
			System.out.println(a + " can live about " + ag1 + " to " + ag2 + " years.");
			System.out.println(a + " with "+ y1 +" years old is equal to " + (y1*y2) +" years old in human years.");
			System.out.println(a + " which is " + y1 + " years old this year still can live about " + (ag1-y1) + " to " + (ag2-y1)+ " years.");
		}
	}
}
