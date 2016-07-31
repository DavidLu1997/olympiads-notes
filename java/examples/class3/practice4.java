import java.util.Scanner;

public class practice4 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		String team1, team2, team3;
		int score1, score2, score3;

		team1 = input.next();
		score1 = input.nextInt();

		team2 = input.next();
		score2 = input.nextInt();

		team3 = input.next();
		score3 = input.nextInt();

		System.out.println(team1 + " scored " + score1 + " points.");
		System.out.println(team2 + " scored " + score2 + " points.");
		System.out.println(team3 + " scored " + score3 + " points.");
	}
}