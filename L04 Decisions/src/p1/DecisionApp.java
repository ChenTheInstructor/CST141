package p1;

import java.util.Scanner;

public class DecisionApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = scanner.nextInt();
		
		if(num > 0) {
			System.out.println("Positive.");
		} else if (num == 0) {
			System.out.println("Zero.");
		} else {
			System.out.println("Negative.");
		}
	}

}
