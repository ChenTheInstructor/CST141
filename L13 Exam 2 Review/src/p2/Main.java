package p2;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// input
		int numPets = getNumberOfPets();
		double monthlyCost = getMonthlyCost();
		int numYears = getNumberOfYears();

		// process
		double totalCost = calculateTotalCost(numPets, monthlyCost, numYears);

		// output
		showTotalCost(totalCost);
	}

	private static void showTotalCost(double totalCost) {
		System.out.printf("The total cost is: %.2f", totalCost);
	}

	private static double calculateTotalCost(int numPets, double monthlyCost, int numYears) {
		return numPets * monthlyCost * numYears * 12;
	}

	private static int getNumberOfYears() {
		System.out.print("Enter the number of years you have them: ");
		return scanner.nextInt();
	}

	private static double getMonthlyCost() {
		System.out.print("Enter the monthly cost of a pet: ");
		return scanner.nextDouble();
	}

	private static int getNumberOfPets() {
		System.out.print("Enter the number of pets your have: ");
		return scanner.nextInt();
	}

}
