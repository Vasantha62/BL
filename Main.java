 class Employee{  
 float salary;  
}  
class Programmer extends Employee{  
 int bonus;  
}  
public class Main{  
 public static void main(String args[]){  
   Programmer p = new Programmer();  
   p.salary = 40000;
   p.bonus = 1000;
   System.out.println(p.salary);
   System.out.println(p.bonus);
 }
}  