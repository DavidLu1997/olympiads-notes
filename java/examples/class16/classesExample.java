public class classesExample {
	public static void main(String[] args) {
		Employee paul = new Employee();
		paul.id = 2500;
		paul.name = "Paul";
		paul.salary = 1000;

		Employee bob = new Employee(420, "Bob Marley", 420);
		int bobMonthlySalary = bob.getMonthlySalary();

	}
}

class Employee {
	public int id;
	public String name;
	public int salary;

	public Employee() {
		id = 0;
		name = "";
		salary = 0;
	}

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getMonthlySalary() {
		return salary / 12;
	}

	public String toString() {
		return id + " " + name + " $" + salary;
	}
}