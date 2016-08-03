import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int mass = input.nextInt();

		int cost = 0;

		if (mass <= 30) {
			cost = 40;
		} else if (mass <= 50) {
			cost = 55;
		} else if (mass <= 100) {
			cost = 70;
		} else {
			cost = 70 + 25 * (mass - 100) / 50;

			if ((mass - 100) % 50 != 0) {
				cost += 25;
			}
		}

		System.out.println(cost);
	}
}