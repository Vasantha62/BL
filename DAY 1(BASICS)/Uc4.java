public class Uc4{

    public static final int is_part_time = 1;
    public static final int is_full_time = 2;
    public static final int emp_rate_perhour = 20;

    public static void main(String[] args) {

        int emp_hours = 0;
        int emp_wages = 0;

       
        int empcheck = is_part_time;  

        switch (empcheck) {
            case is_full_time:
                emp_hours = 8;
                break;

            case is_part_time:
                emp_hours = 4;
                break;

            default:
                emp_hours = 0;
        }

        emp_wages = emp_hours * emp_rate_perhour;
        System.out.println("Emp Wage is: " + emp_wages);
    }
}


