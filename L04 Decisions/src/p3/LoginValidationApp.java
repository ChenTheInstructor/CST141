package p3;

import java.util.Scanner;

public class LoginValidationApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your username and password: ");
		String username = scanner.next();
		String password = scanner.next();
		
		if(username.equalsIgnoreCase("admin") && password.equals("Secret#")) {
			System.out.println("You logged in successfully!");
		} else {
			System.out.println("Either username or password is not correct.");
		}
	}

}
