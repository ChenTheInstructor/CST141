package p11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String username = getUsername();
		boolean startsWithLowerCase = startsWithLowerCaseLetter(username);
		System.out.println(startsWithLowerCase);
	}
	

	private static boolean startsWithLowerCaseLetter(String username) {
		return username.charAt(0) >= 'a' && username.charAt(0) <= 'z';
	}


	private static String getUsername() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a username: ");
		return scanner.nextLine();
	}

}
