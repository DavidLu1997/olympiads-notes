public class recursionExample {

	static String computeX(String s) {
		if (s.length() == 1) {
			if (s.charAt(0) == 'X') {
				return "";
			}
			return s;
		}

		if (s.charAt(0) == 'X') {
			return computeX(s.substring(1, s.length()));
		}

		return s.substring(0, 1) + computeX(s.substring(1, s.length()));
	}

	public static void main(String[] args) {

	}
}