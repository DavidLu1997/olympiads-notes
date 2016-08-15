import java.util.Scanner;

public class Monogram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("First name: ");
		String firstName = input.nextLine();
		System.out.print("Last name: ");
		String lastName = input.nextLine();
		System.out.print("Middle name: ");
		String middleName = input.nextLine();

		firstName = firstName.toLowerCase();
		middleName = middleName.toLowerCase();
		lastName = lastName.toUpperCase();

		// Replace (firstName.charAt(0) + "") with firstName.substring(0, 1) if you want
		String monogram = (firstName.charAt(0) + "") + (lastName.charAt(0) + "") + (middleName.charAt(0) + "");
		System.out.println("Your monogram is " + monogram);
	}
}