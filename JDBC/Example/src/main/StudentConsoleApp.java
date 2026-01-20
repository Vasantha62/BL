package main;



import dao.StudentDAO;
import dao.StudentDAOImpl;
import model.Student;

import java.util.Scanner;

public class StudentConsoleApp {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAOImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();

                    dao.addStudent(new Student(name, branch));
                    System.out.println("Student Added");
                    break;

                case 2:
                    dao.getAllStudents().forEach(s ->
                            System.out.println(
                                    s.getId() + " " +
                                            s.getName() + " " +
                                            s.getBranch()
                            )
                    );
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Branch: ");
                    String newBranch = sc.nextLine();

                    dao.updateStudent(id, newBranch);
                    System.out.println("Student Updated");
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int delId = sc.nextInt();

                    dao.deleteStudent(delId);
                    System.out.println("Student Deleted");
                    break;

                case 5:
                    sc.close();
                    System.out.println("Application Closed");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
