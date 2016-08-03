public class ccc07j2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] abbr = {"CU", ":-)", "TTYL"};
		String[] trans = {"See You", "I'm happy", "talk to you later"};
		String str = "";
		Boolean printed = false;

		while (!str.equals("TTYL")) {
			str = in.nextLine();
			printed = false;
			for (int i = 0; i < abbr.length; i++) {
				if (str.equals(abbr[i])) {
					printed = true;
					System.out.println(trans[i]);
					break;
				}
			}

			if (!printed) {
				System.out.println(str);
			}
		}
	}
}