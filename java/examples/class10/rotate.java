import java.util.Scanner;

public class rotate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str = input.nextLine();

		boolean flag = true;
		for (int i = 0; i < str.length() && flag; i++) {
			char letter = str.charAt(i);

			if (letter != 'I' && letter != 'O' && letter != 'S' && letter != 'H'
				&& letter != 'Z' && letter != 'X' && letter != 'N') {
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