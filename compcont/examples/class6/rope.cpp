#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
int main() {
	int n;
	string output = "";
	string s;

	cin >> n;

	for (int i = 0; i < n; i++) {
		cin >> s;

		if (i % 2 == n % 2) {
			reverse(s.begin(), s.end());
		}

		output = s + output;
	}

	cout << output << endl;
}