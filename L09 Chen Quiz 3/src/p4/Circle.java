package p4;

public class Circle {
	private double radius;
	
	private static final double PI = 3.14159;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		return PI * radius * radius;
	}
	
	public double calculateCircumference() {
		return 2 * PI * radius;
	}
}
