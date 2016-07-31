#include <iostream>
#include <vector>

using namespace std;

int main() {
	int a;
	cin >> a;

	for (int i = a; i <= 10234; i++) {
		vector<bool> occurred(10, false);
		int num = i;
		while (num > 0) {
			if (occurred[num % 10]) {
				break;
			}

			occurred[num % 10] = true;
			num /= 10;
		}

		if (num == 0) {
			cout << i << endl;
			break;
		}
	}

	return 0;
}