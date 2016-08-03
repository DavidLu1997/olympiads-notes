import java.util.Scanner;

public class StringExamples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Get a single word
		String str1 = input.next();
		// Get a whole line
		String str2 = input.nextLine();

		// Check if the strings are equal
		if (str1.equals(str2)) {
			System.out.println("You are a dummy.");
		}

		// Print out the index of "a" in str1
		System.out.println("Index of a is " + str1.indexOf("a"));

		// Print out each character individually
		for (int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}

		// Replace every vowel with x
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == 'a' || 
				str1.charAt(i) == 'e' || 
				str1.charAt(i) == 'i' || 
				str1.charAt(i) == 'o' || 
				str1.charAt(i) == 'u'
				) {
				str1 = str1.substring(0, i) + 'X' + str1.substring(i + 1, str1.length());
			}
		}
		System.out.println(str1);
		// Remember .length, .charAt, .substring

		// Replace all "<3" with "4"
		String temp;
		for (int i = 0; i < str1.length(); i+=2) {
			if (i + 1 < str1.length()) {
				if (str1.charAt(i) == '<' && str1.charAt(i+1) == '3') {
					temp = str1.substring(0, i) + '4' + str1.substring(i 2, str1.length());
				}
			}
		}
	}
}