package p1;

import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// create a prompt
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();

		// create a prompt
		System.out.println("Enter your GPA: ");
		double gpa = scanner.nextDouble();

		// consume the enter key
		scanner.nextLine();
		
		// create a prompt
		System.out.println("Enter a name: ");
		String name = scanner.nextLine();

		System.out.println("The name is: " + name);
		System.out.println("The GPA is: " + gpa);
		System.out.println("The age is: " + age);
	}

}
