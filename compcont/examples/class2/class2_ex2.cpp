// Copyright David Lu 2016
// Prepared for Computer Contest Level 1 at Olympiads School
// See Olympiads.ca for more information

#include <iostream>
#include <climits>

using namespace std;

int main() {
	int a[10];

	for (int i = 0; i < 10; i++) {
		cin >> a[i];

		if (a[i] % 2 == 0) {
			cout << a[i] << " ";
		}
	}
	cout << endl;

	int b[10];
	int c[10];

	for (int i = 0; i < 10; i++) {
		cin >> b[i];
	}

	for (int i = 0; i < 10; i++) {
		cin >> c[i];
	}

	for (int i = 0; i < 10; i++) {
		cout << b[i] + c[i] << " ";
	}

	cout << endl;

	int d[10];
	int smallest = INT_MAX, largest = INT_MIN;
	double average = 0;

	for (int i = 0; i < 10; i++) {
		cin >> d[i];

		if (d[i] < smallest) {
			smallest = d[i];
		}

		if (d[i] > largest) {
			largest = d[i];
		}

		average += d[i];
	}

	average /= 10.0;

	cout << "The largest integer is " << largest << endl;
	cout << "The smallest integer is " << smallest << endl;
	cout << "The average is " << average << endl;
}