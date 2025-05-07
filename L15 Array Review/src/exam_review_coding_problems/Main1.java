package exam_review_coding_problems;

public class Main1 {

	public static void main(String[] args) {
		double[] scores = {60.0, 70.0, 80.0, 90.0, 100};
		double average = getAverage(scores);
		System.out.println("The average score is: " + average + ".");
	}

	private static double getAverage(double[] scores) {
		// to calculate the average, you need to calculate the total score and the number of scores
		int numScore = scores.length;
		double totalScore = 0;
		for(double score : scores) {
			totalScore += score;
		}
		
		return totalScore / numScore;
	}

}
