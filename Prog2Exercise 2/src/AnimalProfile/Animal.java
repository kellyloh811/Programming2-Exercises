package AnimalProfile;	

public class Animal {

	void profile(String b, String c, char s) {
		System.out.println("Breed	: " + b);
		System.out.println("Colour	: " + c);
		System.out.println("Size	: " + s);
	}
	
	void EatingHabit(String a,String e, String f1, String f2) {
		System.out.println(a + " is " + e + ".");
		System.out.println(a + " eat " + f1 + " and " + f2 + ".");
	}
	
	void LivingHabit(String a, String l, String p) {
		System.out.println(a + " is a " + l + " animal.");
		System.out.println(a + " lives in " + p + ".");
	}
	
	void aging(String a, int ag1, int ag2) {
		System.out.println(a + " can live about " + ag1 + " to " + ag2 + " years.");
	}
}
