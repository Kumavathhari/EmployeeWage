package EmployeeWage;

import java.util.ArrayList;
import java.util.List;

public class EmpWageBuilder implements IComputeEmpWage{
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private List<CompanyEmpWage> companyEmpWageList;

    public EmpWageBuilder() {
        companyEmpWageList = new ArrayList<>();
    }

    // Inner class for storing company-specific details
    public static class CompanyEmpWage {
        public final String company;
        public final int empRatePerHour;
        public final int numOfWorkingDays;
        public final int maxHoursPerMonth;
        public int totalEmpWage;
        public List<Integer> dailyWages;

        public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
            this.company = company;
            this.empRatePerHour = empRatePerHour;
            this.numOfWorkingDays = numOfWorkingDays;
            this.maxHoursPerMonth = maxHoursPerMonth;
            this.dailyWages = new ArrayList<>();
            this.totalEmpWage = 0;
        }

        public void addDailyWage(int dailyWage) {
            dailyWages.add(dailyWage);
        }

        public void setTotalEmpWage(int totalEmpWage) {
            this.totalEmpWage = totalEmpWage;
        }

        @Override
        public String toString() {
            return "Total Emp Wage for Company: " + company + " is: " + totalEmpWage;
        }

        public String getDailyWagesString() {
            StringBuilder dailyWagesStr = new StringBuilder("Daily Wages for " + company + ": ");
            for (int wage : dailyWages) {
                dailyWagesStr.append(wage).append(" ");
            }
            return dailyWagesStr.toString();
        }
    }

    @Override
    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        companyEmpWageList.add(companyEmpWage);
    }

    @Override
    public void computeEmpWage() {
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
            System.out.println(companyEmpWage.getDailyWagesString());
        }
    }

    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            int dailyWage = empHrs * companyEmpWage.empRatePerHour;
            companyEmpWage.addDailyWage(dailyWage);
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs + " Daily Wage: " + dailyWage);
        }
        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }

    @Override
    public int getTotalWageByCompany(String company) {
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            if (companyEmpWage.company.equals(company)) {
                return companyEmpWage.totalEmpWage;
            }
        }
        return -1; // Company not found
    }

    public static void main(String[] args) {
        IComputeEmpWage empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
        empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
        empWageBuilder.computeEmpWage();

        // Query total wages by company
        System.out.println("Total wage for DMart: " + empWageBuilder.getTotalWageByCompany("DMart"));
        System.out.println("Total wage for Reliance: " + empWageBuilder.getTotalWageByCompany("Reliance"));
    }
}
