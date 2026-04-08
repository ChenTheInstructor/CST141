package do_while_loop;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String password;
		do {
			System.out.print("Enter a password: ");
			password = input.nextLine();
		} while (!password.equals("java123"));
		System.out.println("The password is correct!");
		
		
//		int number = 10;
//		do {
//			System.out.print("This is unnecessary. Enter a positive number: ");
//			number = input.nextInt();
//		} while(number <= 0);
//		System.out.println("The number you entered is: " + number);
	}

}
