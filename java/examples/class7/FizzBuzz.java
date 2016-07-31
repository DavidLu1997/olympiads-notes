import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();

		for (int i = a; i <= b; i++) {

			// First way
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}

			// Second way
			if (i % 3 == 0 || i % 5 == 0) {
				if (i % 3 == 0) {
					System.out.print("Fizz");
				}
				if (i % 5 == 0) {
					System.out.print("Buzz");
				}
				System.out.println();
			} else {
				System.out.println(i);
			}
		}
	}
}