import java.util.Scanner;

public class txtmsg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str = "";

		while (!str.equals("TTYL")) {
			str = input.nextLine();

			switch (str) {
				case "CU":
					System.out.println("see you");
					break;
				case ":-)":
					System.out.println("I'm happy");
					break;
				// FILL IN REST
				default:
					System.out.println(str);
					break;
			}
		}
	}
}