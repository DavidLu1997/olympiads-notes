#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;
int main() {
	vector<int> numWays(13, 0);
	vector<int> distance = {0, 990, 1010, 1970, 2030, 2940, 3060, 3930, 4060, 4970, 5030, 5990, 6010, 7000};

	int a, b, m, t;
	cin >> a >> b >> m;
	for (int i = 0; i < m; i++) {
		cin >> t;
		distance.push_back(t);
		numWays.push_back(0);
	}

	//Sort distance vector
	sort(distance.begin(), distance.end());

	numWays[0] = 1;
	queue<int> motels;
	motels.push(0);
	int cm;
	while (!motels.empty()) {
		cm = motels.front();
		motels.pop();

		for (int i = cm; distance[i] <= distance[cm] + b; i++) {
			if (distance[i] - distance[cm] >= a) {
				motels.push(i);
				numWays[i] += numWays[cm];
			}
		}
	}

	cout << numWays[distance.size() - 1] << endl;
}