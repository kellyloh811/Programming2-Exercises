package AnimalProfile;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Animal ();
		Animal cat = new Animal ();
		Animal rabbit = new Animal ();
		Animal lion = new Animal ();
		
		System.out.println("********************\n\tDOG\n********************");
		dog.profile("Golden Retriver", "Gold", 'L');
		System.out.println("\n~~~Eating Habit~~~");
		dog.EatingHabit("Dog", "an omnivore", "raw meats", "rice", 30);
		System.out.println("\n~~~Cost of food~~~");
		dog.cost("Dog", 25.00, 30, 7);
		System.out.println("\n~~~Living Time~~~");
		dog.aging("Dog", 2, 7, 10, 13);
		System.out.println();
		
		System.out.println("********************\n\tCAT\n********************");
		cat.profile("Siamese Cat", "Cream", 'M');
		System.out.println("\n~~~Eating Habit~~~");
		cat.EatingHabit("Cat", "a carnivore", "meats", "fishes", 5);
		System.out.println("\n~~~Cost of food~~~");
		cat.cost("Cat", 30.00, 5, 10);
		System.out.println("\n~~~Living Time~~~");
		cat.aging("Cat", 5, 15, 10, 16);
		System.out.println();
		
		System.out.println("********************\n\tRABBIT\n********************");
		rabbit.profile("Holland Lop Rabbit", "Chestnut", 'S');
		System.out.println("\n~~~Eating Habit~~~");
		rabbit.EatingHabit("Rabbit", "a herbivore", "hay", "grass", 2);
		System.out.println("\n~~~Cost of food~~~");
		rabbit.cost("Rabbit", 18.00, 2, 30);
		System.out.println("\n~~~Living Time~~~");
		rabbit.aging("Rabbit", 4, 21, 5, 8);
		System.out.println();
		
		System.out.println("********************\n\tLION\n********************");
		lion.profile("White lion", "White", 'L');
		System.out.println("\n~~~Eating Habit~~~");
		lion.EatingHabit("Lion", "a carnivore", "zebras", "hares", 190);
		System.out.println("\n~~~Cost of food~~~");
		lion.cost("Lion", 17.40, 190, 1);
		System.out.println("\n~~~Living Time~~~");
		lion.aging("Lion", 8, 5, 10, 14);
		System.out.println();

	}
	

}
