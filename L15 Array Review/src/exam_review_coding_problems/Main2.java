package exam_review_coding_problems;

public class Main2 {

	public static void main(String[] args) {
		int[] scores = {60, 170, 8, 249, 10};
		
		int minimum = getMin(scores);
		int maximum = getMax(scores);
		
		System.out.println("The minimum value is: " + minimum);
		System.out.println("The maximum value is: " + maximum);
		
	}

	private static int getMax(int[] scores) {
		int maxValue = scores[0];
		for(int i = 1; i < scores.length; i++) {
			if(maxValue < scores[i]) {
				maxValue = scores[i];
			}
		}
		return maxValue;
	}

	private static int getMin(int[] scores) {
		int minValue = scores[0];
		for(int i = 1; i < scores.length; i++) {
			if(minValue > scores[i]) {
				minValue = scores[i];
			}
		}
		return minValue;
	}

}
