package p2_random;

import java.util.Random;

public class RandomApp {

	public static void main(String[] args) {
		Random rand = new Random(100);
		for (int i = 0; i < 10000; i++) {
			int n = rand.nextInt(50, 101);
			System.out.println(n);
			if(n == 99) {
				System.out.println("Found 99");
			} else if (n == 100) {
				System.out.println("Found 100");
			} 
		}
	}

}
