import java.util.Scanner;

public class 2DArrayExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declare 6x7 2D array
		int[][] arr = new int[6][7];

		// Get 42 characters from input
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = input.nextInt();
			}
		}

		// Calculate average of each row
		double[] avg = new double[6];

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			avg[i] = (double)sum / arr[i].length;
		}

		// Print out the average of each row as such
		// Row #0: 4.5
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Row #" + i + ": " + avg[i]);
		}
	}
}