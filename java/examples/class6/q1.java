import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double weight = input.nextDouble();
		double height = input.nextDouble();

		double bmi = weight / (height * height);

		if (bmi < 15) {
			System.out.println("Starvation");
		} else if (bmi < 17.5) {
			System.out.println("Anorexic");
		} else if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi < 25) {
			System.out.println("Ideal");
		} else if (bmi < 30) {
			System.out.println("Overweight");
		} else if (bmi < 40) {
			System.out.println("Obese");
		} else {
			System.out.println("Morbidly Obese");
		}
	}
}