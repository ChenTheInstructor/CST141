package p2_methods;

import java.util.Arrays;
import java.util.Random;

public class Demo2 {

	public static void main(String[] args) {
		String[] randomWords = createStringArray(3, 10, 20);
		for(String word : randomWords) {
			System.out.println(word);
		}
	}
	
	public static String getRandomWord(int min, int max) {
		String word = "";
		Random rand = new Random();
		int wordLength = rand.nextInt(min, max+1);
		for(int i = 0; i < wordLength; i++) {
			word += (char)rand.nextInt(97, 123);
		}
		return word.toUpperCase();
	}

	public static String[] createStringArray(int min, int max, int size) {
		String[] arr = new String[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = getRandomWord(min, max);
		}
		return arr;
	}
}
