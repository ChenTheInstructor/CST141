package p1;

public class Main {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		// feed the first dog object
		d1.feed(15);
		
		System.out.println(d1.getWeight());
	}

}
