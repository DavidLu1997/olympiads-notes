import java.util.Scanner;
import java.util.Stack;

public class ccc14s3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int c = input.nextInt();

		for (int cases = 0; cases < c; cases++) {
			int n = input.nextInt();

			Stack mountain = new Stack();
			Stack side = new Stack();

			int temp;
			for (int i = 0; i < n; i++) {
				temp = input.nextInt();
				mountain.push(new Integer(temp));
			}

			int nextCar = 1;

			while (!mountain.isEmpty() || !side.isEmpty()) {
				if (!mountain.isEmpty() && (Integer) mountain.peek() == nextCar) {
					mountain.pop();
					nextCar++;
				} else if (!side.isEmpty() && (Integer) side.peek() == nextCar) {
					side.pop();
					nextCar++;
				} else if (!mountain.isEmpty()) {
					side.push(mountain.peek());
					mountain.pop();
				} else {
					break;
				}
			}

			if (nextCar == n + 1) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		}
	}
}