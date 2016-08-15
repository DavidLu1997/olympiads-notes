import java.util.Scanner;
import java.util.ArrayList;

public class LetterCount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declaring an ArrayList
		ArrayList<Integer> letters = new ArrayList<Integer>();

		// Initialize arraylist to 26 0s
		for (int i = 0; i < 26; i++) {
			letters.add(0);
		}

		String str = input.next().toLowerCase();

		// Count number of As, Bs, etc.
		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i) - 'a';

			letters.set(index, letters.get(index) + 1);
		}

		// Print it out
		for (int i = 0; i < letters.size(); i++) {
			if (letters.get(i) != 0) {
				System.out.println(letters.get(i) + " " + (char)(i + 'a'));
			}
		}

		// Find letter with highest frequency
		int maxIndex = 0;
		int maxFrequency = letters.get(0);

		for (int i = 0; i < letters.size(); i++) {
			if (letters.get(i) > maxFrequency) {
				maxFrequency = letters.get(i);
				maxIndex = i;
			}
		}
	}
}