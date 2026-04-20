package p3;

import java.util.Scanner;

public class Grader {
	
	// Write a method named convertGradeToScore. The parameter is of the char type of either 
	// A, B, C, D or F. The method returns a score range accordingly
	
	public static String convertGradeToScore(char grade) {
		String range = switch(grade) {
		case 'A' -> "90 -- 100";
		case 'B' -> "80 -- 89";
		case 'C' -> "70 -- 79";
		case 'D' -> "60 -- 69";
		case 'F' -> "below 60";
		default -> "No such letter grade.";
		};
		return range;
	}
	
	public static char getLetterGrade() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a letter grade: ");
		String letterGrade = scanner.nextLine().toUpperCase();
		char grade = letterGrade.charAt(0);
		return grade;
	}
	
	public static void grader(int times) {
		for (int i = 0; i < times; i++) {
			char letterGrade = getLetterGrade();
			String scoreRange = convertGradeToScore(letterGrade);
			System.out.println("The score range is: " + scoreRange);
		}
	}

	public static void main(String[] args) {
		
		grader(2);
	}

}
