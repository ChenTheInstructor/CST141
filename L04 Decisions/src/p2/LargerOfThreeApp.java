package p2;

import java.util.Scanner;

public class LargerOfThreeApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three integers: ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		System.out.println(n1 + ", " + n2 + ", " + n3);

		if (n1 <= n2 && n1 >= n3 || n1 <= n3 && n1 >= n2) {
			System.out.println("The middle number is: " + n1);
		} else if (n2 <= n1 && n2 >= n3 || n2 >= n1 && n2 <= n3) {
			System.out.println("The middle number is: " + n2);
		} else {
			System.out.println("The middle number is: " + n3);
		}
	}

}
