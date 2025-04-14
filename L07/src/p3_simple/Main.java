package p3_simple;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// prompt the user
		System.out.println("Enter a name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter an age: ");
		int age = scanner.nextInt();
		
		System.out.println("Enter a GPA: ");
		double gpa = scanner.nextDouble();
		
		System.out.printf("%-15S%10S%10S%n", "Name", "Age", "GPA");
		System.out.printf("%-15s%10d%10.2f%n", name, age, gpa);
	}

}
