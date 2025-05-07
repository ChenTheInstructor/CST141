package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// for-loop
		// syntax
		// for(initialization; condition;updateCount)
		for (int i = 0; i < 3; i = i + 2) {
			double score = getScore();
			char letterGrade = (score >= 90) ? 'A'
					: (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score > 60) ? 'D' : 'F';
			System.out.print("You earned a grade of: " + letterGrade);
			System.out.println("\t at the count number of " + i);
		}
		
		
	}

	private static double getScore() {
		Scanner scanner = new Scanner(System.in);
		// prompt
		System.out.print("Enter your test score: ");
		return scanner.nextDouble();
	}

}
