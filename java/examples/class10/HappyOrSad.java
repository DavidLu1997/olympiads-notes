import java.util.Scanner;

public class HappyOrSad {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str = input.nextLine();

		int happy = 0;
		int sad = 0;

		int index = 0;
		while (index < str.length() && index >= 0) {
			index = str.indexOf(":-)", index);

			if (index >= 0) {
				happy++;
				index += 3;
			}
		}

		index = 0;
		while (index < str.length() && index >= 0) {
			index = str.indexOf(":-(", index);

			if (index >= 0) {
				sad++;
				index += 3;
			}
		}

		if (happy == 0 && sad == 0) {
			System.out.println("none");
		} else if (happy > sad) {
			System.out.println("happy");
		} else if (happy < sad) {
			System.out.println("sad");
		} else {
			System.out.println("unsure");
		}
	}
}