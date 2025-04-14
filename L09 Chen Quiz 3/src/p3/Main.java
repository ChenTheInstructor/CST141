package p3;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String name1 = getName();
		String major1 = getMajor();
		int age1 = getAge();
		
		scanner.nextLine();
		
		String name2 = getName();
		String major2 = getMajor();
		int age2 = getAge();

		printHeader();
		printDetails(name1, major1, age1);
		printDetails(name2, major2, age2);
	}

	private static void printDetails(String name, String major, int age) {
		System.out.printf("%-20s%-30s%-20d%n", name, major, age );
	}

	private static void printHeader() {
		System.out.printf("%-20S%-30S%-20S%n", "Name", "Major", "Age");
	}

	private static int getAge() {
		System.out.println("Enter an age: ");
		return scanner.nextInt();
	}

	public static String getMajor() {
		System.out.println("Enter a major: ");
		return scanner.nextLine();
	}

	public static String getName() {
		System.out.println("Enter a name: ");
		return scanner.nextLine();
	}

}
