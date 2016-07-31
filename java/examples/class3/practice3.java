import java.util.Scanner;

public class practice3 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		String adjective, noun;

		System.out.print("Enter an adjective: ");
		adjective = input.nextLine();

		System.out.print("Enter a noun: ");
		noun = input.nextLine();

		System.out.println(adjective + " as " + noun);

		int rating;
		System.out.print("Enter a rating: ");
		rating = input.nextInt();
		System.out.println("You have rated this " + rating + " out of 10.");
	}
}