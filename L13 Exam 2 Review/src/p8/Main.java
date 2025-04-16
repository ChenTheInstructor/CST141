package p8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// input
		int number = getNumber();
		
		// process and output
//		Main m1 = new Main();
		int days = getDaysInMonth(number);
		showResult(days);
	}

	private static void showResult(int days) {
		System.out.println("There are " + days + " days in the month.");
	}

	static int getDaysInMonth(int month) {
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12:
			return 31;
		case 2:
			return 28;
		case 4, 6, 9, 11:
			return 30;
		default:
			return -1;
		}
	}

	private static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 12: ");
		return scanner.nextInt();
	}

}
