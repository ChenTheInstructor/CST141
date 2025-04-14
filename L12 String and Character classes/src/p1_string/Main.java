package p1_string;

public class Main {

	public static void main(String[] args) {
		String str1 = "ai"; // an String object is created. Note it is created using intern
		String str2 = "ai"; // because of intern, no new object is created.
		// at this point, there is only one String object, whose address is stored in str1 and str2
		// it is shallow copy, meaning address gets copied. but not new object is created.
		
		System.out.println(str1 == str2); // == is used to compare the addresses stored in the two variables
	
		String str3 = new String("a"); // second String object created
		System.out.println(str1 == str3); // false
		System.out.println(str2 == str3); // false
		
		// equals() method: allowing you to compare the content of two objects
		System.out.println(str1.equalsIgnoreCase(str3)); // true because both objects have the same content "Hi"
		
		// equals() method can only be used to determine equality
		// to determine the sizes, you use the compareTo() method
		int result = str1.compareTo(str3); // positive: str1 bigger; negative: str1 smaller; zero: the same
		System.out.println(result);
		
		// length(): returns the length of the string
		System.out.println(str1.length());
		// toUpperCase() // toLowerCase()
		
		System.out.println(str1.toUpperCase());
		// charAt(): capture one single character at the index location
		System.out.println("hello".charAt("hello".length() - 1));
		// substring()
		System.out.println("hello".substring(2, 4));
		// indexOf(), lastIndexOf()
		System.out.println("hello Bye".indexOf("l"));
		
	}

}
