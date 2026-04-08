package p1;

import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = scanner.nextInt();
		
		if(num % 2 == 0 && (num >= 10 && num <= 100)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
		
	}

}
