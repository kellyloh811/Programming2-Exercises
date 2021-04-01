package Example2;

public class Main {

	public static void main(String[] args) {
		
		Animal1 dog = new Animal1 ();
		System.out.println("The first animal is dog.");
		System.out.println("Breed :" + dog.Breed);
		System.out.println("Colour :" + dog.Colour);
		System.out.println("Size :" + dog.Size);
		dog.Sit();
		dog.Run();
		dog.Jump();
		
		System.out.println();
		
		Animal2 rabbit = new Animal2 ();
		System.out.println("The second animal is rabbit.");
		System.out.println("Breed :" + rabbit.Breed);
		System.out.println("Colour :" + rabbit.Colour);
		System.out.println("Size :" + rabbit.Size);
		rabbit.Eat();
		rabbit.Sleep();
		rabbit.Jump();
	}

}
