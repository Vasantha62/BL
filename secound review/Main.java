
interface Person {
    void work();   
}


abstract class Human implements Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class Teacher extends Human {
    @Override
    public void work() {
        System.out.println(getName() + " (Teacher) is teaching");
    }
}


class Student extends Human {
    @Override
    public void work() {
        System.out.println(getName() + " (Student) is learning");
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("vasantha");  
        s.setAge(20);

        s.work();

        Teacher t = new Teacher();
        t.setName("rvs");  
        t.setAge(25);

        t.work();
    }
}
