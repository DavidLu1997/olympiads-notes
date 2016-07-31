public class q6 {
	public static void main (String[] args) {
		double price = 12.49;
		double taxRate = 0.13;
		double taxPaid = price * taxRate;
		double paid = 20.00;
		double change = paid - (price + taxPaid);

		System.out.println("Bill of Sale");
		System.out.println("-----------------------------------------");
		System.out.println("T-Shirt\t\t$" + price);
		System.out.println("Tax (" + taxRate * 100 + "% HST)\t$" + taxPaid);
		System.out.println("Paid\t\t$" + paid);
		System.out.println("Change\t\t$" + change);
	}
}