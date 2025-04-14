package p1;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// input: get three integers

		int first = getNumber();
		int second = getNumber();
		int third = getNumber();

		// process: calculate the score using the formula
		double score = calculateScore(first, second, third);

		// show result
		showResult(score);
	}

	private static void showResult(double score) {
		System.out.printf("The score is %.2f.", score);
	}

	private static double calculateScore(int first, int second, int third) {
		return (first + second * 2 - third % 3) / 2.0;
	}

	private static int getNumber() {
//		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		return scanner.nextInt();
	}

}
