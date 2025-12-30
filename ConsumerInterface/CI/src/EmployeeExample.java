
import java.util.function.Consumer;

class Employee{
    String name ;
    int id;
    Employee(String name , int id){
        this.name = name ;
        this. id = id;
    }
}


public class EmployeeExample {
    public  static void main(String[] args){
        Employee emp = new Employee("vasantha" , 101);
        Consumer<Employee> printEmployee = e->System.out.println(e.id + " "+e.name);
        printEmployee.accept(emp);
    }
}
