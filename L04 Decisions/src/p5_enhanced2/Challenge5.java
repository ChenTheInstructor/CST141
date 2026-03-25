package p5_enhanced2;

import java.util.Scanner;

public class Challenge5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balance = 1000.00; // initial balance
		showMenu();
		int choice = scanner.nextInt();

		String message = switch (choice) {
		case 1 -> String.format("The balance is: $%.2f%n", balance);

		case 2 -> {
			System.out.print("Enter the deposit amount: ");
			double deposit = scanner.nextDouble();
			balance += deposit;
			yield String.format("The balance is: $%.2f%n", balance);
		}
		case 3 -> {
			System.out.print("\tEnter withdrawal amount: ");
			double withdraw = scanner.nextDouble();
			if (withdraw > balance) {
				yield "\tError! Insufficent funds.";
			} else {
				balance -= withdraw;
				yield String.format("\tYour new balance is: $%.2f%n", balance);
			}
		}
		case 4 -> "Goodbye!";
		default -> "Invalid choice.";
		};
		System.out.println("\t" + message);
	}

	public static void showMenu() { // custom method
		System.out.println("\n\t---ATM Menu");
		System.out.println("\t1. Check Balance");
		System.out.println("\t2. Deposit");
		System.out.println("\t3. Withdraw");
		System.out.println("\t4. Exit");
		System.out.print("\n\tSelect an option: ");
	}

}
