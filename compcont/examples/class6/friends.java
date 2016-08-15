import java.util.Scanner;
public class friends {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int friends = input.nextInt();
		int rounds = input.nextInt();

		boolean[] invited = new boolean [friends + 1];

		for (int i = 0; i < invited.length; i++) {
			invited[i] = true;
		}

		for (int i = 0; i < rounds; i++) {
			int r = input.nextInt();

			for (int j = 0; j < invited.length; j += r) {
				invited[j] = false;
			}
		}

		int c = 0;
		for (int i = 0; i < invited.length; i++) {
			if (invited[i]) {
				c++;
			}
		}
		System.out.println(c);
	}
}