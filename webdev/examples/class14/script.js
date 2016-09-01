function cost() {
	var burgers = Number(document.getElementById('burger').value);
	var cheese = Number(document.getElementById('cheese').value);
	var fries = Number(document.getElementById('fries').value);
	var drinks = Number(document.getElementById('drinks').value);
	var shakes = Number(document.getElementById('shake').value);

	var price = burgers * 1.00 + cheese * 1.10 + fries * 1.00 + drinks * 0.80 + shakes * 1.20;

	var output;

	if (price == 0) {
		output = 'You ordered nothing! You cheap person!';
	} else {
		output = 'Your order costs $' + price;
	}

	document.getElementById('output').innerHTML = output;

	return false;
}