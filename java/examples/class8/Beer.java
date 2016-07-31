import java.util.Scanner;

public class Beer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int verses = input.nextInt();

		int bottles = 100;

		while (verses != 0 && bottles != 0) {
			System.out.println(bottles + " bottles of beer on the wall");
			System.out.println(bottles + " bottles of beer");
			System.out.println("If one of those bottles should happen to fall");
			System.out.println((bottles - 1) + " bottles of beer on the wall\n");
			verses--;
			bottles--;
		}
	}
}