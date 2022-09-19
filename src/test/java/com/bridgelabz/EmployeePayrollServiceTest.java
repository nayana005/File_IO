package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollServiceTest {
    @Test
    public void givenFileShouldMatchEmployeeCount() throws IOException {
        EmployeePayroll employeePayrollData1 = new EmployeePayroll(1,"Nayana", 50000);
        EmployeePayroll employeePayrollData2 = new EmployeePayroll(2,"Chaithra", 30000);
        EmployeePayroll employeePayrollData3 = new EmployeePayroll(3,"Monii", 40000);

        List<EmployeePayroll> employeePayrollDataList = new ArrayList<>();
        employeePayrollDataList.add(employeePayrollData1);
        employeePayrollDataList.add(employeePayrollData2);
        employeePayrollDataList.add(employeePayrollData3);
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollDataList);
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        long count = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assert.assertEquals(3,count);
    }
}
