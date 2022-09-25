package com.bridgelabz;

import java.io.IOException;
import java.util.List;

public interface PayrollService {
	void read();

	boolean write(List<EmployeePayroll> employeePayrollDataList) throws IOException;

	long countEntries() throws IOException;
}
