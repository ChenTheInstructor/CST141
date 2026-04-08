package p1;

import java.util.Scanner;

public class App9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two strings: ");
		String s1 = scanner.next();
		String s2 = scanner.next();
		
		if(s1.equals(s2)) {
			System.out.println("They are the same strings");
		} else {
			System.out.println("They are different strings.");
		}
	}

}
