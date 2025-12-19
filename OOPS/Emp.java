import java.util.Random;

class EmployeeWages {

    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 8;
    static final int WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static int getAttendance() {
        Random random = new Random();
        return random.nextInt(3);   
    }

    public static int computegetDailyWages() {
        int attendance = getAttendance();
        int hours = 0;

        switch (attendance) {
            case IS_FULL_TIME:
                System.out.println("Employee is Present (Full Time)");
                hours = FULL_DAY_HOUR;
                break;

            case IS_PART_TIME:
                System.out.println("Employee is Present (Part Time)");
                hours = PART_TIME_HOUR;
                break;

            default:
                System.out.println("Employee is Absent");
                hours = 0;
        }

        return hours * WAGE_PER_HOUR;
    }

    public static int computeMonthlyWage() {
        int MonthlyWage = 0;

        for (int day = 1; day <= WORKING_DAYS; day++) {
            int daily = computegetDailyWages();
            MonthlyWage += daily;
        }

        return MonthlyWage;
    }

    public static int computTillCondition() {
        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        while (totalHours < MAX_WORKING_HOURS && totalDays < WORKING_DAYS) {
            totalDays++;

            int attendance = getAttendance();
            int hours = 0;

            switch (attendance) {
                case IS_FULL_TIME:
                    hours = FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    hours = PART_TIME_HOUR;
                    break;
                default:
                    hours = 0;
            }

            totalHours += hours;   
            totalWage += hours * WAGE_PER_HOUR;
        }

        return totalWage;
    }
}

public class Emp {
    public static void main(String[] args) {

        System.out.println("---- Daily Wage ----");
        System.out.println("Daily Employee Wage: " + EmployeeWages.computegetDailyWages());

        System.out.println(" Monthly Wage (20 Days) ----");
        System.out.println("Monthly Employee Wage: " + EmployeeWages.computeMonthlyWage());

        System.out.println("---- Wage Till 100 Hours OR 20 Days ----");
        System.out.println("Total Employee Wage: " + EmployeeWages.computTillCondition());
    }
}

