package lti.spring.core;

public class Employee {

	// fields
	private int eid; // id, name, user, value,
	private String firstName;
	private double salary;

	void work() {
		System.out.println("Employee works...");

	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}
