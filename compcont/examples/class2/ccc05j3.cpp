#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {
	vector<string> directions;
	directions.push_back("HOME");

	string s = "";
	while (s != "SCHOOL") {
		cin >> s;
		directions.push_back(s);
	}

	for (int i = directions.size() - 2; i >= 0; i -= 2) {
		string direction;
		string street;

		if (directions[i] == "R") {
			direction = "LEFT";
		} else {
			direction = "RIGHT";
		}

		street = directions[i - 1];

		if (street != "HOME") {
			cout << "Turn " << direction << " onto " << street << " street." << endl;
		} else {
			cout << "Turn " << direction << " into your " << street << "." << endl;
		}
	}
}