package exam_review_coding_problems;

public class Main3 {

	public static void main(String[] args) {
		String[] arr = createIntArray();

		String[] reversedArr = reverseArray2(arr);

		showArray(reversedArr);
	}

	private static String[] createIntArray() {
		String[] arr = { "Adam", "Bill", "Cathy", "Dave", "Ellen", "Frank" };
		return arr;
	}

	public static String[] reverseArray2(String[] arr) {
		int i = 0; // first index
		
		for (i = 0; i < arr.length / 2; i++) {
			int lastIndex = arr.length - 1 - i;
			String temp = arr[lastIndex];
			arr[lastIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	private static void showArray(String[] reversedArr) {
		for (int i = 0; i < reversedArr.length; i++) {
			System.out.print(reversedArr[i] + " ");
		}
	}

	private static int[] reverseArray(int[] arr) {
		int[] reversedArr = new int[arr.length];
		for (int i = 0; i < reversedArr.length; i++) {
			reversedArr[i] = arr[arr.length - 1 - i];
		}

		return reversedArr;
	}

}
