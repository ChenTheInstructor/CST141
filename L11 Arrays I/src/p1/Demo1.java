package p1;

import java.util.Arrays;
import java.util.Random;

public class Demo1 {

	public static void main(String[] args) {
		int[] ages = new int[10000];
		ages[0] = 21;
		ages[1] = 22;
		ages[2] = 19;
		
		System.out.println(ages.length);

		double[] gpas1 = new double[10];
		double[] gpas2 = { 1.1, 3.2, 4.0, 2.6, 3.5 };
		double[] gpas3 = new double[] {1.6, 2.1, 3.5};
		
//		System.out.println(gpas3[0]);
//		System.out.println(gpas3[1]);
//		System.out.println(gpas3[2]);
//		
		for(int i = 0; i < ages.length / 1000; i++) {
			System.out.print(ages[i] + " ");
		}
		
//		System.out.println(gpas3[3]);
		
//		System.out.println(gpas1.length);
//		System.out.println(gpas2.length);
//		System.out.println(gpas3.length);
		
//		System.out.println(Arrays.toString(gpas3));
		
//		System.out.println(gpas1[gpas1.length - 1]);

//		System.out.println(ages[0]);
//		System.out.println(ages[ages.length - 1]);
	}

}
