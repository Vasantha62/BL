public class Uc3 {
    public static void main(String[] args) {

        int is_part_time = 1;
        int is_full_time = 2;
        int emp_rate_perhour = 20;

        int emp_hours = 0;
        int emp_wages = 0;

        int empcheck = (int)Math.floor(Math.random() * 10) % 3;

        if (empcheck == is_full_time) {
            emp_hours = 8;
        } else if (empcheck == is_part_time) {
            emp_hours = 4;
        } else {
            emp_hours = 0;
        }

        emp_wages = emp_hours * emp_rate_perhour;

        System.out.println("Emp Wage is: " + emp_wages);
    }
}
