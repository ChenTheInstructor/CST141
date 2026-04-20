package p1;

public class MethodTemplatesDemo {

	public static void main(String[] args) { // caller
		sayHi(); // no arguments and no return value
		displayMessage("10"); // with arguement but without return value
//		String result = formatGreeting("John Doe");
//		System.out.println(result);
		System.out.println(formatGreeting("Joe"));
		System.out.println(getStandardGreeting());
	}
	
// template 1: no parameter and no return value
	public static void sayHi() {  // callee
		System.out.println("Hi");
	}
	
// template 2: with parameters and no return value
	public static void displayMessage(String str) {
		System.out.println(str);
	}
	
// template 3: with parameters and with return value
	public static String formatGreeting(String n) {
		return "Good monring, " + n;
	}
	
// template 4: withn no parameter and with return value
	public static String getStandardGreeting() {
		return "Good morning!";
	}
}
