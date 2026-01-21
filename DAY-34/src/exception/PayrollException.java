package exception;

public class PayrollException extends Exception{
    public PayrollException(String message){
        super(message);
    }
    public PayrollException(String message , Throwable clause){
        super(message, clause);
    }
}
