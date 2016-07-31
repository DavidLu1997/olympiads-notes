// Copyright David Lu 2016
// Prepared for Computer Contest Level 1 at Olympiads School
// See Olympiads.ca for more information

#include <iostream>

using namespace std;

int main() {
	int mature[13];
	int baby[13];

	mature[0] = 0;
	baby[0] = 2;

	for(int i = 1; i <= 12; i++) {
		mature[i] = mature[i - 1] + baby[i - 1];
		baby[i] = mature[i - 1];

		cout << "Month #" << i << ": " << mature[i] << " mature rabbits, and " << baby[i] << " baby rabbits." << endl;
	}
}