package do_while_loop;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int itemCount;
		int choice;
		do {
			itemCount = 1;
			String format = "%-10d%10S%15.2f\n";

			System.out.println("\t" + "  ABC-SCCC CAFE");
			System.out.println("\t " + "(631) 123-4567");
			System.out.println("------------------------------");
			System.out.printf("%-10S%10S%15S\n", "No.", "Dish", "Price");
			System.out.println("------------------------------");
			System.out.printf(format, itemCount, "FISH", 19.99);
			System.out.printf(format, ++itemCount, "VEGGIE", 9.99);
			System.out.printf(format, ++itemCount, "BEEF", 11.99);
			System.out.printf("%-10d%10S%n", ++itemCount, "EXIT");

			System.out.println("------------------------------");

			System.out.print("Pick your choice between 1 and " + itemCount + ": ");
			choice = input.nextInt();

		} while (choice != itemCount);

	}

}
