package p4;

public class Main {

	public static void main(String[] args) {
		System.out.println("Can you rent a car? " + canRentCar(25, true, true));
	}
	
	public static boolean canRentCar(int age, boolean hasLicense, boolean hasAccident) {
		return (age >= 25 && hasLicense && !hasAccident);
	}

}
