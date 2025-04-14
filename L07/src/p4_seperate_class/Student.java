package p4_seperate_class;

public class Student {
	// instance fields
	private String name;
	private int age;
	private double gpa;
	
	// static fields
	private static String collegeName = "SCCC";
	
	// methods
	// constructor method used to build objects
	// overloaded constructors. They differ only in parameters
	public Student() {
		name = "John Doe";
		age = 18;
		gpa = 0.0;
	}
	
	public Student(String name, int age, double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
	
	// setters and getters

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}
	
	public String toString() {
		return name + ": " + age + ", " + gpa + ", " + collegeName;
	}
}
