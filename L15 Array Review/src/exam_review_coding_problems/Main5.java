package exam_review_coding_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		int[] arr = getTenNumbersInArray();
		showArray(arr);
	}

	private static void showArray(int[] arr) {
//		for (int n : arr) {
//			System.out.print(n + " ");
//		}
		System.out.println(Arrays.toString(arr));
	}

	private static int[] getTenNumbersInArray() {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter integer " + (i + 1) + ": ");
			arr[i] = scanner.nextInt();
		}

		return arr;
	}

}
