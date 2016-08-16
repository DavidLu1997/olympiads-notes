import java.util.Scanner;

public class Magic Square {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] arr = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = input.nextInt();
			}
		}

		int sum = 0;

		sum = arr[0][0] + arr[0][1] + arr[0][2] + arr[0][3];

		int currentSum = 0;
		boolean isMagic = true;

		for (int i = 1; i < 4 && isMagic; i++) {
			currentSum = arr[i][0] + arr[i][1] + arr[i][2] + arr[i][3];

			if (sum != currentSum) {
				isMagic = false;
			}
		}

		for (int i = 0; i < 4 && isMagic; i++) {
			currentSum = arr[0][i] + arr[1][i] + arr[2][i] + arr[3][i];

			if (sum != currentSum) {
				isMagic = false;
			}
		}

		if (isMagic) {
			System.out.println("Magic");
		} else {
			System.out.println("Not magic");
		}
	}
}