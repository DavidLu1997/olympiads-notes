public class Variables {
	public static void main(String[] args) {
		// Declaring a variable
		int num1;

		// Declaring a variable and initializing it
		int num2 = 5;

		// Assign the value on the right side of =
		// To the variable on the left side
		int a = 5 * 6 + 13 - (6 / 2);

		// This will output 40
		System.out.println(a);

		// Declaring the variable b as a double
		double b = 1.3;
		
		// Assign the value of 17 to a
		a = 17;

		// The ++ operator, increment a by 1
		a++;

		// The -- operator, decrement a by 1
		a--;

		// Adding 4 to a, way #1
		a = a + 4;

		// Adding 4 to a, way #2
		a += 4;

		// Output 25
		System.out.println(a);

		// Assign the value of a * 2.5 - b to b
		// The b in a * 2.5 - b will be 1.3
		b = a * 2.5 - b;

		// This will output 41.2
		System.out.println(b);

		// This will output "num2 is 5"
		// This adds a number to a string
		System.out.println("num2 is " + num2);

		// This is a String
		String str = "Hello, world!";

		// You can add (concatenate) strings together
		str = "Howdy, " + "y'all!";

		// += works on strings
		str += " I like pie!";

		// Output "Howdy, y'all! I like pie!"
		System.out.println(str);

		// You can concantenate numbers to strings
		// This string will be "NUMBERS 25"
		String iLikeNumbers = "NUMBERS " + a;

	}
}