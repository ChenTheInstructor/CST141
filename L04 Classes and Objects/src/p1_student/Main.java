package p1_student;

public class Main {

	public static void main(String[] args) {
//		System.out.println(Double.MAX_VALUE);
//		System.out.println(Float.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Long.MIN_VALUE);
//		System.out.println(Short.MIN_VALUE);
//		System.out.println(Byte.MIN_VALUE);
		
		Student s1 = new Student();
		s1.name = "Jose";
		s1.gpa = 3.5;
		s1.curveGpa(0.2);
		System.out.println(s1.name + ": " + s1.gpa);
		
		Student s2 = new Student();
		s2.name ="Maria";
		s2.gpa = 2.9;
		s2.curveGpa(-0.3);
		System.out.println(s2.name + ": " + s2.gpa);
	}

}
