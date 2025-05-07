package p4_while_loop;

public class Main {

	public static void main(String[] args) {
		int count = 0; // declare a count, initialize it to be zero
		while (count < 10) {
			if((count % 3 == 0 || count % 4 == 0)) {
				System.out.print(count + " ");
			}
			count++;
		}
	}

}
