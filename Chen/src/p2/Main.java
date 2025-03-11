package p2;

public class Main {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Max1", 10.0);
		Dog dog2 = new Dog();
		
		System.out.println(dog1);
		System.out.println(dog2);
		
		dog2.setName("Mini");
		dog2.setWeight(5.0);
		
		Dog.setBreed("Poodle");
		System.out.println("\n\nAfter changes:");
		System.out.println(dog1);
		System.out.println(dog2);
		
		
	}

}
