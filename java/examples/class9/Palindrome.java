import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str = input.next();

		boolean isPalindrome = true;

		for (int i = 0, j = str.length() - 1; i < j && isPalindrome; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				isPalindrome = false;
			}
		}

		if (isPalindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome")
		}
	}
}