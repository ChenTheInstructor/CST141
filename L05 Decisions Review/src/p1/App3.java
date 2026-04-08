package p1;

import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your letter grade (A, B, C, D, or F): ");
		char grade = scanner.nextLine().toUpperCase().charAt(0);

		String comment = switch (grade) {

		case 'A', 'a' -> {
			System.out.println("Wow!");
			yield "Excellent";
		}

		case 'B', 'b' -> "Good";
		case 'C', 'c' -> "Average";
		case 'D', 'd' -> "Needs Improvement";
		case 'F', 'f' -> {
			System.out.println("Do better next time!");
			System.out.println("You get a star!");
			yield "Failing";
		}

		default -> "Invalid Grade";
		};
		System.out.println(comment);

//		if(grade =='A') {
//			System.out.println("Excellent");
//		} else if (grade == 'B') {
//			System.out.println("Good");
//		} else if (grade == 'C') {
//			System.out.println("Average");
//		} else if (grade == 'D') {
//			System.out.println("Needs improvement");
//		} else if (grade == 'F') {
//			System.out.println("Failing");
//		} else {
//			System.out.println("Invalid Grade");
//		}

	}

}
