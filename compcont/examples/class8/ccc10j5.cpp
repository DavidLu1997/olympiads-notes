#include <iostream>
#include <queue>
using namespace std;
int main() {
	int cx, cy;
	int ex, ey;

	cin >> cx >> cy >> ex >> ey;

	cx--;
	cy--;
	ex--;
	ey--;

	bool board[8][8];
	for (int i = 0; i < 8; i++) {
		for (int j = 0; j < 8; j++) {
			board[i][j] = false;
		}
	}

	board[cx][cy] = true;

	queue<int> x, y, steps;
	x.push(cx);
	y.push(cy);
	steps.push(0);

	int tx, ty, ts;
	while (!x.empty()) {
		tx = x.front();
		ty = y.front();
		ts = steps.front();
		x.pop();
		y.pop();
		steps.pop();

		if (tx == ex && ty == ey) {
			cout << ts << endl;
			return 0;
		}

		if (tx + 2 < 8 && ty + 1 < 8 && !board[tx + 2][ty + 1]) {
			x.push(tx + 2);
			y.push(ty + 1);
			steps.push(ts + 1);
			board[tx + 2][ty + 1] = true;
		}

		if (tx + 2 < 8 && ty - 1 >= 0 && !board[tx + 2][ty - 1]) {
			x.push(tx + 2);
			y.push(ty - 1);
			steps.push(ts + 1);
			board[tx + 2][ty - 1] = true;
		}

		// 6 more if statements here
	}
}