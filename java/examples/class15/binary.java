import java.util.Stack;
import java.util.Scanner;

public class binary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		Stack s = new Stack();

		int base = 2;

		while (num > 0) {
			s.push(new Integer(num % base));
			num /= base;
		}

		while (!s.isEmpty()) {
			System.out.print(s.peek());
			s.pop();
		}
		System.out.println();
	}
}