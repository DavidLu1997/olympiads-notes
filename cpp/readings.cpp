#include <iostream>
#include <vector>
using namespace std;
int main() {
	int n;
	cin >> n;

	vector<int> freq(1000, 0);

	int temp;
	for (int i = 0; i < n; i++) {
		cin >> temp;
		freq[temp]++;
	}

	int maxReading = 0;
	int maxFrequency = freq[0];

	for (int i = 1; i < 1000; i++) {
		if (freq[i] > maxFrequency) {
			maxFrequency = freq[i];
			maxReading = i;
		}
	}

	cout << maxReading << endl;
}