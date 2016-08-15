import java.util.Scanner;
import java.util.ArrayList;

public class ccc07s2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Box> boxes = new ArrayList<Box>();

		int n = input.nextInt();
		Box temp;
		for (int i = 0; i < n; i++) {
			temp.dimensions[0] = input.nextInt();
			temp.dimensions[1] = input.nextInt();
			temp.dimensions[2] = input.nextInt();

			Arrays.sort(temp);

			temp.volume = temp.dimensions[0] * temp.dimensions[1] * temp.dimensions[2];

			boxes.add(temp);
		}

		int m = input.nextInt();
		ArrayList<Box> items = new ArrayList<Box>();
		for (int i = 0; i < m; i++) {
			temp.dimensions[0] = input.nextInt();
			temp.dimensions[1] = input.nextInt();
			temp.dimensions[2] = input.nextInt();

			Arrays.sort(temp);

			temp.volume = temp.dimensions[0] * temp.dimensions[1] * temp.dimensions[2];

			items.add(temp);
		}

		boolean flag = false;
		for (int i = 0; i < items.size(); i++) {
			for (int j = 0; j < boxes.size(); j++) {
				if (items.get(i).dimensions[0] <= boxes.get(i).dimensions[0] &&
					items.get(i).dimensions[1] <= boxes.get(i).dimensions[1] &&
					items.get(i).dimensions[2] <= boxes.get(i).dimensions[2]
					) {
					System.out.println(items.get(i).volume);
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.println("Item does not fit.");
			}

			flag = false;
		}
	}
}

class Box {
	public int[] dimensions = new int[3];
	public int volume;
}