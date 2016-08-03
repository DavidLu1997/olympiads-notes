// Copyright David Lu 2016
// Prepared for Computer Contest Level 1 at Olympiads School
// See Olympiads.ca for more information

#include <iostream>

using namespace std;

int main() {
	int start, end;
	cin >> start >> end;

	for (int year = start; year <= end; year++) {
		if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			cout << year << endl;
		}
	}

	return 0;
}