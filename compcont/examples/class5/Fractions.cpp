#include <iostream>
using namespace std;

int gcf(int a, int b) {
	if (a == 0) {
		return b;
	}
	if (b == 0) {
		return a;
	} else {
		return gcf(b, a % b);
	}
}

int main() {
	int num, den;
	cin >> num >> den;

	int whole = num / den;
	int rem = num % den;

	int newRem = rem / gcf(rem, den);
	int newDen = den / gcf(rem, den);

	if (whole != 0) {
		cout << whole << " ";
	}

	if (newRem != 0) {
		cout << newRem << "/" << newDen;
	} else {
		cout << "0";
	}

	cout << endl;
}