import java.util.Scanner;

public class functionExample {

	static void myFunction() {
		System.out.println("Look at me I'm a function!");
	}

	static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	static String date(int year, int month, int day) {
		return year + "-" + month + "-" + day;
	}

	// Write a function to take in m, x, and b, output y, y=mx+b
	static double linear(double m, double x, double b) {
		return m * x + b;
	}

	// Given a, b, c: ax^2 + bx + c = 0, return the POSITIVE root
	// If there is no root, return -999999
	static double quadratic(double a, double b, double c) {
		if (b * b - 4 * a * c < 0) {
			return -999999;
		}
		return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	}

	static void displayAge(int age) {
		System.out.println("Your age is: " + age);
	}

	static double calculatePay(double hours, double rate) {
		return hours * rate;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		myFunction();

		int myInt = add(5, 6);

		System.out.println(linear(5, 10, 60));
		System.out.println(quadratic(1, -2, 1));

		int myAge = input.nextInt();

		displayAge(myAge);
	}
}