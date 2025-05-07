package p3_for_loop_review;

public class Main2 {

	public static void main(String[] args) {
		// Use for-loop to print all the even numbers from 0 to 100 on the same line
		// separated by spaces
		int accumulator = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0 && !(i % 10 == 0)) {
				
				System.out.print(i + " ");
				accumulator = accumulator + i;
			}
		}
		System.out.println("\nThe total of the even numbers is: " + accumulator);
	}

}
