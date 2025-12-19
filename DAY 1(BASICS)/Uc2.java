public class Uc2 {
    public static void main(String[] args) {

        int wagePerHour = 20;
        int fullDayHours = 8;
        int partTimeHours = 8;

        int fullTimeWage = wagePerHour * fullDayHours;
        int partTimeWage = wagePerHour * partTimeHours;
        int dailywages = wagePerHour + fullDayHours ;

        System.out.println("Full-Time Wage :" + fullTimeWage);
        System.out.println("Part-Time Wage :" + partTimeWage);

    }
}
