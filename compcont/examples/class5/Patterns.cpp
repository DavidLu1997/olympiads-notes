#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;
int main() {
	int cases;
	cin >> cases;
	for (int NUM = 0; NUM < cases; NUM++) {
		int n, k;
		cin >> n >> k;

		//String with length n, k 1s, n-k 0s
		string s;
		for (int i = 0; i < n-k; i++) {
			s += "0";
		}
		for (int i = 0; i < k; i++) {
			s += "1";
		}

		vector<string> v;

		do {
			v.push_back(s);
		} while(next_permutation(s.begin(), s.end()));

		for (int i = v.size() - 1; i >= 0; i--) {
			cout << v[i] << endl;
		}
	}
}