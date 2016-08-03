#include <iostream>
using namespace std;
int main() {
	int s[4][4];

	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			cin >> s[i][j];
		}
	}

	// Rows
	int sum = s[0][0] + s[0][1] + s[0][2] + s[0][3];
	int curSum = 0;
	for (int i = 1; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			curSum += s[i][j];
		}

		if (curSum != sum) {
			cout << "not magic" << endl;
			return 0;
		}
		curSum = 0;
	}

	// Columns
	int sum = s[0][0] + s[1][0] + s[2][0] + s[3][0];
	int curSum = 0;
	for (int i = 1; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			curSum += s[j][i];
		}

		if (curSum != sum) {
			cout << "not magic" << endl;
			return 0;
		}
		curSum = 0;
	}

	cout << "magic" << endl;
}