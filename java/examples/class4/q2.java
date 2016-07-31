public class q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius;

		radius = input.nextDouble();

		double area = Math.PI * radius * radius;
		double circumference = Math.PI * 2 * radius;

		System.out.println("Area: " + area);
		System.out.println("Circumference: " + circumference);
	}
}