package p4_seperate_class;

public class Main {

	public static void main(String[] args) {
//		System.out.println(Student.getCollegeName());
//		Student.setCollegeName("NCC");
//		System.out.println(Student.getCollegeName());
		
//		Student s1 = new Student();
//		s1.setName("Jose");
//		s1.setGpa(1.5);
//		System.out.println(s1);
		
		Student s2 = new Student("Suzy", 20, 4.0);
		s2.setName("Mary");
		System.out.println(s2);
		
	}

}
