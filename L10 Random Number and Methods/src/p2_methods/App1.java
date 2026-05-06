package p2_methods;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) { // caller
//		String name = getName();
//		int age = getAge();
//		double gpa = getGPA();
//		showInfo(name, age, gpa);// actual data are called arguments
//		// Important note: Java passes by value
		
		showInfo();
	}
	
	// overloaded methods
	// callee
	public static void showInfo(String x, int y, double z) {// placeholders are known as parameters
		System.out.printf("%-10s%10d%10.2f%n", x, y, z);
	}
	
	public static void showInfo() {
		String name = getName();
		int age = getAge();
		double gpa = getGPA();
		System.out.printf("%-10s%10d%10.2f%n", name, age, gpa);
		
		showInfo();
	}
	
	public static double getGPA() {
		Scanner scanner = new Scanner(System.in);
		double gpa;
		do {
			System.out.print("Enter your GPA: ");
			gpa = scanner.nextDouble();
		} while (gpa < 0.0 || gpa > 4.0);
		return gpa;
	}

	public static int getAge() {
		Scanner scanner = new Scanner(System.in);
		int age;
		do {
			System.out.print("Enter your age: ");
			age = scanner.nextInt();
		} while (age < 0 || age > 150);
		return age;
	}

	public static String getName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		return scanner.nextLine();
	}
}
