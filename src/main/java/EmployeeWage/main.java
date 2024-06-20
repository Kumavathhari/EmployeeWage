package EmployeeWage;

public class main {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HRS_IN_MONTH = 10;

    static void checkAttendance(){
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random()*10)%2;
        if (empCheck > IS_FULL_TIME) {
            System.out.println("Employee is present.");
        } else {
            System.out.println("Employee is absent.");
        }
    }

    static void CalculateDailyWage(){
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random()*10)%2;
        if (empCheck == IS_FULL_TIME) {
            empHrs = 8;
        }
        else{
            empHrs =0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage : "+empWage);
    }


    static void CalculatePartTimeWage(){
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random()*10)%3;
        if (empCheck == IS_PART_TIME) {
            empHrs = 4;
        } else if (empCheck == IS_FULL_TIME){
            empHrs = 8;
        }else {
            empHrs =0;
        }
        empWage = empHrs*EMP_RATE_PER_HOUR;
        System.out.println("Part-Time Employee Wage : " + empWage);
    }


    static void CalculateEmployeeWageSwitch() {
        int empHrs = 0;
        int empWage = 0;
        // Computation
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            case IS_PART_TIME:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
                empWage = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);
    }


    static void CalculateEmployeeMonthWage() {
        int empHrs = 0; int empWage = 0; int totalEmpWages = 0;
        for (int day = 0;day < NUM_OF_WORKING_DAYS;day++){
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs* EMP_RATE_PER_HOUR;
            totalEmpWages += empWage;
            System.out.println("Total Emp wage : " + totalEmpWages);
        }
    }



    static void CalculateEmployeeWageTillReachedWorkingDays() {
            int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

            // Computation
            while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
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
                System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
            }

            int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
            System.out.println("Total Emp Wage: " + totalEmpWage);
        }


        public static int computeEmpWageClaaMethod() {
            // Variables
            int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

            // Computation
            while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
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
                System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
            }

            int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
            System.out.println("Total Emp Wage: " + totalEmpWage);
            return totalEmpWage;
        }


    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation problem");
        checkAttendance();
        CalculateDailyWage();
        CalculatePartTimeWage();
        CalculateEmployeeWageSwitch();
        CalculateEmployeeMonthWage();
        CalculateEmployeeWageTillReachedWorkingDays();
        computeEmpWageClaaMethod();
    }
}
