#include <iostream>
#include <stack>
using namespace std;
int main() {
	int c;
	cin >> c;

	for (int cases = 0; cases < c; cases++) {
		int n;
		cin >> n;

		stack<int> mountain;
		stack<int> branch;

		int temp;
		for (int i = 0; i < n; i++) {
			cin >> temp;
			mountain.push(temp);
		}

		bool isDone = false;
		int next = 1;
		while (!isDone) {
			if (next == n + 1) {
				isDone = true;
			} else if (mountain.empty() && branch.top() != next) {
				isDone = true;
			} else {
				if (mountain.top() == next) {
					mountain.pop();
					next++;
				} else if (branch.top() == next) {
					branch.pop();
					next++;
				} else {
					branch.push(mountain.top());
					mountain.pop();
				}
			}
		}

		if (next == n + 1) {
			cout << "Y" << endl;
		} else {
			cout << "N" << endl;
		}
	}
}