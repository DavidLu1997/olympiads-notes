// Copyright David Lu 2016
// Prepared for Computer Contest Level 1 at Olympiads School
// See Olympiads.ca for more information

#include <iostream>

using namespace std;

int main() {
	int countA = 0;
	int countB = 0;

	char input = '';

	while (input != 'E') {
		cin >> input;

		if (input == 'A') {
			countA++;
		} else if (input == 'B') {
			countB++;
		}
	}

	if (countA > countB) {
		cout << "A won" << endl;
	} else if (countB > countA) {
		cout << "B won" << endl;
	} else {
		cout << "They tied" << endl;
	}

	return 0;
}