package exam_review_coding_problems;

import java.util.Arrays;

public class Main8 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		int[] newArr = rightShift(arr);

		System.out.println(Arrays.toString(newArr));
	}

	private static int[] rightShift(int[] arr) {
		int temp = arr[arr.length - 1];

		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
		return arr;
	}

}
