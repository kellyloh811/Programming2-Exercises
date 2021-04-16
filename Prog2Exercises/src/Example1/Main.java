package Example1;

public class Main {

	public static void main(String[] args) {
		
		Rabbit a = new Rabbit ();
		System.out.println("Breed :" + a.Breed);
		System.out.println("Colour :" + a.Colour);
		System.out.println("Size :" + a.Size);
		a.Eat();
		a.Sleep();
		a.Jump();
		
		System.out.println();
		
		SmartTV b = new SmartTV ();
		System.out.println("Brand :" + b.Brand);
		System.out.println("Model :" + b.Model);
		System.out.println("Screen :" + b.Screen);
		b.Youtube();
		b.Browser();
		b.ShareScreen();
	}

}
