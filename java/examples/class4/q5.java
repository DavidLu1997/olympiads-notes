public class q5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hours;

		hours = input.nextInt();

		int days = hours / 24;
		hours = hours % 24;

		System.out.println(days + " days");
		System.out.println(hours + " hours");
	}
}