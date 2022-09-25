package com.bridgelabz;

public class EmployeePayroll {

	private final int id;
	private final String name;
	private final long salary;

	public EmployeePayroll(int id, String name, long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayroll{" +
				"id=" + id +
				", name='" + name + '\'' +
				", salary=" + salary +
				'}';
	}
}
