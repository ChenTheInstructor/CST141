package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// input
		int speed = getSpeed();
		boolean isBirthday = isBirthday();
		issueTicket(speed, isBirthday);
		
		// process
		
		// output
	}

	private static void issueTicket(int speed, boolean isBirthday) {
		if(speed <=65 ) {
			System.out.println("You will NOT get a ticket.");
		} else if(isBirthday){
			System.out.println("You will NOT get a ticket.");
		} else {
			System.out.println("You will get a ticket.");
		}
	}

	private static boolean isBirthday() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Is today your birthday(true or false)? ");
		return scanner.nextBoolean();
	}

	private static int getSpeed() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your speed: ");
		return scanner.nextInt();
	}

	
}
