public class q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double f;

		f = input.nextDouble();

		double c = (f - 32) * (5.0 / 9.0);
		System.out.println("Celsius: " + c);
	}
}