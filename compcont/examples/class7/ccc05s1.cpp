#include <iostream>
#include <string>
using namespace std;
int main() {
	int n;
	cin >> n;

	string alphaToInt = "22233344455566677778889999";

	for (int c = 0; c < n; c++) {
		string str;
		cin >> str;

		string temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (str[i] == '-') {
				continue;
			}
			temp += str[i];
		}
		str = temp;

		str = str.substr(0, 10);

		for (int i = 0; i < str.length(); i++) {
			if (str[i] >= 'A' && str[i] <= 'Z') {
				str[i] = alphaToInt[str[i] - 'A'];
			}
		}

		cout << str.substr(0, 3) << "-" << str.substr(3, 3) << "-" << str.substr(6, 4) << endl;
	}
}