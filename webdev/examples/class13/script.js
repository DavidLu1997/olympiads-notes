function add() {
	var a = Number(document.getElementById('a').value);
	var b = Number(document.getElementById('b').value);

	document.getElementById('output').innerHTML = a + b;

	return false;
}

function subtract() {
	var a = Number(document.getElementById('a').value);
	var b = Number(document.getElementById('b').value);

	document.getElementById('output').innerHTML = a - b;

	return false;
}

function multiply() {
	var a = Number(document.getElementById('a').value);
	var b = Number(document.getElementById('b').value);

	document.getElementById('output').innerHTML = a * b;

	return false;
}

function divide() {
	var a = Number(document.getElementById('a').value);
	var b = Number(document.getElementById('b').value);

	var output;

	if (b == 0) {
		output = 'NO DIVISION BY ZERO';
	} else if (a == 0 && b == 0) {
		output = 'NO DIVIDING ZERO BY ZERO';
	} else if (b == 1) {
		output = 'Y U DIVIDE BY ONE';
	} else if (a == 0) {
		output = 'ZERO DIVIDED BY ANYTHING IS ZERO';
	} else {
		output = a / b;
	}

	document.getElementById('output').innerHTML = output;

	return false;
}