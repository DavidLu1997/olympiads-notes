import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double d = input.nextDouble();
		double v = input.nextDouble();
		double rho = input.nextDouble();
		double mu = input.nextDouble();

		double num = d * v * rho / mu;

		System.out.println(num);

		if (num < 2000) {
			System.out.println("Laminar flow");
		} else if (num < 4000) {
			System.out.println("Transient flow");
		} else {
			System.out.println("Turbulent flow");
		}
	}
}