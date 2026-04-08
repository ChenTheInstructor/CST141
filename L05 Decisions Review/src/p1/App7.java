package p1;

import java.util.Scanner;

public class App7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the three sides of a triangle as whole numbers: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if((a + b) <= c || (a + c) <= b || (b + c) <= a) {
			System.out.println("Invalid triangle.");
		} else if(a == b & a == c & b == c){
			System.out.println("Equilateral triangle.");
		} else if(a == b || a == c || b == c) {
			System.out.println("Isosceles triangle.");
		} else {
			System.out.println("Scalene triangle.");
		}
	}

}
