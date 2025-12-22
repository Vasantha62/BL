import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks; // ascending order
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Vasantha", 77));
        students.add(new Student("Manju", 80));
        students.add(new Student("Manu", 90));
        students.add(new Student("Abc", 88));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
