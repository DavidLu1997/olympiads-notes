import java.util.Scanner;

public class Checksums {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		int copy = num;
		int c = 2;
		int sum = 0;

		while (num != 0) {
			sum += (num % 10) * c;
			num /= 10;
			c++;
		}

		int d = (11 - (sum % 11)) % 11;

		System.out.print(copy);

		if (d == 10) {
			System.out.println("X");
		} else {
			System.out.println(d);
		}
	}
}