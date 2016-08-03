import java.util.Scanner;

public class ccc14j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		boolean isTriangle = (a + b + c) == 180;

		if (isTriangle) {
			if (a == b && b == c && a == c) {
				System.out.println("Equilateral");
			} else if (a == b || b == c || a == c) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
		} else {
			System.out.println("Error");
		}
	}
}