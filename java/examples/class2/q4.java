public class q4 {
	public static void main (String[] args) {
		int hours = 40;
		double rate = 5.00;
		double insurance = 2.00;
		double taxRate = 0.22;

		double netPay = (hours * rate - insurance) - taxRate * (hours * rate - insurance);

		System.out.println("The employee's net pay is $" + netPay);
	}
}