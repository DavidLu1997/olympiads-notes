public class q7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double side1, side2, hyp;

		side1 = input.nextDouble();
		side2 = input.nextDouble();

		hyp = Math.sqrt(side1 * side1 + side2 * side2);

		System.out.println("Hypotenuse: " + hyp);
	}
}