#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main() {
	vector<int> vectorA;

	// Add stuff to vector
	vectorA.push_back(10);
	vectorA.push_back(50);
	vectorA.push_back(35);

	// Behaves just like an array
	vectorA[1] = vectorA[0] + vectorA[2];

	// You can get the size
	cout << "My vector has " << vectorA.size() << " integers." << endl;

	// Erasing 1 element at index 1
	vectorA.erase(vectorA.begin() + 1);

	// Clearing a vector
	vectorA.clear();

	// Check if its empty
	if (vectorA.empty()) {
		cout << "Good." << endl;
	} else {
		cout << "Uhoh..." << endl;
	}

	// Look up vector documentation for rest

	// Create a vector of size 10
	vector<double> vectorB(10);

	// Grab 10 doubles from input
	for (int i = 0; i < vectorB.size(); i++) {
		cin >> vectorB[i];
	}

	// Sort vectorB
	sort(vectorB.begin(), vectorB.end());

	// Declare, and initialize a vector of size 10, all empty
	vector<string> vectorC(10, "");

	// Declaring a 2D vector
	vector< vector<int> > vectorD;

	int rows = 5, columns = 6;

	// Manual way
	for (int i = 0; i < rows; i++) {
		vector<int> temp;
		for (int j = 0; j < columns; j++) {
			temp.push_back(0);
		}
		vectorD.push_back(temp);
	}

	// Semi-automatic way
	vector< vector<int> > vectorE;
	for (int i = 0; i < rows; i++) {
		vector<int> temp(columns, 0);
		vectorE.push_back(temp);
	}

	// Automatic, 1 line
	vector< vector<int> > vectorF(rows, vector<int>(columns, 0));

}