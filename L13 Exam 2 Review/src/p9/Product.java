package p9;

public class Product {
	
	// fields
	private String name;
	private double price;
	private int quantity;
	
	// methods: constructors, getters, setter, toString
	//overloaded constructors
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = 0; //  optional
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return "Name: " + name + ", Price: " + price + ", Quantity: " + quantity;
	}
	
	public double getTotalValue() {
		return price * quantity;
	}
	
	public double discountTotal(double percentage) {
//		return price * quantity - (price* quantity * percentage / 100);
		double totalValue = price * quantity;
		double discountAmount = totalValue * percentage / 100;
		double discountTotalAmount = totalValue - discountAmount;
		return discountTotalAmount;
	}
}

