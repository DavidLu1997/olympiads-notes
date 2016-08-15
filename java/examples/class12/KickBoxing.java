import java.util.Scanner;

public class KickBoxing {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] weights = {
			0,
			150,
			300,
			450
		};

		String[] names = {
			"Featherweight",
			"Lightweight",
			"Heavyweight"
		};

		int w = input.nextInt();

		for (int i = 0; i < weights.length - 1; i++) {
			if (w >= weights[i] && w < weights[i + 1]) {
				System.out.println(names[i]);
				break;
			}
		}
	}
}