package p2_simple;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// prompt the user
		System.out.println("Enter number 1: ");
		double n1 = scanner.nextDouble();
		
		System.out.println("Enter number 2: ");
		double n2 = scanner.nextDouble();
		
		double result = n1 / n2;
		
		// output
		System.out.printf("The result is: %.2f%n", result);
	}

}
