package p10;

public class Main {

	public static void main(String[] args) {
		Book book1 = new Book("Java", "John Doe", 600);
		System.out.println(book1);
		System.out.println(book1.shortDescription());
		System.out.println("Is it a long book: " + book1.isLongBook());
	}

}
