import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		// Declaring a Scanner
		Scanner input = new Scanner(System.in);

		// Variables to scan in
		String str;
		int num;
		double derp;

		// Scanning in a string
		System.out.println("Enter a single word: ");
		str = input.next(); // Cuts off at space/newline
		System.out.println("You've entered: " + str);

		// Avoid input cut-off
		input.nextLine();

		// Scanning in another string
		System.out.println("Enter a sentence: ");
		str = input.nextLine(); // Cuts off at newline
		System.out.println("You've entered: " + str);

		// Scanning in an integer
		System.out.println("Enter an integer: ");
		num = input.nextInt();
		System.out.println("You've entered: " + num);

		// Scanning in a double
		System.out.println("Enter a decimal: ");
		derp = input.nextDouble();
		System.out.println("You've entered: " + derp);
	}
}