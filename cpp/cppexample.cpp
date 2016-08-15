#include <iostream>
#include <cmath>
using namespace std;

void realTime(int seconds) {
	int hrs = 0;
	int min = 0;
	int sec = 0;

	hrs = seconds / 3600;
	seconds %= 3600;
	min = seconds / 60;
	sec = seconds % 60;

	cout << "Hours: " << hrs << endl;
	cout << "Minutes: " << min << endl;
	cout << "Seconds: " << sec << endl;
}

// unsigned long long holds 2^64 - 1 or 2^128 - 1 depending on system
// Search up BigInt in Boost
unsigned long long factorial(int n) {
	unsigned long long product = 1;
	for (int i = n; i > 1; i--) {
		product *= i;
	}
	return product;
}

bool isPrime(int n) {
	for (int i = 2; i <= sqrt(n); i++) {
		if (n % i == 0) {
			return false;
		}
	}
	return true;
}

int nthPrime(int n) {
	int counter = 0;
	int current = 0;
	int lastPrime = 0;

	while (counter <= n) {
		if (isPrime(current)) {
			counter++;
			lastPrime = current;
		}
		current++;
	}

	return lastPrime;
}

int main() {
	realTime(6969);
}








