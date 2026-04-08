package p1;

import java.util.Scanner;

public class App8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = scanner.nextLine().toUpperCase().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("A Letter.");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("A digit.");
		} else {
			System.out.println("Not a letter nor a digit.");
		}

	}

}
