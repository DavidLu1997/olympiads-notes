public class q6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int minutes;

		minutes = input.nextInt();

		int days = minutes / (24 * 60);
		minutes = minutes % (24 * 60);
		int hours = minutes / 60;
		minutes = minutes % 60;

		System.out.println(days + " days");
		System.out.println(hours + " hours");
		System.out.println(minutes + " minutes");
	}
}