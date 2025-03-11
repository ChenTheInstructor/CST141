package p1;

public class Dog {
	// instance fields: each may have a different value for different object
	private String name;
	private double weight;
	
	// static fields: each holds one value for the entire class. It belongs to the class
	private static String breed;
	
	
	public void feed(int foodAmount) {
		double weightGain = foodAmount / 10.0;
		weight = weight + weightGain;
	}
	
	public double getWeight() {
		return weight;
	}
}
