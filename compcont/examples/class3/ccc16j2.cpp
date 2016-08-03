#include <iostream>
using namespace std;
int main() {
	int sq[16];

	for (int i = 0; i < 16; i++) {
		cin >> sq[i];
	}

	// Check rows
	int sum = sq[0] + sq[1] + sq[2] + sq[3];
	int curSum = 0;
	for (int i = 4; i < 16; i += 4) {
		curSum = sq[i] + sq[i + 1] + sq[i + 2] + sq[i + 3];
		if (curSum != sum) {
			cout << "not magic" << endl;
			return 0;
		}
		curSum = 0;
	}

	// Check column
	sum = sq[0] + sq[4] + sq[8] + sq[12];
	for (int i = 0; i < 4; i++) {
		curSum = sq[i] + sq[i + 4] + sq[i + 8] + sq[i + 12];
		if (curSum != sum) {
			cout << "not magic" << endl;
			return 0;
		}
		curSum = 0;
	}

	cout << "magic" << endl;
}