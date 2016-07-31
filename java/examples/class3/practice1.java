import java.util.Scanner;

public class practice1 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		int a = 0, b = 0;
		System.out.print("Enter 2 integers: ");
		a = input.nextInt();
		b = input.nextInt();

		int sum = (a + b) - (a + b) % 10;

		System.out.println("The sum rounded down to the nearest 10 is " + sum);
	}
}