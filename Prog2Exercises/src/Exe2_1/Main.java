package Exe2_1;

public class Main {

	public static void main(String[] args) {
		
		Animal dog = new Animal ();
		Animal rabbit = new Animal();
		System.out.println("The first animal is dog.");
		System.out.println("Breed	: " + dog.Breed [0]);
		System.out.println("Colour	: " + dog.Colour[0]);
		System.out.println("Size	: " + dog.Size[0]);
		dog.Sit();
		dog.Run();
		dog.Jump();
		dog.Eat();
		dog.Sleep();
		
		System.out.println("\n==========================================\n");
		
		System.out.println("The second animal is rabbit.");
		System.out.println("Breed	: " + rabbit.Breed [1]);
		System.out.println("Colour	: " + rabbit.Colour[1]);
		System.out.println("Size	: " + rabbit.Size[1]);
		rabbit.Sit();
		rabbit.Run();
		rabbit.Jump();
		rabbit.Eat();
		rabbit.Sleep();
		
	}

}
