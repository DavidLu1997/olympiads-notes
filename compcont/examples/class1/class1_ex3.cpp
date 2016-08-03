// Copyright David Lu 2016
// Prepared for Computer Contest Level 1 at Olympiads School
// See Olympiads.ca for more information

// FOR LOOPS

// This will output 0 1 2 3 4
for (int i = 0; i < 5; i++) {
	cout << i << " ";
}

// This will output 0 2 4 6 10
for (int i = 0; i <= 10; i+=2) {
	cout << i << " ";
}

// WHILE LOOPS

// This will output 0 1 2 3 4
int x = 0;
while (x < 5) {
	cout << x << " ";
	x++;
}

// This will output abcdefghijklmnopqrstuvwxyz
char alpha = 'a';
while (alpha <= 'z') {
	cout << alpha;
	alpha++;
}

// This will crash
while (true) {
	cout << "MWHAHAHAHAHAHAHA" << endl;
}

// DO-WHILE LOOPS

// This will print 10
int x = 10;
do {
	cout << x << endl;
} while (x < 10);

// This will print 0 1 2 3 4
int x = 0;
do {
	cout << x << " ";
	x++;
} while(x < 5);

// BREAKS AND CONTINUES

// This will output 0 1 3 4 5
for (int i = 0; i < 6; i++) {
	if (i == 2) {
		continue;
	}

	cout << i << " ";
}

// This will output 0 1 2
for (int i = 0; i < 5; i++) {
	if (i == 3) {
		break;
	}

	cout << i << " ";
}