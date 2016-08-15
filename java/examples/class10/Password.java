import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String username = input.nextLine();
		System.out.print("Enter password: ");
		String password = input.nextLine();

		username = username.toLowerCase();
		StringBuffer buff = new StringBuffer(password.toLowerCase());

		if (password.length() < 8) {
			System.out.println("Too short! No good!");
		} else {
			int num = (int)(Math.random() * 100) + 1;
			buff.append(num + "");
			System.out.println("Username: " + username + "\nPassword: " + password);
		}
	}
}