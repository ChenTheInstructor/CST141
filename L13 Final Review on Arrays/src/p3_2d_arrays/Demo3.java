package p3_2d_arrays;

public class Demo3 {

	public static void main(String[] args) {
		int[] arr = new int[5]; // one-dimensional array: an array of int values

		/*
		 * A 2-dimensional array is an array of arrays
		 */

		int[] numbers = { 1, 2, 3, 4, 5 };

		int[][] numbers2 = { 	{ 11, 22, 33 }, 
								{ 10, 20, 30 }, 
								{ 100, 200, 300 }, 
								{ 500, 600, 700 } };
				
//		System.out.println(numbers2.length);
//		System.out.println(numbers2[0].length);
		
		// first row and first column
		System.out.println(numbers2[numbers2.length-1][numbers2[numbers2.length-1].length - 1]);
		
		String [][] names = new String[3][5];
		names[0][0] = "Adam";
		names[0][1] = "Bill";
		names[2][4] = "Suzy";
	}
}
