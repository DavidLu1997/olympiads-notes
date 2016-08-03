
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