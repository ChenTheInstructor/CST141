package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter your GPA: ");
		double gpa = scanner.nextDouble();
		
		scanner.nextLine();
		
		System.out.print("Enter your major: ");
		String major = scanner.nextLine();
		
		System.out.printf("%-30s%-7s%-20s%n", "Name", "GPA", "Major");
		System.out.printf("%-30s%-7.2f%-20s%n", name, gpa, major);

	}

}
