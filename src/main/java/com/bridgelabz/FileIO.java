package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileIO implements PayrollService {
	private final String FILE_PATH = "C:\\Users\\nayan\\OneDrive\\Desktop\\JavaProjects\\EmpPayroll_FileIO\\src\\main\\java\\com\\bridgelabz\\Payroll.txt";

	public void read() {

	}

	public boolean write(List<EmployeePayroll> employeePayrollDataList) throws IOException {
		StringBuffer buffer = new StringBuffer();
		employeePayrollDataList.forEach(empData -> {
			String empDataString = empData.toString().concat("\n");
			buffer.append(empDataString);
		});
		Path path = Files.write(Paths.get(FILE_PATH), buffer.toString().getBytes());
		return (path == null) ? false : true;
	}

	public long countEntries() throws IOException {
		return Files.lines(new File(FILE_PATH).toPath()).count();
	}
}
