package exam_review_coding_problems;

public class Main6 {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 7, 9, 21, 34 };
		int valueToFind = 1;
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == valueToFind) {
				System.out.println("The value is found at index " + i);
				return;

			}
		}
//		if (i == arr.length) {
			System.out.println(-1);
//		}
	}

}
