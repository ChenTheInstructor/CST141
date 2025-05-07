package p5_do_while;

import java.util.Scanner;

public class LoginApp {
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "pass123";

	public static void main(String[] args) {
		login();
	}

	private static void login() {
		boolean isValid;
		do {
			String username = getAccountInfo("username");
			String password = getAccountInfo("password");
			isValid = isValidAccount(username, password);
			showMessage(isValid);
		} while (!isValid);
	}

	private static void showMessage(boolean isValid) {
		if (isValid) {
			System.out.println("Login Success!");
		} else {
			System.out.println("Login Failure!");
		}
	}

	private static boolean isValidAccount(String username2, String password2) {
		return (password2.length() >= 6 && username2.equalsIgnoreCase(USERNAME) && password2.equals(PASSWORD));
	}

	private static String getAccountInfo(String flag) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your " + flag + ": ");
		return scanner.nextLine();
	}

}
