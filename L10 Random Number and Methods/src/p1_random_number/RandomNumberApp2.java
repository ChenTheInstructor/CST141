package p1_random_number;

import java.util.Random;

public class RandomNumberApp2 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println(rand.nextInt());
		
		for (int i = 0; i < 100; i++) {
			System.out.print(rand.nextInt(10) + " "); // 0 -- 99 inclusive
		}
		
		System.out.println();
		
		for (int i = 0; i < 50; i++) {
			System.out.print(rand.nextInt(10, 21) + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.println(rand.nextDouble(10.0, 100.0));
		}
	}

}
