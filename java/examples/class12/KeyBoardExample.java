import java.util.Scanner;

public class KeyBoardExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char[][] keyboard = {
			{'A', 'B', 'C', 'D', 'E', 'F', 'G'},
			{'H', 'I', 'J', 'K', 'L', 'M', 'N'},
			{'O', 'P', 'Q', 'R', 'S', 'T', 'U'},
			{'V', 'W', 'X', 'Y', 'Z', ';', ':'}
		};

		String name = input.nextLine();

		int x = 0, y = 0;
		int moves = 0;

		for (int i = 0; i < name.length(); i++) {
			char letter = name.charAt(i);

			for (int j = 0; j < keyboard.length; j++) {
				for (int k = 0; k < keyboard[j].length; k++) {
					if (keyboard[j][k] == letter) {
						moves += Math.abs(j - x) + Math.abs(k - y);
						x = j;
						y = k;
					}
				}
			}
		}

		System.out.println(moves);
	}
}