package Exe4_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruits obj1 = new Fruits("Fruits");
		System.out.println(obj1 + "\n");
		
		Apple obj2 = new Apple("Apple", 3, 10);
		System.out.println(obj2);
		System.out.println("Total price\t: RM" + obj2.TotalPrice() + "\n");
		
		Banana obj3 = new Banana("Banana", 200.0);
		System.out.println(obj3);
		System.out.printf("Total calories\t: " + "%.2f", obj3.totalCalories());
		System.out.print(" kcal");
		System.out.println("\n");
		
		Watermelon obj4 = new Watermelon("Watermelon", "Red", 'N');
		System.out.println(obj4 +"\n");
		
		GrannySmith obj5 = new GrannySmith("Granny Smith", 2, 10, "Light green", "Australia");
		System.out.println(obj5);
		System.out.println("Total price\t: RM" + obj5.TotalPrice() + "\n");
		
		Envy obj6 = new Envy("Envy", 15, 2, 'L', "Red", "Fibre and Vitamin C");
		System.out.println(obj6);
		System.out.println("Total price\t: RM" + obj6.TotalPrice() + "\n");
	}

}
