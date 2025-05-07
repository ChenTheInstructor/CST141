package exam_review_coding_problems;

public class Main9 {

	public static void main(String[] args) {
		int[] arr = {2, 5, 3, 7, 4};
		int largest = largest(arr);
		System.out.println(largest);
	}

	private static int largest(int[] arr) {
		int largest = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}

}
