package p2;

public class Dog {
	// instance fields
	private String name;
	private double weight;

	// static field
	private static String breed;// = "Golden";

	// overloaded constructors: used to create objects
	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
		breed = "Golden";
	}
	
	public Dog() { // no-arg constructor
		name = "Max";
		weight = 0.0;
		breed = "Golden";
	}
	
	// instance methods: setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	// static method
	public static void setBreed(String breed) {
		Dog.breed = breed;
	}
	
	public static String getBreed() {
		return breed;
	}

	public String toString() {
		return name + ": " + weight + ", " + breed;
	}
}
