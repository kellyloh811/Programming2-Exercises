package Exe4_3;

public class Main {

	public static void main(String[] args) {
		Apple obj1 = new Apple("Apple", 3, 5);
		System.out.println("===========APPLE==========");
		System.out.println(obj1);
		
		Banana obj2 = new Banana("Banana", 108.9);
		System.out.println("\n===========BANANA==========");
		System.out.println(obj2);

		Watermelon obj3 = new Watermelon("Watermelon", "Red", 'N');
		System.out.println("\n===========WATERMELON==========");
		System.out.println(obj3);
		
		EnvyApple obj4 = new EnvyApple("Envy Red Apple", 15, 2, "fibre");
		System.out.println("\n===========ENVY RED APPLE==========");
		System.out.println(obj4);
		
		GrannySmithApple obj5 = new GrannySmithApple("Granny Smith", 2, 10, "light green");
		System.out.println("\n===========GRANNY SMITH GREEN APPLE==========");
		System.out.println(obj5);

	}

}
