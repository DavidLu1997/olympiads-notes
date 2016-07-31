import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num = -1;
		int max = -2147000000;
		int min = 2147000000;
		double sum = 0;
		int n = 0;

		while (num != 0) {
			num = input.nextInt();

			if (num != 0) {
				if (num > max) {
					max = num;
				}

				if (num < min) {
					min = num;
				}

				sum += num;
				n++;
			}
		}

		sum /= n;

		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Average: " + sum);
	}
}