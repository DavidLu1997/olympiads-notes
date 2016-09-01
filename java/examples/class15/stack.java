import java.util.Scanner;
import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Stack s = new Stack();

		// Pushing onto a Stack
		s.push(new Integer(5));

		// Getting the top of the stack
		int topOfStack = (int) s.peek();

		// Popping the top of the stack
		s.pop();

		if (s.isEmpty()) {
			System.out.println("GOOD");
		} else {
			System.out.println("WHAT???");
		}

		s.push(new Integer(10));
		s.push(new Integer(20));
		s.push(new Integer(30));
		s.push(new Integer(40));
		s.push(new Integer(50));

		while (!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}