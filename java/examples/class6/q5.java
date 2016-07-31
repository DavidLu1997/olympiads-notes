import java.util.Scanner;

public class q5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		String output = "";

		if (num >= 100000) {
			System.out.println("Not supported, numbers must be less than 100 000.");
			return;
		}

		int thousands = num / 1000;
		num = num % 1000;
		int hundreds = num / 100;
		num = num % 100;

		if (thousands != 0) {
			output += numberToString(thousands) + " thousand ";
		}

		if (hundreds != 0) {
			output += numberToString(hundreds) + " hundred ";
		}

		if (num != 0) {
			output += numberToString(num);
		}

		System.out.println(output);
	}

	public static String numberToString(int num) {

		if (num > 20 && (num % 10 != 0)) {
			return numberToString(num - num % 10) + "-" + numberToString(num % 10);
		}

		switch (num) {
			case 1:
				return "one";
			case 2:
				return "two";
			case 3:
				return "three";
			case 4:
				return "four";
			case 5:
				return "five";
			case 6:
				return "six";
			case 7:
				return "seven";
			case 8:
				return "eight";
			case 9:
				return "nine";
			case 10:
				return "ten";
			case 11:
				return "eleven";
			case 12:
				return "twelve";
			case 13:
				return "thirteen";
			case 14:
				return "fourteen";
			case 15:
				return "fifteen";
			case 16:
				return "sixteen";
			case 17:
				return "seventeen";
			case 18:
				return "eighteen";
			case 19:
				return "nineteen";
			case 20:
				return "twenty";
			case 30:
				return "thirty";
			case 40:
				return "forty";
			case 50:
				return "fifty";
			case 60:
				return "sixty";
			case 70:
				return "seventy";
			case 80:
				return "eighty";
			case 90:
				return "ninety";
			default:
				return "";
		}
	}
}