package exam_review_coding_problems;

import java.util.Arrays;

public class Main7 {

	public static void main(String[] args) {
		double[] arr = {1.1, 2.2, 3.3, 4.4, 5.5};
		double[] newArr = copyArray(arr);
		System.out.println(Arrays.toString(newArr));
	}
	
	public static double[] copyArray(double[] arr) {
		double[] newArr = new double[arr.length];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}

}
