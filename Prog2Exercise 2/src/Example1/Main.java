package Example1;

public class Main {

	public static void main(String[] args) {
		
		Rabbit a = new Rabbit ();
		System.out.println(a.breed);
		System.out.println(a.colour);
		System.out.println(a.size);
		a.Eat();
		a.Sleep();
		a.Jump();
		
		System.out.println();
		
		SmartTV b = new SmartTV ();
		System.out.println(b.Brand);
		System.out.println(b.Model);
		System.out.println(b.Screen);
		b.Youtube();
		b.Browser();
		b.ShareScreen();
	}

}
