#include <iostream>
#include <string>
#include <cmath>
using namespace std;

bool isVowel(char c) {
	return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}

bool isConsonant(char c) {
	return !isVowel(c);
}

char closestConsonant(char c) {
	if (c == 'z') {
		return 'z';
	}

	c++;
	if (!isConsonant(c)) {
		c++;
	}

	return c;
}

char closestVowel(char c) {
	int len = 100;
	char closest = ' ';
	if (abs(c - 'a') < len) {
		len = abs(c - 'a');
		closest = 'a';
	}
	if (abs(c - 'e') < len) {
		len = abs(c - 'e');
		closest = 'e';
	}
	if (abs(c - 'i') < len) {
		len = abs(c - 'i');
		closest = 'i';
	}
	if (abs(c - 'o') < len) {
		len = abs(c - 'o');
		closest = 'o';
	}
	if (abs(c - 'u') < len) {
		len = abs(c - 'u');
		closest = 'u';
	}

	return closest;
}

int main() {
	string str, output = "";
	getline(cin, str);

	for (int i = 0; i < str.length() i++) {
		if (isVowel(str[i])) {
			output += str[i];
		} else {
			output += str[i];
			output += closestVowel(str[i]);
			output += closestConsonant(str[i]);
		}
	}

	cout << output << endl;
}