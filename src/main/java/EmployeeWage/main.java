package EmployeeWage;

public class main {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HRS_IN_MONTH = 10;
    public  final String company;
    public  final int empRatePerHour;
    public  final int numOfWorkingDays;
    public  final int maxHoursPerMonth;
    private static int totalEmpWage;


    // ---------------------------- UC_1 checkAttendance ----------------------------------------------

    static void checkAttendance(){
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random()*10)%2;
        if (empCheck > IS_FULL_TIME) {
            System.out.println("Employee is present.");
        } else {
            System.out.println("Employee is absent.");
        }
    }

    // ---------------------------- UC_2 CalculateDailyWage ----------------------------------------------

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


    // ---------------------------- UC_3 CalculatePartTimeWage ----------------------------------------------

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


    // ---------------------------- UC_4 CalculateEmployeeWageSwitch ----------------------------------------------

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


    // ---------------------------- UC_5 CalculateEmployeeMonthWage ----------------------------------------------

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



    // ---------------------------- UC_6 CalculateEmployeeWageTillReachedWorkingDays ----------------------------------------------

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


    // ---------------------------- UC_7 computeEmpWageClaaMethod ----------------------------------------------

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


    // ---------------------------- UC_8 MultipleCompany ----------------------------------------------

        public static int MultipleCompany(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
            // Variables
            int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
            // Computation
            while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
            int totalEmpWage = totalEmpHrs * empRatePerHour;
            System.out.println("Total Emp Wage for Company: " + company + " is: " + totalEmpWage);
            return totalEmpWage;
        }

        

// ---------------------------- UC_9 EmployeeWageAndSaveTotalWageByCompany ----------------------------------------------
public main(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
    this.company = company;
    this.empRatePerHour = empRatePerHour;
    this.numOfWorkingDays = numOfWorkingDays;
    this.maxHoursPerMonth = maxHoursPerMonth;
    this.totalEmpWage = 0;
}

    public void computeEmpWage() {
        // variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        // Computation
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
            System.out.println("Days: " + totalWorkingDays + " Emp Hrs: " + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage for Company: " + company + " is: " + totalEmpWage);
    }

    @Override
    public String toString() {
        return "Total Emp Wage for Company: " + company + " is: " + totalEmpWage;
    }



    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation problem");
        System.out.println("----------------------- UC_1 -----------------------");
        checkAttendance();

        System.out.println("----------------------- UC_2 -----------------------");
        CalculateDailyWage();

        System.out.println("----------------------- UC_3 -----------------------");
        CalculatePartTimeWage();

        System.out.println("----------------------- UC_4 -----------------------");
        CalculateEmployeeWageSwitch();

        System.out.println("----------------------- UC_5 -----------------------");
        CalculateEmployeeMonthWage();

        System.out.println("----------------------- UC_6 -----------------------");
        CalculateEmployeeWageTillReachedWorkingDays();

        System.out.println("----------------------- UC_7 -----------------------");
        computeEmpWageClaaMethod();

        System.out.println("----------------------- UC_8 -----------------------");
        MultipleCompany("DMart", 20, 2, 10);
        MultipleCompany("Reliance", 10, 4, 20);

        System.out.println("----------------------- UC_9 -----------------------");
        main dMart = new main("DMart", 20, 2, 10);
        main reliance = new main("Reliance", 10, 4, 20);
        dMart.computeEmpWage();
        System.out.println(dMart);
        reliance.computeEmpWage();
        System.out.println(reliance);
    }
}
