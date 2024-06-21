package EmployeeWage;

public interface IComputeEmpWage {
    void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
    void computeEmpWage();
    int getTotalWageByCompany(String company);
}
