#include <iostream>
#include <string>
using namespace std;

int powerN(int base, int n) {
	if (n == 0) {
		return 1;
	}

	return base * powerN(base, n - 1);
}

string computeX(string s, int i) {
	if (s[i] == 'x') {
		return computeX(s, i + 1);
	}

	return s[i] + computeX(s, i + 1);
}

bool isPalindrome(string s) {
	if (s.length() <= 1) {
		return true;
	}

	if (s[0] != s[s.length() - 1]) {
		return false;
	}

	return isPalindrome(s.substr(1, s.length() - 1));
}

int main() {
	string a = "xxxderpxxx";

	computeX(a, 0);
}