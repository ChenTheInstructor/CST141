package p1;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		int size = getClassSize();
		double[] scores = createScoreArrayWithUserInput(size);
		showScoreArray(scores);
		showClassScoreStatistics(scores);
	}
	
	public static void showClassScoreStatistics(double[] arr) {
		double average = getClassAverage(arr);
		double lowestScore = getLowestScore(arr);
		double highestScore = getHighestScore(arr);
		System.out.printf("The class average is %.2f%n", average);
		System.out.printf("The lowest score is %.2f%n", lowestScore);
		System.out.printf("The highest score is %.2f%n", highestScore);
	}
	
	public static double getHighestScore(double[] arr) {
		double highest = Double.MIN_VALUE;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > highest) {
				highest = arr[index];
			}
		}
		return highest;
	}

	public static double getLowestScore(double[] arr) {
		double lowest = Double.MAX_VALUE;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < lowest) {
				lowest = arr[index];
			}
		}
		return lowest;
	}

	public static double getClassAverage(double[] arr) {
		double total = 0.0;
		for (int index = 0; index < arr.length; index++) {
			total = total + arr[index];
		}
		return total / arr.length;
	}

	private static int getClassSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is the size of the class: ");
		return scanner.nextInt();
	}

	public static double[] createScoreArrayWithUserInput(int size) {
		Scanner scanner = new Scanner(System.in);
		double[] scores = new double[size];
		for (int index = 0; index < size; index++) {
			System.out.print("Enter score " + (index + 1) + ": ");
			scores[index] = scanner.nextDouble();
		}

		return scores;
	}

	public static void showScoreArray(double[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static double[] createScoreArray() {
		double[] scores = new double[10];
		scores[0] = 60;
		scores[1] = 71;
		scores[2] = 92;
		scores[3] = 79;
		scores[scores.length - 1] = 40;
		scores[7] = 66;
		scores[8] = 71;
		scores[4] = 96;
		scores[5] = 73;
		scores[6] = 47;
		return scores;
	}

}
