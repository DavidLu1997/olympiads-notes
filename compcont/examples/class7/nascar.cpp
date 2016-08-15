#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

struct driver {
	string lastName;
	int number;
	int score;
}

bool compareDriver(driver a, driver b) {
	return a.score < b.score;
}

int main() {
	int n;
	cin >> n;

	vector<driver> drivers;
	driver temp;
	for (int i = 0; i < n; i++) {
		cin >> temp.lastName >> temp.number >> temp.score;
		drivers.push_back(temp);
	}

	sort(drivers.begin(), drivers.end(), compareDriver);

	for (int i = 0; i < n; i++) {
		cout << i+1 << ". " << drivers[i].lastName << " " << drivers[i].number << " " << drivers[i].score << endl;
	}
}