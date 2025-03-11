package p2_book;

import java.time.LocalDate;

public class Book {
	// instance fields
	private String title;
	private double price;
	
	// methods
	public double discount(double discountAmount) {
		return price - (price * discountAmount);
	}
}
