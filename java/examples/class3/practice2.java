import java.util.Scanner;

public class practice2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		double a, b, c, d, e, f;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();

		double x = (b * f / e - c) / (a - b * d / e);
		double y = (-1 * f - d * x) / e;

		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}
}