package p1;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your test score (0 - 100): ");
		double score = scanner.nextDouble();
		if (score < 0 || score > 100) {
			System.out.println("Invalid score.");
		} else if (score >= 60) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}
