import java.util.Scanner;

public class 2DArrayExample2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declaring a 6x7 2D array
		int[][] arrA = new int[6][7];

		// Declare an array of size 6
		double[] avg = new double[6];

		// Get 42 integers from input
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrA[i].length; j++) {
				arrA[i][j] = input.nextInt();
			}
		}

		// Calculate average of each row
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrA[i].length; j++) {
				avg[i] += arrA[i][j];
			}
			avg[i] /= arrA[i].length;
		}
	}
}