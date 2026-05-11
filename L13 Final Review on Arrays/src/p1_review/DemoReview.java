package p1_review;

import java.util.Arrays;
import java.util.Scanner;

public class DemoReview {

	public static void main(String[] args) {
		/*
		 * 1. What is an array? A data structure that can be used to store multiple
		 * values of the same type in one single variable name.
		 * 
		 * 2. How to create an array. There are two ways.
		 * a. int[] ages = new int[5];
		 * b. create an array by initializing it with values.
		 * 
		 * 3. Once an array is created, how to find out its size (length)
		 * arrayName.length
		 * 
		 * 4. How to access individual elements of an array
		 * 
		 * 5. How to display the content of an array
		 * a. Arrays.toString(arrayName);
		 * b. Use a for-loop to display each elements
		 * b.1: traditional for-loop
		 * b.2: enhanced for-loop
		 */
		
		int[] ages = new int[5]; // default values are 0s
		double[] gpas = new double[3]; // default values are 0.0s
		String[] names = new String[5]; // default values are nulls
		Scanner[] scanners = new Scanner[10]; // default values are null
		System.out.println(scanners[0]);
		
		int[] quizScores = {85, 75, 95, 25, 65, 100}; 
		
		System.out.println(ages.length);
		System.out.println(quizScores.length);
		
		System.out.println(quizScores[0]);
		System.out.println(quizScores[1]);
		System.out.println(quizScores[quizScores.length - 1]);
		
		quizScores[0] = 35;
		System.out.println(quizScores[0]);
		quizScores[quizScores.length - 1] = 0;
		System.out.println(quizScores[quizScores.length - 1]);
		
		System.out.println(Arrays.toString(quizScores));
		
		// for-loop to access the entire array
		for( int index = 0; index < quizScores.length; index++) {
//			System.out.print(quizScores[index] + " ");
			System.out.printf("%-5d", quizScores[index]);
		}
		System.out.println();
		
		System.out.println("Enhanced for loop result: ");
		for(int score : quizScores) {// each element of the arrays is to be stored in the
			System.out.printf("%-5d", score); // variable "score" once to be processed
		}
		System.out.println();
		
		String[] letterGrades = {"A", "B+","B", "C+", "C", "D+", "D", "F"};
		// The length of an array can never be changed
		for(String x : letterGrades) {
			System.out.println(x);
		}
	}

}
