package p2;

import java.util.Random;

public class ExerciseApp {

	public static void main(String[] args) {
		System.out.println("\nTemplate 1");
		printRandomWeather();
		System.out.println("\nTemplate 2");
		displayDieRolls(10);
		System.out.println("\nTemplate 3");
		int damage = calculateDamage(10);
		System.out.println("The damage is: " + damage + ".");
		System.out.println("\nTemplate 4");
		int passcode = generatePasscode();
		System.out.println("The passcode is: " + passcode + ".");
	}
	
	// template 4: No parameters and a return value
	public static int generatePasscode() {
		Random random = new Random();
		return random.nextInt(1000, 10000);
	}
	
	
	// template 3: with parameters and a return value
	public static int calculateDamage(int maxPower) {
		Random rand = new Random();
		return rand.nextInt(1, maxPower + 1);
	}
	
	// template 2: with parameters, no return value
	public static void displayDieRolls(int times) {
		
		for (int i = 0; i < times; i++) {
			Random rand = new Random();
			int number = rand.nextInt(1, 7);
			System.out.print(number + " ");
		}
		System.out.println();
		
	}
	
	// template 1: no parameters and no return value
	public static void printRandomWeather() {
		Random rand = new Random();
		int n = rand.nextInt(1, 4);
		if(n == 1) {
			System.out.println("It's sunny!");
		} else if(n == 2) {
			System.out.println("It's rainy.");
		} else {
			System.out.println("It's cloudy.");
		}
	}

}
