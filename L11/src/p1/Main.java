package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter an integer: ");
			int number = scanner.nextInt();
			boolean response1 = isEven(number);
			System.out.println("Is even? " + response1);
//			boolean response2 = isDivisibleByFive(number);
//			System.out.println("Is divisible by five: " + response2);
			System.out.println();
		}
		
	}
	
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	public static boolean isDivisibleByFive(int number) {
		return number % 5 == 0;
	}

}
