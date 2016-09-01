import java.util.Scanner;
import java.util.ArrayList;

public class pascal {

    static ArrayList<Integer> pascalRecursive(int k) {
        if (k == 1) {
            ArrayList<Integer> one = new ArrayList<Integer>();
            one.add(1);
            System.out.println(1);
            return one;
        }

        ArrayList<Integer> prevRow = pascalRecursive(k - 1);

        ArrayList<Integer> row = new ArrayList<Integer>();
        row.add(1);
        for (int i = 0; i < prevRow.size() - 1; i++) {
            row.add(prevRow.get(i) + prevRow.get(i + 1));
        }
        row.add(1);

        for (int i = 0; i < row.size(); i++) {
            System.out.print(row.get(i) + " ");
        }
        System.out.println();

        return row;
    }

	public static void main (String[] args) {
		ArrayList< ArrayList<Integer> >  triangle = new ArrayList< ArrayList<Integer> >();
		ArrayList<Integer> firstRow = new ArrayList<Integer>();
		firstRow.add(1);
		triangle.add(firstRow);

		Scanner input = new Scanner(System.in);
		int k = input.nextInt();

		for (int c = 1; c < k; c++) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			row.add(1);
            ArrayList<Integer> prevRow = triangle.get(c - 1);
            for (int i = 0; i < prevRow.size() - 1; i++) {
                row.add(prevRow.get(i) + prevRow.get(i + 1));
            }
            row.add(1);
            triangle.add(row);
		}

        int maxSpaces = 0;
        for (int i = 0; i < triangle.get(k - 1).size(); i++) {
            maxSpaces += Math.log10((double)triangle.get(k - 1).get(i)) + 2;
        }
        maxSpaces--;

        if (maxSpaces % 2 == 1) {
            maxSpaces++;
        }

        ArrayList<Integer> spaces = new ArrayList<Integer>();
        for (int i = 0; i < triangle.size(); i++) {
            int curSpaces = 0;
            for (int j = 0; j < triangle.get(i).size(); j++) {
                curSpaces += Math.log10((double)triangle.get(i).get(j)) + 2;
            }
            spaces.add(curSpaces);
        }

        for (int i = 0; i < triangle.size(); i++) {
            int leftSpaces = (maxSpaces - spaces.get(i)) / 2;
            int rightSpaces = leftSpaces;

            if (leftSpaces + rightSpaces < maxSpaces) {
                leftSpaces++;
            }

            for (int j = 0; j < leftSpaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }

            for (int j = 0; j < rightSpaces; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        pascalRecursive(k);
	}
}