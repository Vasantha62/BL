import java.util.Random;

class EmployeeWages {

    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    public static int getAttendance() {
        Random random = new Random();
        return random.nextInt(3);  
    }

    
    public static int computeWageForCompany(String company,
                                            int wagePerHour,
                                            int maxWorkingDays,
                                            int maxWorkingHours) {

        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        System.out.println("Computing Wages for Company: " + company + " ===");

        while (totalHours < maxWorkingHours && totalDays < maxWorkingDays) {
            totalDays++;

            int attendance = getAttendance();
            int hours = 0;

            switch (attendance) {
                case IS_FULL_TIME:
                    hours = 8;
                    System.out.println("Day " + totalDays + " : Full Time (8 hrs)");
                    break;
                case IS_PART_TIME:
                    hours = 4;
                    System.out.println("Day " + totalDays + " : Part Time (4 hrs)");
                    break;
                default:
                    hours = 0;
                    System.out.println("Day " + totalDays + " : Absent");
            }

            totalHours += hours;

            int dailyWage = hours * wagePerHour;
            totalWage += dailyWage;

            System.out.println("  Daily Wage: " + dailyWage);
        }

        System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Total Wage for " + company + ": " + totalWage);
        return totalWage;
    }
}

public class Emp {
    public static void main(String[] args) {

       
        EmployeeWages.computeWageForCompany(
                "TCS",
                20,      
                20,      
                100     
        );

      
        EmployeeWages.computeWageForCompany(
                "Infosys",
                25,     
                22,     
                110      
        );
        EmployeeWages.computeWageForCompany(
                "Wipro",
                30,      
                26,      
                120      
        );
    }
}
