package AnimalProfile;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Animal ();
		Animal cat = new Animal ();
		Animal rabbit = new Animal ();
		Animal lion = new Animal ();
		
		System.out.println("*********DOG*********");
		dog.profile("Golden Retriver", "Gold", 'L');
		dog.EatingHabit("Dog", "an omnivore", "raw meats", "rice");
		dog.LivingHabit("Dog", "social", "kennel");
		dog.aging("Dog", 10, 13);
		System.out.println();
		
		System.out.println("*********CAT*********");
		cat.profile("Siamese Cat", "Cream", 'M');
		cat.EatingHabit("Cat", "a carnivore", "meats", "fishes");
		cat.LivingHabit("Cat", "solitary", "cattery");
		cat.aging("Cat", 10, 16);
		System.out.println();
		
		System.out.println("*********RABBIT*********");
		rabbit.profile("Holland Lop Rabbit", "Chestnut", 'S');
		rabbit.EatingHabit("Rabbit", "a herbivore", "hay", "grass");
		rabbit.LivingHabit("Rabbit", "social", "grasslands");
		rabbit.aging("Rabbit", 5, 8);
		System.out.println();
		
		System.out.println("*********LION*********");
		lion.profile("White lion", "White", 'L');
		lion.EatingHabit("Lion", "a carnivore", "zebras", "hares");
		lion.LivingHabit("Lion", "social", "grasslands");
		lion.aging("Lion", 10, 14);
		System.out.println();

	}
	

}
