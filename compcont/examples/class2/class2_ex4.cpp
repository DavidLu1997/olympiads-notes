// Copyright David Lu 2016
// Prepared for Computer Contest Level 1 at Olympiads School
// See Olympiads.ca for more information

#include <iostream>
#include <string>

using namespace std;

int main() {
	// Declaring a string
	string a;

	// Declaring and initializing a string
	string b = "Hello, world!";

	// Get a line from user input
	getline(cin, a);

	// Check if what the user entered is "Hello, world!"
	if (a == b) {
		cout << "You entered \"Hello, world!\"" << endl;
	}

	// Get the length of a
	cout << "The length of " << a << " is " << a.length() << endl;

	// Get the first element of a
	cout << "The first element of a is " << a[0] << endl;

	// Initialize a string of length 10 filled with 'w'
	string c(10, 'w');

	// Find the first position of 'w' in a
	cout << "The first position of w in a is " << a.find('w') << endl;

	// Find the last position of 'w' in a
	cout << "The last position of w in a is " << a.find_last_of('w') << endl;

	// Clearing a
	a.clear();
}