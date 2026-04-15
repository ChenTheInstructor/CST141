package p1_math;

public class MathApp {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 10000; i++) {
			int n = (int) (Math.random() * 11) + 10;
			if(n >= 0 && n <= 20) {
				System.out.println(n + ": " + ++count);
			}
			
		}
	}

}
