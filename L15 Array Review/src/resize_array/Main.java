package resize_array;

public class Main {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
		int[] numbers2 = reverse(numbers);
		
		numbers = resize(numbers);
		
		for(int n : numbers2) {
			System.out.print(n + " ");
		}
		
//		//resize an array
//		int[] newArr = new int[numbers.length * 2];
//		// what is stored in the varaible newArr?
//		// answer: the address of the new array. Because an array is always an object. 
//		// so its type is always a reference type. Its size is always 8 bytes.
//		// Question 2: What is stored in the newArr array?
//		// answer: 10 zeros
//		int i = 0;
//		for (int n : numbers) {
//			newArr[i++] = n; // use post-increment
////			i++;
//		}
//		numbers = newArr;
//		
//		System.out.println(numbers.length);
		
	}

	private static int[] reverse(int[] numbers) {
		int[] newArr = new int[numbers.length];
		for(int i = 0; i < numbers.length; i ++) {
			newArr[numbers.length-1 - i] = numbers[i];
		}
		return newArr;
	}

	private static int[] resize(int[] numbers) {
		int[] newArr = new int[numbers.length * 2];
		int i = 0;
		for(int n : numbers) {
			newArr[i++] = n;
		}
		numbers = newArr;
		return numbers;
	}

}
