package p9;

public class Demo {

	public static void main(String[] args) {
		System.out.println("First product: ");
		Product p1 = new Product("Chalk", 1.50, 100);
		System.out.println(p1);
		System.out.println(p1.getTotalValue());
		double discountTotalAmount = p1.discountTotal(10);
		System.out.println(discountTotalAmount);
		
		System.out.println("\n\nSecond product: ");
		Product p2 = new Product("Eraser", 10.00);
		p2.setQuantity(100);
		System.out.println(p2);
		System.out.println(p2.getTotalValue());
		discountTotalAmount = p2.discountTotal(20);
		System.out.println(discountTotalAmount);
		
	}

}
