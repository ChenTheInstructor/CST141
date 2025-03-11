package p1;

import java.util.Scanner;
// variables are memory locations used to store data
// methods are actions performed by an object

// class header
// public: access modifier for public access
// private: for local class (the class itself) access
// default: for programs inside the same package to access.aka package access
public class DemoObjectCreation {
	
	// main method
	public static void main(String[] args) {
		// Scanner(System.in): known as constructor
		Scanner /*(class)*/ scanner = new Scanner(System.in);// a Scanner object is created
		// Objects are needed because they are used to perform actions
		// prompt the user
		System.out.println("Enter a name: ");
		// the part after object name and dot is called a method
		// methods are used to perform action
		String name = scanner.nextLine(); // allows capturing a string from keyboard (System.in)
		
		System.out.println("Enter your age: "); // a prompt
		int age = scanner.nextInt(); //allows capturing an integer from keyboard (System.in)
		
		System.out.println("Enter your GPA: "); // a prompt
		double gpa = scanner.nextDouble(); //allows capturing a double number from keyboard (System.in)
		
		// to display what is captured and stored in name:
		System.out.println("The name is: " + name);
		System.out.println("The age is: " + age);
		System.out.println("The GPA is: " + gpa);
		scanner.close();// optional
	}

}
