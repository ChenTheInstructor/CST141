package p2_forloop;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			
			if(i == 4) {
				break;
			}
			
			if (i % 2 == 0) {
				System.out.println("Hi" + "\t" + i);
			} 
			
		}
	}

}
