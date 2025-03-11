package p1;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter the age: ");
		int age = scanner.nextInt();
		
		System.out.println("Enter the GPA: ");
		double gpa = scanner.nextDouble();
		
		
		System.out.printf("%-10S%15S%15S%n", "Name", "Age", "GPA");
		System.out.println("----------------------------------------------");
		System.out.printf("%-10S%15d%15.1f%n", name, age, gpa);
		System.out.printf("%-10S%15d%15.1f%n", "Samantha", (20+1), 3.599999);
		System.out.println("----------------------------------------------");
	}
}
