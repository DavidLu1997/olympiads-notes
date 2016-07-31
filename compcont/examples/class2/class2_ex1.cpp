// Copyright David Lu 2016
// Prepared for Computer Contest Level 1 at Olympiads School
// See Olympiads.ca for more information

#include <iostream>

using namespace std;

int main() {
	// Declaring an integer array of size 10
	int a[10];

	// Filling the array with 1 2 3 4 5 6 7 8 9 10
	for (int i = 0; i < 10; i++) {
		a[i] = i + 1;
	}

	// Printing out the array
	for (int i = 0; i < 10; i++) {
		cout << a[i] << endl;
	}

	// Declaring and initializing an array of size 5
	double b[5] = {1.0, 2.5, 3.6, 4.7, 5.8};

	// Initializing an array of size 5
	bool c[] = {true, false, true, false, true};

	// Get the number of elements in c
	int sizeOfC = sizeof(c) / sizeof(c[0]);

	// Declaring a null array (don't do this)
	int d[] = {};

	// Array sizes must be constants, not variables
	int num = 10;
	// The following line will crash
	//int e[num];
	const int num1 = 20;
	// This line will not crash
	int e[num1];
}