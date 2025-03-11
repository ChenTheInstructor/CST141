package p1_student;

public class Student {
	// instance fields, Notice the blue color: instance field (meant to store data for an object)
	// default access / package access
	String name;
	double gpa;
	
	// methods without return data type (hence void)
	// default access / package access
	void curveGpa(double curveAmount) {
		gpa = gpa + curveAmount;
	}
}
