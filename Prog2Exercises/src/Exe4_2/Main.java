package Exe4_2;

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
		
		Envy obj4 = new Envy("Envy Red Apple", 15, 2, 'L', "Red", "Fibre and Vitamin C");
		System.out.println("\n===========ENVY RED APPLE==========");
		System.out.println(obj4);
		
		GrannySmith obj5 = new GrannySmith("Granny Smith", 2, 10, "Light green", "Australia");
		System.out.println("\n===========GRANNY SMITH GREEN APPLE==========");
		System.out.println(obj5);
	}

}
