import java.util.Scanner;

public class MultipleChoice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		String[] stu = new String[n];
		String[] ans = new String[n];

		for (int i = 0; i < n; i++) {
			stu[i] = input.nextLine();
		}
		for (int i = 0; i < n; i++) {
			ans[i] = input.nextLine();
		}

		int c = 0;
		for (int i = 0; i < n; i++) {
			if (stu[i].equals(ans[i])) {
				c++;
			}
		}

		System.out.println(c);
	}
}