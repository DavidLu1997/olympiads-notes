public class q8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double side1, side2, side3;

		side1 = input.nextDouble();
		side2 = input.nextDouble();
		side3 = input.nextDouble();

		double s = (side1 + side2 + side3) / 2.0;

		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		System.out.println("Area: " + area);
	}
}