package p5;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int n1 = getNumber();
		int n2 = getNumber();
		int n3 = getNumber();
		
		int largest = getLargestNumberOfThree(n1, n2, n3);
		int smallest = getSmallestNumberOfThree(n1, n2, n3);
		
		System.out.println(showResult(largest, smallest));
	}
	
	private static int showResult(int largest, int smallest) {
		if (largest > 2 * smallest) {
			return largest;
		} 
		return -1;
	
	}

	private static int getSmallestNumberOfThree(int n1, int n2, int n3) {
		int n4 = getSmallestNumberOfTwo(n1, n2);
		return getSmallestNumberOfTwo (n4, n3);
	}
	
	private static int getSmallestNumberOfTwo(int n1, int n2) {
		if(n1 < n2) {
			return n1;
		}
		return n2;
	}
	
	private static int getLargestNumberOfTwo(int n1, int n2) {
		if(n1 > n2) {
			return n1;
		}
		return n2;
	}

	private static int getLargestNumberOfThree(int n1, int n2, int n3) {
		int n4 = getLargestNumberOfTwo(n1, n2);
		return getLargestNumberOfTwo(n4, n3);
	}

	private static int getNumber() {
		System.out.print("Enter a number: ");
		return scanner.nextInt();
	}

}
