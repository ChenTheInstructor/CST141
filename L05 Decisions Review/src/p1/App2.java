package p1;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

//		switch (age) {
//		case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
//			System.out.println("Child");
//			break;
//		case 13, 14, 15, 16, 17:
//			System.out.println("Teen");
//			break;
//		case 18, 19, 20, 21, 22,
//		}

		if(age < 0 || age > 150) {
			System.out.println("Invalid age entered.");
		} else if(age < 13) {
			System.out.println("Child");
		} else if (13 <= age && age < 18) {
			System.out.println("Teen");
		} else if (age >= 18 && age < 65) {
			System.out.println("Adult");
		} else {
			System.out.println("Senior");
		}
	}

}
