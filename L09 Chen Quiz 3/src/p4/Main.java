package p4;

public class Main {

	public static void main(String[] args) {
		Circle c1 = new Circle(1);
		System.out.println("The area is: " + c1.calculateArea());
		System.out.println("The circumference is: " + c1.calculateCircumference());
		
		System.out.println();
		
		Circle c2 = new Circle(10);
		System.out.println("The area is: " + c2.calculateArea());
		System.out.println("The circumference is: " + c2.calculateCircumference());
		
		System.out.println();
		
		Circle c3 = new Circle(100);
		System.out.println("The area is: " + c3.calculateArea());
		System.out.println("The circumference is: " + c3.calculateCircumference());
	}

}
