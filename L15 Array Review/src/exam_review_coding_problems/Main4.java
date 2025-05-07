package exam_review_coding_problems;

public class Main4 {

	public static void main(String[] args) {
		int[] arr = createArray();

		int n = getEvenCount(arr);

		showResult(n);

//		int[] arr = {2, 5, 8, 3, 6, 9, 4, 7};
//		
//		int count = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % 2 == 0) {
//				count++;
//			}
//		}
//		System.out.println("There are " + count + " even numbers.");
	}

	private static void showResult(int n) {
		System.out.println("There are " + n + " even numbers.");

	}

	private static int getEvenCount(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	private static int[] createArray() {
		int[] arr = { 2, 5, 8, 3, 6, 9, 4, 7 };
		return arr;
	}

}
