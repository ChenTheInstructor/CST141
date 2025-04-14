package p1;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// refactoring
		int n1 = getNumber();

		int n2 = getNumber();

		double result = divide(n1, n2);

		show(result);

	}

	public static void show(double result) {
		System.out.printf("%.1f", result);
	}

	public static double divide(int n1, int n2) {
		return (double) n1 / n2;
	}

	public static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		return scanner.nextInt();
	}

}
