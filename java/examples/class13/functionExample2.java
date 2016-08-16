import java.util.Scanner;

public class functionExample2 {

	static void sayHello() {
		System.out.println("Hellooooooooo!");
	}

	static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	static String fullName(String first, String last) {
		return first + " " + last;
	}

	static double multiply(double a) {
		return a * 2;
	}

	// Write a function called linear, taking in 3 doubles m, x, b, outputting y
	static double linear(double m, double x, double b) {
		return m * x + b;
	}

	static double quadratic(double a, double b, double c, boolean isPositive) {
		if (isPositive) {
			return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		}

		return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	}

	static void displayAge(int age) {
		System.out.println("Your age is: " + (age + 2));
	}

	static double calculatePay(double hours, double rate) {
		return rate * hours;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		sayHello();

		int a = add(5, 9);
		int b = add(6, a);
	}
}