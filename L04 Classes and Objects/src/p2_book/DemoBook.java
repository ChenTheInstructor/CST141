package p2_book;

public class DemoBook {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.title = "Java";
		b1.price = 9.99;
		System.out.println(b1.title);
		System.out.println(b1.price);
		double newPrice = b1.discount(0.1);
		System.out.println("The discounted price: " + newPrice);
	}

}
