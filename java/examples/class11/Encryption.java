import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str = input.nextLine().toLowerCase();
		String output = "";

		String vowels = "aeiou";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (vowels.indexOf(c) == -1) {
				output += c + "";

				// Find nearest vowel
				char closestVowel = 'a';
				for (int j = 0; j < vowels.length(); j++) {
					if (Math.abs(vowels.charAt(j) - c) < Math.abs(closestVowel - c)) {
						closestVowel = vowels.charAt(j);
					}
				}
				output += closestVowel + "";

				// Find nearest consonant
				if (c == 'z') {
					output += c + "";
				} else if (vowels.indexOf(c + 1) == -1) {
					output += (c + 1) + "";
				} else {
					output += (c + 2) + "";
				}

			} else {
				output += str.charAt(i) + "";
			}
		}

		System.out.println(output);
	}
}