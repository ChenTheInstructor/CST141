package p1_student;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Jose";
		s1.gpa = 3.5;
		System.out.println(s1.name);
		System.out.println(s1.gpa);
		s1.curveGPA(0.1);
		System.out.println(s1.gpa);
		
	}

}
