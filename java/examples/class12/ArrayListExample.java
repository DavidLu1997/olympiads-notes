import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declaring an empty ArrayList
		// Integer, Double, String, Character, etc.
		ArrayList<Integer> myList = new ArrayList<Integer>();

		// Adding 5 to my ArrayList
		myList.add(5);

		// Adding a bunch of stuff
		myList.add(6);
		myList.add(8);
		myList.add(42);
		myList.add(340);

		// Printing the size of an ArrayList
		// Should print 5
		System.out.println("Size: " + myList.size());

		// Get the value at index 2
		int value = myList.get(2);

		// Remove the value at index 1
		myList.remove(1);

		// Clear the whole list
		myList.clear();

		// Check if list is empty
		if(myList.isEmpty()) {
			System.out.println("Clear worked!");
		} else {
			System.out.println("What happened???");
		}

	}
}