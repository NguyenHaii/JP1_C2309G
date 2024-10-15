package ExceptionValidation;

public class ProDuctNotEnoughException extends RuntimeException{
    public ProDuctNotEnoughException(){;}
    public ProDuctNotEnoughException(String message){
        super(message);
    }
    public ProDuctNotEnoughException(String message, Throwable cause){
        super(message, cause);
    }
}
