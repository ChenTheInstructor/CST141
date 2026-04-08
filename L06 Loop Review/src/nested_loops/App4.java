package nested_loops;

public class App4 {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			if (row == 3) {
				continue;
			}
			for (int col = 1; col <= 5; col++) {
				if (col == 2) {
					continue;
				}
				System.out.print(row + " x " + col + " = " + (row * col) + "\t");
			}

			System.out.println();

		}
	}

}
