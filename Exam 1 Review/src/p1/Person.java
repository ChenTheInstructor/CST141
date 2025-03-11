package p1;

public class Person {
	private String name;
	private int age;
	
	public int calculateFutureAge(int yearsInFuture) {
		return age + yearsInFuture;
	}
	
	public int getFutureAge() {
		return age;
	}
}
