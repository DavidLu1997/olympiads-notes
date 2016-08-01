#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;
int main() {
	int n;
	cin >> n;

	vector<int> read(1001, 0);

	int reading = 0;
	int maxFreq = 0;
	for (int i = 0; i < n; i++) {
		cin >> reading;
		read[reading]++;

		if (read[reading] > maxFreq) {
			maxFreq = read[reading];
		}
	}

	int secondFreq = 0;
	for (int i = 1; i <= 1000; i++) {
		if (read[i] > secondFreq && read[i] != maxFreq) {
			secondFreq = read[i];
		}
	}

	vector<int> maxF();
	vector<int> secondF();

	for(int i = 1; i <= 1000; i++) {
		if (read[i] == maxFreq) {
			maxF.push_back(i);
		}
		if (read[i] == secondFreq) {
			secondF.push_back(i);
		}
	}

	sort(maxF.begin(), maxF.end());
	sort(secondF.begin(), secondF.end());

	int diff1 = abs(maxF[0] - secondF[secondF.size() - 1]);
	int diff2 = abs(maxF[maxF.size() - 1] - secondF[0]);

	if (diff1 > diff2) {
		cout << diff1 << endl;
	} else {
		cout << diff2 << endl;
	}
}