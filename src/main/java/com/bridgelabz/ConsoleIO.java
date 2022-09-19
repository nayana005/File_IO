package com.bridgelabz;

import java.util.List;
import java.util.Scanner;

public class ConsoleIO implements PayrollService {
	static Scanner scanner = new Scanner(System.in);

	@Override
	public void read() {
		System.out.println("Enter employee id");
		int id = scanner.nextInt();
		System.out.println("Enter employee name");
		String name = scanner.next();
		System.out.println("Enter employee salary");
		long salary = scanner.nextLong();
		EmployeePayroll employeePayroll= new EmployeePayroll(id, name, salary);
		System.out.println(employeePayroll);
	}

	public boolean write(List<EmployeePayroll> employeePayrollDataList) {
		employeePayrollDataList.forEach(employeePayrollData -> System.out.println(employeePayrollData));
		return true;
	}

	@Override
	public long countEntries() {
		return 0;
	}
}
