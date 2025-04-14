package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// input
		double fahrenheit1 = getFahrenheit();
		double fahrenheit2 = getFahrenheit();
		
		
		// process
		double celsius1 = calculateCelsius(fahrenheit1);
		double celsius2 = calculateCelsius(fahrenheit2);
		
		// output
		printTableHeader();
		printTemperatures(fahrenheit1, celsius1);
		printTemperatures(fahrenheit2, celsius2);
	}
		
	public static void printTemperatures(double fahrenheit, double celsius) {
		System.out.printf("%15.2f%15.2f%n", fahrenheit, celsius);
	}
	
	public static void printTableHeader() {
		System.out.printf("%15s%15s%n", "Fahrenheit", "Celsius");
	}
	
	public static double calculateCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
	
	public static double getFahrenheit() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Fahrenheit degree: ");
		return scanner.nextDouble();
	}

}
