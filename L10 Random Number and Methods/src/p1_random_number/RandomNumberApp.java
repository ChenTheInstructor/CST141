package p1_random_number;

public class RandomNumberApp {

	public static void main(String[] args) {
		System.out.println(Math.random());
		
		System.out.println(Math.random() * 100);
		
		System.out.println((int)(Math.random() * 100));
		
		System.out.println((int)(Math.random() * 51) + 50);
		
		for (int i = 0; i < 20; i++) {
			System.out.print((int) (Math.random() * 3) + 1 + " ");
		}
		
		System.out.println("These are even numbers between 0 and 10: ");
		for (int i = 0; i < 50; i++) {
			System.out.print(getRandomEven() + " ");
		}
	}
	
	public static int getRandomEven() {
		int num = (int)(Math.random() * 11);
		while(num % 2 != 0) {
			num = (int)(Math.random() * 11);
		}
		return num;
	}

}
