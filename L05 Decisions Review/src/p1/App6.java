package p1;

import java.util.Scanner;

public class App6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a color (red, yellow, or green): ");
		String color = scanner.nextLine().toLowerCase();

		switch (color) {
		case "red"->
			System.out.println("Stop");
//			break;
		case "yellow"->
			System.out.println("Caution");
//			break;
		case "green"->
			System.out.println("Go");
//			break;
		default->
			System.out.println("Invalid color.");
		}
	}

}
