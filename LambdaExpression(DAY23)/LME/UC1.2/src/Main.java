public class Main {
    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a + b;

        MathOperation subtraction = (a, b) -> a - b;

        MathOperation division = (a, b) -> {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
                return 0;
            }
            return a / b;
        };


        showResult(10, 5, addition);      // Addition
        showResult(10, 5, subtraction);   // Subtraction
        showResult(10, 5, division);      // Division
        showResult(10, 0, division);      // Division by zero
    }


    public static void showResult(int a, int b, MathOperation operation) {
        int result = operation.operate(a , b);
        System.out.println("Result: " + result);
    }
}
