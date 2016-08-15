#include <iostream>
using namespace std;

int main() {
	int maxX, maxY;

	cin >> maxX >> maxY;

	int x = 0, y = 0;
	int dx, dy;

	cin >> dx >> dy;

	while (dx != 0 || dy != 0){
		x += dx;
		y += dy;

		if (x > maxX) {
			x = maxX;
		} else if (x < 0) {
			x = 0;
		}

		if (y > maxY) {
			y = maxY;
		} else if (y < 0) {
			y = 0;
		}

		cout << x << " " << y << endl;

		cin >> dx >> dy;
	}
}