package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Rectangle length: ");
		int l = scanner.nextInt();
		System.out.print("Rectangle width: ");
		int w = scanner.nextInt();
		Rectangle r1 = new Rectangle(l, w);
		System.out.println("Area of rectangle: " + r1.getArea());
	}

}
