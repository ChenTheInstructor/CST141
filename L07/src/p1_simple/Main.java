package p1_simple;

import java.util.Scanner;

public class Main {
	// for any tasks that are simple, just code in the main method
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//prompt the user
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter first score: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter second score: ");
		int num2 = scanner.nextInt();
		
		int average = (num1 + num2) / 2;
		
		System.out.println("Hey " + name +", your average score is " + average);
		
		scanner.close();
	}

}
