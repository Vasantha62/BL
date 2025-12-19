import java.util.Random;
public class Emp {
    public static void main(String[] args){
        final int WAGE_PER_HOUR = 20 ;
        final int FULL_DAY_HOUR = 8 ;
        final int PART_TIME_Hour = 8 ;
        final int WORKING_DAYS_PER_MONTH = 20;
        final   int FULL_TIME = 1;
         final int PART_TIME = 2;
        int totalWage = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays =0;
      Random random = new Random();
      while(totalWorkingHours<100 && totalWorkingDays <20){
         int attendance = random.nextInt(3);
          int WorkingHours = 0;
            switch(attendance){
                case FULL_TIME:
                    WorkingHours = FULL_DAY_HOUR;
                    break;
                 case PART_TIME:
                    WorkingHours = PART_TIME_Hour;
                    break;
                    default:
                        WorkingHours = 0;
              }
              totalWorkingDays++;
              totalWorkingHours += WorkingHours;
              int dailyWage = WorkingHours*WAGE_PER_HOUR;
               totalWage += dailyWage;
               System.out.println("Day"+totalWorkingDays+"hours"+WorkingHours+"dailywage"+dailyWage+"totalhours"+totalWorkingHours);
      }
      System.out.println("totalworkingdays"+totalWorkingDays);
      System.out.println("totalworkinghours"+totalWorkingHours);
      System.out.println("totalmonthlywage"+totalWage);
    }
}