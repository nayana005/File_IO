package com.bridgelabz;

import java.io.IOException;
import java.util.List;

public class EmployeePayrollService {
    private final List<EmployeePayroll> employeePayrollDataList;

    public enum IOService{
        CONSOLE_IO, FILE_IO
    }
    public EmployeePayrollService(List<EmployeePayroll> employeePayrollDataList) {
        this.employeePayrollDataList = employeePayrollDataList;
    }

    void writeEmployeePayrollData(IOService ioService) throws IOException {
        PayrollService payrollService = getEmployeePayrollObject(ioService);
        payrollService.write(employeePayrollDataList);
    }
    void readEmployeePayrollData(IOService ioService) throws IOException{
        PayrollService payrollService = getEmployeePayrollObject(ioService);
        payrollService.read();
    }
    public long countEntries(IOService ioService) throws IOException {
        PayrollService payrollService = getEmployeePayrollObject(ioService);
        return payrollService.countEntries();
    }

    private PayrollService getEmployeePayrollObject(IOService ioService) {
        PayrollService payrollService = null;
        if(IOService.FILE_IO.equals(ioService)){
            payrollService = new FileIO();
        }
        else if(IOService.CONSOLE_IO.equals(ioService)){
            payrollService = new ConsoleIO();
        }
        return payrollService;
    }
}
