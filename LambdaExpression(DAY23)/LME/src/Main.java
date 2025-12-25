public class Main {

    public static void main(String[] args) {


        MathOperation  add = (int a, int b) -> a +b;


        MathOperation subtract = (a, b) -> a - b; //lambda

        MathOperation division = (int a, int b) -> a/b; //lambda

        System.out.println("Addition: " + add.calculate(10, 5));
        System.out.println("Subtraction: " + subtract.calculate(10, 5));
        System.out.println("division:" +division.calculate(10 , 15));

    }
}
