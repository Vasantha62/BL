class Student {
    String sid;
    long sphoneNumber;
    int age;

    // Constructor 1 (without age)
    Student(String sid, long sphoneNumber) {
        this.sid = sid;
        this.sphoneNumber = sphoneNumber;
    }

    // Constructor 2 (with age)
    Student(String sid, long sphoneNumber, int age) {
        this.sid = sid;
        this.sphoneNumber = sphoneNumber;
        this.age = age;
    }

    // Display method
    void Display() {
        System.out.println("The student id is: " + sid +
                           ", The student phone number is: " + sphoneNumber +
                           ", The student age is: " + age);
    }
}

public class C{
    public static void main(String[] args) {
        
        
        Student s1 = new Student("S101", 9876543210L);


        Student s2 = new Student("S102", 9876500000L, 21);

        s1.Display();
        s2.Display();
    }
}
