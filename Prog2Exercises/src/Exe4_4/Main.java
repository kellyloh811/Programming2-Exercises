package Exe4_4;

public class Main {

	public static void main(String[] args) {

		System.out.println("********APPLE********");
		Apple a = new Apple("Apple", 3.50, 15);
		System.out.println(a);

		System.out.println("********BANANA********");
		Banana b = new Banana("Banana", 90.0, 'L');
		System.out.println(b);
		
		System.out.println("********WATERMELON********");
		Watermelon w = new Watermelon("Watermelon", "Black Diamond", "Yellow", 'Y');
		System.out.println(w);
		
		System.out.println("********ENVY APPLE********");
		EnvyApple e = new EnvyApple("ENVY Apple", 4, 2);
		System.out.println(e);
		
		System.out.println("********GRANNY SMITH APPLE********");
		GrannySmithApple g = new GrannySmithApple("GRANNY SMITH Apple", 3, 55);
		System.out.println(g);
	}

}
