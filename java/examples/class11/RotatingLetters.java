import java.util.Scanner;

public class RotatingLetters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str = input.nextLine();
		String accepted = "IOSHZXN";
		
		boolean flag = true;
		for (int i = 0; i < str.length() && flag; i++) {
			char c = str.charAt(i);
			if (accepted.indexOf(c) == -1) {
				flag = false;
			}
		}

		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}