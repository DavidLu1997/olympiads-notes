import java.util.Scanner;
public class ccc96s1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int c, sum;
		for (int num = 0; num < n; num++) {
			c = input.nextInt();
			sum = 0;

			for (int i = 1; i < c; i++) {
				if (c % i == 0) {
					sum += i;
				}
			}

			if (sum > c) {
				System.out.println(c + " is an abundant number.");
			} else if (sum < c) {
				System.out.println(c + " is a deficient number.");
			} else {
				System.out.println(c + " is a perfect number.");
			}
		}
	}
}