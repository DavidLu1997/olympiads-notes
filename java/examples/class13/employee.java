import java.util.Scanner;
import java.util.ArrayList;

public class employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> id = new ArrayList<Integer>();
		ArrayList<String> firstName = new ArrayList<String>();
		ArrayList<String> lastName = new ArrayList<String>();
		ArrayList<Integer> salary = new ArrayList<Integer>();
		ArrayList<String> startDate = new ArrayList<String>();

		int input = 0;
		do {
			System.out.println("1. List");
			System.out.println("2. Add");
			System.out.println("3. Remove");
			System.out.println("0. Exit");

			input = sc.nextInt();

			switch (input) {
				case 1:
					for (int i = 0; i < id.size(); i++) {
						System.out.print(id.get(i) + " ");
						System.out.print(firstName.get(i) + " ");
						System.out.print(lastName.get(i) + " ");
						System.out.print(salary.get(i) + " ");
						System.out.println(startDate.get(i));
					}
					break;
				case 2:
					System.out.print("Enter id: ");
					int tempId = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter first name: ");
					String tempFirst = sc.nextLine();
					System.out.print("Enter last name: ");
					String tempLast = sc.nextLine();
					System.out.print("Enter salary: ");
					int tempSalary = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter start date: ");
					String tempStart = sc.nextLine();

					id.add(tempId);
					firstName.add(tempFirst);
					lastName.add(tempLast);
					salary.add(tempSalary);
					startDate.add(tempStart);
					break;
				case 3:
					System.out.print("Enter id to remove: ");
					int deleteId = sc.nextInt();

					for (int i = 0; i < id.size(); i++) {
						if (deleteId == id.get(i)) {
							id.remove(i);
							firstName.remove(i);
							lastName.remove(i);
							salary.remove(i);
							startDate.remove(i);
							break;
						}
					}
					break;
				default:
					input = 0;
			}

		} while(input != 0);
	}
}