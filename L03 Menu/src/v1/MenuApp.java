package v1;

import java.util.Scanner;

public class MenuApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in); // create a Scanner object
		System.out.println("Enter the name of the restaurant: "); // prompt
		String name = kb.nextLine(); // Capturing data

		System.out.println("Enter its phone number: "); // prompt
		String phone = kb.nextLine(); // Capturing data

		
		int item = 1;
		
		System.out.println("Enter the name of dish " + item + ": ");
		String dish1 = kb.nextLine();

		System.out.println("Enter the price of dish " + item++ + ": ");
		double price1 = kb.nextDouble();

		kb.nextLine();

		System.out.println("Enter the name of dish " + item + ": ");
		String dish2 = kb.nextLine();

		System.out.println("Enter the price of dish " + item++ + ": ");
		double price2 = kb.nextDouble();

		kb.nextLine();

		System.out.println("Enter the name of dish " + item + ": ");
		String dish3 = kb.nextLine();

		System.out.println("Enter the price of dish " + item++ + ": ");
		double price3 = kb.nextDouble();

		int itemCount = 1;
		String format = "%-10d%10S%15.2f\n";
		
		System.out.println("\t" + name);
		System.out.println("\t " + phone);
		System.out.println("------------------------------");
//		System.out.println("\t" + dish1 + "\t\t" + price1);
//		System.out.println("\t" + dish2 + "\t\t" + price2);
//		System.out.println("\t" + dish3 + "\t\t" + price3);
		System.out.printf("%-10S%10S%15S\n", "No.", "Dish", "Price" );
		System.out.printf(format, itemCount, dish1, price1);
		System.out.printf(format, ++itemCount, dish2, price2);
		System.out.printf(format, ++itemCount, dish3, price3);
		
		
		System.out.println("------------------------------");
	}

}
