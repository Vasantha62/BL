//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        MathOperation addition = new MathOperation()  //Anonymous

        {
            @Override
            public  int operate(int a , int b){
                return a+b;
            }

        };   //Anonymous  (dont have class name )
        MathOperation subtraction  = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a-b;
            }
        };
        MathOperation division = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a/b;
            }
        };
        int result = addition.operate(10 , 5);
        int sub = subtraction.operate(10, 15);
        int result2 = division.operate(10 , 5);
        System.out.println("addition "+result);
        System.out.println("subtract"+ sub);
        System.out.println("division:"+result2);


    }
}