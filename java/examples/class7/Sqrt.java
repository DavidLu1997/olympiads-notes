import java.util.Scanner;

public class Sqrt {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		double num = input.nextDouble();

		double currentGuess = 1.0;
		double nextGuess = 0;

		for (int i = 0; i < 10; i++) {
			nextGuess = 0.5 * (currentGuess + num / currentGuess);

			if (Math.abs(nextGuess - currentGuess) <= 0.001) {
				break;
			}

			currentGuess = nextGuess;
		}

		if (Math.abs(nextGuess - currentGuess) < 0.001) {
			System.out.println(nextGuess);
		} else {
			System.out.println(-1);
		}
	}
}