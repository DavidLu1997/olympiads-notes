public class q9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double side1, side2, angle;

		side1 = input.nextDouble();
		side2 = input.nextDouble();
		angle = input.nextDouble();

		// Convert to radians
		angle = angle / 180 * Math.PI;

		double side3 = Math.sqrt(side1 * side1 + side2 * side2 - 2 * side1 * side2 * Math.cos(angle));

		System.out.println("Side 3: " + side3);
	}
}