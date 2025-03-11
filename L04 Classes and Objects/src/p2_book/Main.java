package p2_book;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Book b2 = new Book();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the price: ");
		b2.price = scanner.nextDouble();
		// consumes the enter key in the buffer
		scanner.nextLine();
		
		System.out.println("Enter the title: ");
		b2.title = scanner.nextLine();
		
		System.out.println("Enter the discount amount: ");
		double discountAmount = scanner.nextDouble();
		
		System.out.printf("%-20s%15s%15s%15s%n", "Title", "Price", "Dis.Amt.", "DiscPrice");
		System.out.println("---------------------------------------------------------------------");
		System.out.printf("%-20s%15.2f%15.2f%15.2f%n", b2.title, b2.price, discountAmount, b2.discount(discountAmount));
	}

}
