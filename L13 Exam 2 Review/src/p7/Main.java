package p7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// input
		int number = getNumber();
		
		// process and output
		determineDaysInMonth(number);
	}

	private static void determineDaysInMonth(int number) {
		switch(number) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("There are 31 days in the month.");
			break;
		case 2:
			System.out.println("There are 28 or 29 days in the month.");
			break;
		case 4, 6, 9, 11:
			System.out.println("There are 30 days in the month.");
			break;
		default:
			System.out.println("Worry number. Please enter a number between 1 and 12.");
			break;
		}
	}

	private static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 12: ");
		return scanner.nextInt();
	}

}
