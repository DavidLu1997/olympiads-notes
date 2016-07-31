#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
	int m, n;
	cin >> m >> n;

	vector<string> adject;
	vector<string> noun;
	string s;

	for (int i = 0; i < m; i++) {
		cin >> s;
		adject.push_back(s);
	}

	for (int i = 0; i < n; i++) {
		cin >> s;
		noun.push_back(s);
	}

	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			cout << adject[i] << " as " << noun[j] << endl;
		}
	}
}