// Copyright David Lu 2016
// Prepared for Computer Contest Level 1 at Olympiads School
// See Olympiads.ca for more information

#include <iostream>

using namespace std;

int main() {
	int a, b, c;
	cin >> a >> b >> c;

	if (a == b && b == c && a == c && (a + b + c) == 180) {
		cout << "Equilateral" << endl;
	} else if ( (a == b || b == c || a == c) && (a + b + c) == 180) {
		cout << "Isoceles" << endl;
	} else if ( (a + b + c) == 180) {
		cout << "Scalene" << endl;
	} else {
		cout << "Error" << endl;
	}

	return 0;
}