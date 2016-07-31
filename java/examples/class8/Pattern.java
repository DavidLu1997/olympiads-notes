public class Pattern {
	public static void main(String[] args) {
		int num = 10;

		System.out.println("Pattern A");
		for (int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("Pattern B");
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("Pattern C");
		for (int i = num; i > 0; i--) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("Pattern D");
		for (int i = 1; i <= 9; i+=2) {
			for (int j = 0; j < (9 - i) / 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 9; i > 0; i-=2) {
			for (int j = 0; j < (9 - i) / 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}