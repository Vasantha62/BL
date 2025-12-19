 interface Person{
   void work();
 
 }
 class Teacher implements Person{
    public void work(){
        System.out.println("Teacher is working");
    }

 }

class Student extends Teacher
{
   public void work()
    {
        System.out.println("student is learning");
    }
}

public class q1{
    public static void main(String[] args){
        Student s = new Student();
       // Teacher t = new Teacher();             
          s.work();
          s.work();
    }
}