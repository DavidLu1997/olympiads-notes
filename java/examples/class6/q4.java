import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int degrees = input.nextInt();

		int point = degrees / 90;
		int remainder = degrees % 90;

		switch (point) {
			case 0:
				if (remainder > 45) {
					System.out.println("E");
				} else {
					System.out.println("N");
				}
				break;
			case 1:
				if (remainder >= 45) {
					System.out.println("S");
				} else {
					System.out.println("E");
				}
				break;
			case 2:
				if (remainder > 45) {
					System.out.println("W");
				} else {
					System.out.println("S");
				}
				break;
			case 3:
				if (remainder >= 45) {
					System.out.println("N");
				} else {
					System.out.println("W");
				}
				break;
		}
	}
}