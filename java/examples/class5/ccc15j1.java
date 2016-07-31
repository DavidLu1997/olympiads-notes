import java.util.Scanner;

public class ccc15j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int month = input.nextInt();
		int day = input.nextInt();

		if (month > 2) {
			System.out.println("After");
		} else if (month < 2) {
			System.out.println("Before");
		} else {
			if (day < 18) {
				System.out.println("Before");
			} else if (day > 18) {
				System.out.println("After");
			} else {
				System.out.println("Special");
			}
		}
	}
}