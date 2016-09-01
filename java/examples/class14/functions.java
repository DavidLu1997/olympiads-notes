import java.util.Scanner;

public class functions {

	static void monthName(int month) {
		String[] months = {"January", "February"};

		System.out.println(months[month - 1]);
	}

	static void monthDays(int month) {
		switch (month) {
			case 1: System.out.println(31); break;
			case 2: System.out.println(28); break;
		}
	}

	static void swap(int a, int b) {
		System.out.println(b + " " + a);
	}

	static void realTime(int seconds) {
		int hours = seconds / 3600;
		seconds = seconds % 3600;
		int minutes = seconds / 60;
		seconds = seconds % 60;

		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
	}

	static int sumArray(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum;
	}

	static double average(int[] arr) {
		return sumArray(arr) / (double)arr.length;
	}

	static int findMax(int[] arr) {
		int m = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > m) {
				m = arr[i];
			}
		}

		return m;
	}

	static int sumEven(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}

		return sum;
	}

	static boolean allPositive(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				return false;
			}
		}

		return true;
	}

	static boolean isPalindrome(String s) {
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

	}
}