#include <iostream>
using namespace std;
int main() {
	int originY = 200;

	// To convert rows: -(x + 1)
	// To convert columns: (y - originY)

	bool hole[200][401];

	for (int i = 0; i < 200; i++) {
		for (int j = 0; j < 401; j++) {
			hole[i][j] = false;
		}
	}

	// Mark appropriate holes

	int x = 0;
	int y = originY;

	char direction;
	int num;

	cin >> direction >> num;

	bool isDanger = false;
	while (direction != 'q' && !isDanger) {
		switch (direction) {
			case 'u':
				for (int i = x; i >= x - num; i--) {
					isDanger = hole[i][y];
					hole[i][y] = true;
					x--;
				}
				break;
			case 'd':
				for (int i = x; i <= x + num; i++) {
					isDanger = hole[i][y];
					hole[i][y] = true;
					x++;
				}
				break;
			case 'l':
				for (int i = y; i >= y - num; i--) {
					isDanger = hole[x][i];
					hole[x][i] = true;
					y--;
				}
				break;
			case 'r':
				for (int i = y; i <= y + num; i++) {
					isDanger = hole[x][i];
					hole[x][i] = true;
					y++;
				}
				break;
		}
		cout << -(x + 1) << " " << (y - originY) << " ";

		if (isDanger) {
			cout << "DANGER" << endl;
			break;
		} else {
			cout << "safe" << endl;
		}

		cin >> direction >> num;
	}
}