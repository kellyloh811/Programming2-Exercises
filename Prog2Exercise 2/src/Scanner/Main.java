package Scanner;

public class Main {

	public static void main(String[] args) {
		Dog poodle = new Dog();
		Dog husky = new Dog();
		Dog maltese = new Dog();
		Dog corgi = new Dog();
		
		System.out.println("========POODLE=======");
		poodle.profile();
		poodle.nutrition();
		poodle.period();
		poodle.price();
		System.out.println();
		
		System.out.println("\n========HUSKY=======");
		husky.profile();
		husky.nutrition();
		husky.period();
		husky.price();
		System.out.println();
		
		System.out.println("\n========MALTESE=======");
		maltese.profile();
		maltese.nutrition();
		maltese.period();
		maltese.price();
		System.out.println();
		
		System.out.println("\n========CORGI=======");
		corgi.profile();
		corgi.nutrition();
		corgi.period();
		corgi.price();
	}

}
