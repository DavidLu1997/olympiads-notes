#include <iostream>
#include <string>
using namespace std;

int main() {
	char a[5][6] = {
		{'A', 'B', 'C', 'D', 'E', 'F'},
		{'G', 'H', 'I', 'J', 'K', 'L'},
		{'M', 'N', 'O', 'P', 'Q', 'R'},
		{'S', 'T', 'U', 'V', 'W', 'X'},
		{'Y', 'Z', ' ', '-', '.', '0'},
	}

	int curX = 0, curY = 0;
	int x, y;
	int dist = 0;
	String str;
	getline(cin, str);
	str = str + '0';

	for (int i = 0; i < str.length(); i++) {
		if (str[i] >= 'A' && str[i] <= 'Z') {
			x = (str[i] - 'A') % 6;
			y = (str[i] - 'A') / 6;
		} else {
			if (str[i] == ' ') {
				x = 4;
				y = 2;
			}
			if (str[i] == '-') {
				x = 4;
				y = 3;
			}
			if (str[i] == '.') {
				x = 4;
				y = 4;
			}
			if (str[i] == '0') {
				x = 4;
				y = 5;
			}
		}

		dist += abs(curX - x);
		dist += abs(curY - y);
		curX = x;
		curY = y;
	}

	cout << dist << endl;
}