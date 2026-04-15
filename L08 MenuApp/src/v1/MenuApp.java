package v1;

import java.util.Scanner;

public class MenuApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String dish1 = "";
		double price1 = 0.0;
		String dish2 = "";
		double price2 = 0.0;
		String dish3 = "";
		double price3 = 0.0;
		
		for (int i = 0; i < 3; i++) {
			
			System.out.print("Enter dish name: ");
			String dish = scanner.nextLine();
			
			System.out.print("Enter its price: ");
			double price = scanner.nextDouble();
			scanner.nextLine(); // consume the line-breaker after entering the number
		
			switch(i) {
			case 0: dish1 = dish; price1 = price; break;
			case 1: dish2 = dish; price2 = price; break;
			case 2: dish3 = dish; price3 = price; break;
			}
		}
		
		showMenu(dish1, price1, dish2, price2, dish3, price3);
		
		showMenu("Eggs", 5.99, "Ice Cream", 4.99, "Salad", 19.99);
	}
	
	// A method is a named block of code that performs a task.
	public static void showMenu(String dish1, double price1, String dish2, double price2, String dish3, double price3) {
		String name = "ABCDEF CAFE";
		String phone = "(631)123-4567";
		int itemCount = 1;
		String format = "%-10d%10S%15.2f\n";
		
		System.out.println("\t" + name);
		System.out.println("\t " + phone);
		System.out.println("------------------------------");
		System.out.printf("%-10S%10S%15S\n", "No.", "Dish", "Price" );
		System.out.printf(format, itemCount, dish1, price1);
		System.out.printf(format, ++itemCount, dish2, price2);
		System.out.printf(format, ++itemCount, dish3, price3);
		
		
		System.out.println("------------------------------");
	}

}
