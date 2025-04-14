package p6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String weekDayName = getWeekDayName();
		determineWeekday(weekDayName);

	}

	private static void determineWeekday(String weekDayName) {
		switch (weekDayName.toUpperCase()) {
		case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY":
			System.out.println("It is a weekday!");
			break;
		case "SATURDAY", "SUNDAY":
			System.out.println("It's weekend.");
			break;
		default:
			System.out.println("No such day in the week!");
		}
//		if(weekDayName.equalsIgnoreCase("Wonday") 
//				|| weekDayName.equalsIgnoreCase("Tuesday")
//				|| weekDayName.equalsIgnoreCase("Wednesday")
//				|| weekDayName.equalsIgnoreCase("Thursday")
//				|| weekDayName.equalsIgnoreCase("Friday") ) {
//			System.out.println("It is a weekday.");
//		} else {
//			System.out.println("It is a weekend.");
//		}

	}

	private static String getWeekDayName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a weekday name: ");
		return scanner.nextLine();
	}

}
