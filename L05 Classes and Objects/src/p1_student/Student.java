package p1_student;

public class Student {
	// Fields
	String name;
	double gpa;
	
	// methods
	public void curveGPA(double curveAmount) {
		gpa = gpa + curveAmount;
	}

}
