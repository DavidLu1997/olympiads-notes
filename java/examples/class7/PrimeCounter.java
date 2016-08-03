import java.util.Scanner;

public class PrimeCounter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		boolean isPrime = true;

		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= Math.sqrt(i) && isPrime; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}

			if (isPrime) {
				System.out.println(i);
			}
			isPrime = true;
		}
	}
}