import java.util.Scanner;

public class hilo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Do you want to play with me? (1 to play)");
		int yes = input.nextInt();

		while(yes == 1) {
			// Play the game
			int num = (int)(Math.random() * 100) + 1;

			System.out.print("Enter a number: ");
			int inp = input.nextInt();

			while (inp != num) {
				if (inp < num) {
					System.out.println("LO");
				} else {
					System.out.println("HI");
				}
				inp = input.nextInt();
			}

			System.out.println("You win :D");

			// Get input
			System.out.println("Do you want to play with me? (1 to play)");
			yes = input.nextInt();
		}
	}
}